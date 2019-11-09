package sc.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigClientAppMain {

    public static void main(String args[]) {
        SpringApplication app = new SpringApplication(ConfigClientAppMain.class);

        app.setAdditionalProfiles(new String[]{"config-client"});

        app.run(args);
    }
}
