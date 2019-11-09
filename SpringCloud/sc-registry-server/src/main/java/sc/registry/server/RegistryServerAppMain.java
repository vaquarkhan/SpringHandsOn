package sc.registry.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableAutoConfiguration(exclude = {org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration.class})
public class RegistryServerAppMain {

    public static void main(String args[]) {

        SpringApplication app = new SpringApplication(RegistryServerAppMain.class);
        app.setAdditionalProfiles(new String[] { "registry-server"});

        app.run(args);
    }

}
