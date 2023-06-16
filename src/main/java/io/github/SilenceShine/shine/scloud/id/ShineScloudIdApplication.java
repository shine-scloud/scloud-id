package io.github.SilenceShine.shine.scloud.id;

import io.github.SilenceShine.shine.util.log.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author SilenceShine
 * @github <a href="https://github.com/SilenceShine">SilenceShine</a>
 * @since 1.0
 */
@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class ShineScloudIdApplication {

    @Autowired
    private DiscoveryClient discoveryClient;

    public static void main(String[] args) {
        try {
            System.setProperty("kubernetes.auth.token", "eyJhbGciOiJSUzI1NiIsImtpZCI6IlZmdGNuVHlXRXVkV3VEZkF2T00yMWZodEg3WGJua1FYUmo4RXUwUGw1bWsifQ.eyJpc3MiOiJrdWJlcm5ldGVzL3NlcnZpY2VhY2NvdW50Iiwia3ViZXJuZXRlcy5pby9zZXJ2aWNlYWNjb3VudC9uYW1lc3BhY2UiOiJrdWJlLXN5c3RlbSIsImt1YmVybmV0ZXMuaW8vc2VydmljZWFjY291bnQvc2VjcmV0Lm5hbWUiOiJjbHVzdGVycm9sZS1hZ2dyZWdhdGlvbi1jb250cm9sbGVyLXRva2VuLTc4dzR0Iiwia3ViZXJuZXRlcy5pby9zZXJ2aWNlYWNjb3VudC9zZXJ2aWNlLWFjY291bnQubmFtZSI6ImNsdXN0ZXJyb2xlLWFnZ3JlZ2F0aW9uLWNvbnRyb2xsZXIiLCJrdWJlcm5ldGVzLmlvL3NlcnZpY2VhY2NvdW50L3NlcnZpY2UtYWNjb3VudC51aWQiOiJjMWJhMTI2MC1lMWU4LTRlMGUtYmY5Mi1mNTNlMmIxNjUyZjciLCJzdWIiOiJzeXN0ZW06c2VydmljZWFjY291bnQ6a3ViZS1zeXN0ZW06Y2x1c3RlcnJvbGUtYWdncmVnYXRpb24tY29udHJvbGxlciJ9.qihBNYOdfyR4hIW2yWehHLbxKfR4pY23rxh6kPjQZWcrWO2qScZq_fZd8gHnGFcbm3-K24j89zl1TbIFrNDBEN9iiNXlqtpKSZYOZd3G8Cis4mtNfjqVhjrHqOCVOfSlFM-gmA5ZFsFG2x90Mhs7zNZWJBXIliCQTbQlQEXCeAI58yjD_QZTsIA4DOkSEGpTGbQui5-8rNfWBdSMluqYJ6AmRkR-i4rNfZxR-yFFVRaI-5GoVFjb2wB3DKUSToOv-SHprRaAWx35IYORcKS-abv1jU-qwmqIluRUrQG0CEXXXJgi6Aci4usV05TXfGa3feuzvCcRPJavATgWbGKbSQ");
            SpringApplication.run(ShineScloudIdApplication.class, args);
            LogUtil.info(ShineScloudIdApplication.class, "shine-scloud-id 启动成功!");
        } catch (Exception e) {
            LogUtil.error(ShineScloudIdApplication.class, "shine-scloud-id 启动失败:{}", e.getMessage());
        }
    }

    @GetMapping("/test")
    public void test() {
        List<String> services = discoveryClient.getServices();
        System.out.println("services:" + services.size());
    }

}
