package com.luv2code.annotations;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;
import org.springframework.context.annotation.*;


// This is a Java Configuration
// Please follow the configuration rule
@Configuration
//@ComponentScan("com.luv2code.annotations")
// no need to component scan
// just make use of the two beans we manually define
@PropertySource("classpath:sport.properties")
public class SportConfig {

    // Define bean for our sad fortune service
    @Bean
    public FortuneService sadFortuneService(){
        // method name is the BeanId
        return new SadFortuneService();
    }

    @Bean
    // Define bean for swim coach and inject dependency
    public Coach swimCoach(){
        // injection sadFortuneService to the swim coach as a dependency.
        return new SwimCoach(sadFortuneService());
    }
}
