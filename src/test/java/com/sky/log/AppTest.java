package com.sky.log;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Test
    public void test01() {

        // 日志级别:trace<debug<info<warn<error
        logger.trace("logger - trace");
        logger.debug("logger - debug");
        logger.info("logger - info");
        logger.warn("logger - warn");
        logger.error("logger - error");

    }
}
