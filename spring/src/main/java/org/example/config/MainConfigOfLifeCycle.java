package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("org.example.bean")
@Configuration
public class MainConfigOfLifeCycle {
//    @Bean(initMethod = "init", destroyMethod = "destroy")
//    @Scope(scopeName = SCOPE_PROTOTYPE)
//    public Car car() {
//        return new Car();
//    }
}
