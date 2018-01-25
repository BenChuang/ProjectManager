package initializer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import service.IMyService;
import service.impl.MyService;

@Configuration
@EnableWebMvc
@ComponentScan({"service.impl", "controller"})
public class AppConfig implements WebMvcConfigurer{

//    @Bean
//    public IMyService myService() {
//        return new MyService();
//    }

}
