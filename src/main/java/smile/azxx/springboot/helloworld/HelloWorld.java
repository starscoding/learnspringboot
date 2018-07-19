package smile.azxx.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Smile on 2018/6/9.
 */

@RestController
@EnableAutoConfiguration
public class HelloWorld {

    @RequestMapping("/")
    String home(){
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorld.class,args);
    }
}
