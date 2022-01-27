package microservice.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(path = "s2/")
public class MicroS2Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroS2Application.class, args);
    }

    @GetMapping
    public String getElements(){
        return "micro_2";
    }

}
