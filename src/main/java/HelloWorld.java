import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//
@RestController
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@RequestMapping("/Hello")
//@SpringBootApplication
public class HelloWorld {
    @RequestMapping(value = "/getInfo",method= RequestMethod.GET)
    String getInfo( String userName){
        return "hello  ,this is not a page";
    }

    public static void main(String[] args) {
      //  System.setProperty("spring.devtools.restart.enabled","flase");

        SpringApplication.run(HelloWorld.class,args);
    }

}
