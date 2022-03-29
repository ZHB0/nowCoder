package com.nowcoder.community.util;

import com.nowcoder.community.entity.User;
import org.springframework.stereotype.Component;

/**
 * @author ZHB
 * @create 2022-03-29 18:01
 */

/**
 *  ThreadLocal 起到容器的作用
 * 持有用户信息，用于代替session对象
 */
@Component
public class HostHoder {

    private ThreadLocal<User> users = new ThreadLocal<>();

    public void setUser(User user){
        users.set(user);
    }

    public User getUser(){
        return users.get();
    }

    public void clear(){
        users.remove();
    }
}
