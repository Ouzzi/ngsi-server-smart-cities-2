package server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Markiert als Spring Boot-Anwendung
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args); // Startet die Spring Boot-Anwendung
    }
}
