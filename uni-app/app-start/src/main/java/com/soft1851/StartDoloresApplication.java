package com.soft1851;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StopWatch;

/**
 * 项目启动类
 *
 * @author zouyaowen
 * @date 2020-05
 */
@SpringBootApplication
@Slf4j
public class StartDoloresApplication {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch("Dolores Application");
        stopWatch.start("Dolores Application");
        SpringApplication.run(StartDoloresApplication.class, args);
        stopWatch.stop();
        log.info("启动耗时={}秒",stopWatch.getTotalTimeSeconds());
        log.info(stopWatch.prettyPrint());
    }
}
