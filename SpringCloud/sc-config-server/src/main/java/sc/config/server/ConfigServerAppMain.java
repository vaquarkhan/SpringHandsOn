package sc.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerAppMain {

    public static void main(String args[]) {

        SpringApplication app = new SpringApplication(ConfigServerAppMain.class);
        app.setAdditionalProfiles(new String[]{"config-server"});

        app.run(args);
    }
}
