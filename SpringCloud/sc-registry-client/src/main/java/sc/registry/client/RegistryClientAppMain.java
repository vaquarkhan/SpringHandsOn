package sc.registry.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration(exclude = {org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration.class})
public class RegistryClientAppMain {

    public static void main(String args[]) {

        SpringApplication app = new SpringApplication(RegistryClientAppMain.class);
        app.setAdditionalProfiles(new String[] { "registry-client" } );

        app.run(args);
    }
}
