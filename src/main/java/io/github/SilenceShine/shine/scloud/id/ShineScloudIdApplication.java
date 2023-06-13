package io.github.SilenceShine.shine.scloud.id;

import io.github.SilenceShine.shine.util.log.LogUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author SilenceShine
 * @github <a href="https://github.com/SilenceShine">SilenceShine</a>
 * @since 1.0
 */
@SpringBootApplication
public class ShineScloudIdApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(ShineScloudIdApplication.class, args);
            LogUtil.info(ShineScloudIdApplication.class, "shine-scloud-id 启动成功!");
        } catch (Exception e) {
            LogUtil.error(ShineScloudIdApplication.class, "shine-scloud-id 启动失败:{}", e.getMessage());
        }
    }

}
