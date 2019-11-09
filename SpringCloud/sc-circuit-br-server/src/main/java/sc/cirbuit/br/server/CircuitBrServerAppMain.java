package sc.cirbuit.br.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CircuitBrServerAppMain {

    public static void main(String args[]) {
        SpringApplication app = new SpringApplication(CircuitBrServerAppMain.class);
        app.setAdditionalProfiles(new String[] { "circuit-br-server"});

        app.run(args);
    }
}
