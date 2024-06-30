package MainInitializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "IndexController," + "model")
public class ContactForm {
    public static void main(String[] args) {
        SpringApplication.run(ContactForm.class, args);
    }

}
