package com.nowcoder.community;


import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class LoggerTests {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerTests.class);

    @Test
    public void testLogger() {

//        System.out.println("///////////////////");
//        System.out.println(LOGGER.getName());
//
//
//        LOGGER.debug("debug log");
//        LOGGER.info("info log");
//        LOGGER.warn("warn log");
//        LOGGER.error("error log");

        System.out.println("========================");

        log.debug("debug log");
        log.info("info log");
        log.warn("warn log");
        log.error("error log");
    }
}
