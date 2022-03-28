package com.nowcoder.community.config;

import com.google.code.kaptcha.Producer;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import lombok.Builder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @author ZHB
 * @create 2022-03-28 14:25
 */

/**
 * 使用于生成验证码
 */
@Configuration
public class kaptchaConfig {

    @Bean
    public Producer kaptchaProducer(){
        Properties properties =  new Properties();
        properties.setProperty("kaptcha.image.width","100");
        properties.setProperty("kaptcha.image.height","40");
        properties.setProperty("kaptcha.textproducer.font.size","32");
        properties.setProperty("kaptcha.textproducer.font.color","0,0,0");//0,0,0 是RGB中的黑色
        properties.setProperty("kaptcha.textproducer.char.string","0123456789ABCDEFGHIJKLMNOBQRSTUVKSYZ");
        properties.setProperty("kaptcha.textproducer.char.length","4");
        properties.setProperty("kaptcha.noise.impl","com.google.code.kaptcha.impl.NoNoise");

        DefaultKaptcha kaptcha = new DefaultKaptcha();
        Config config = new Config(properties);
        kaptcha.setConfig(config);
        return kaptcha;
    }
}
