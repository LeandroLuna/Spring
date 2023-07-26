package com.leandroluna.springframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age){};
record Address(String firstLine, String city){};

@Configuration
public class HelloWorldConfiguration {
    
    @Bean
    public String name(){
        return "Leandro";
    }

    @Bean
    public int age(){
        return 21;
    }

    @Bean
    public Person person(){
        return new Person("Luna", 20);
    }
   
    @Bean
    public Person person2(){ // Method Call
        return new Person(name(), age());
    }

    // @Bean(name = "myCustomBeanName")
    @Bean
    public Address address(){
        return new Address("Rua dos Bobo", "Idkwhereland");
    }
}
