package com.nowcoder.community.dao;

import com.nowcoder.community.entity.LoginTicket;
import org.apache.ibatis.annotations.*;

/**
 * @author ZHB
 * @create 2022-03-29 9:53
 */


/**
 *  使用注解方式的 SQL语句
 *
 *  确定，当表进行一对多或一对一查询时，显示比较冗余，整体不简洁
 */
@Mapper
public interface LoginTicketMapper {

    @Insert({
            "insert into login_ticket(user_id,ticket,status,expired) ",
            "values(#{userId},#{ticket},#{status},#{expired})"
    })
    @Options(useGeneratedKeys = true,keyProperty = "id")//声明将库中自增的字段，返回到类包下指定属性
    int insertLoginTicket(LoginTicket loginTicket);

    @Select({
            "select id,user_id,ticket,status,expired ",
            "from login_ticket where ticket = #{ticket}"
    })
    LoginTicket selectByTicket(String ticket);


    //在注解中使用动态sql，需要先套"<script>" "</script>"
    @Update({
            "<script>",
            "update login_ticket set status=#{status} where ticket = #{ticket} ",
            "<if test=\"ticket!=null\">",
            "and 1 = 1",
            "</if>",
            "</script>"
    })
    int updateStatus(String ticket,int status);//int类型是返回被更新的数目
}
