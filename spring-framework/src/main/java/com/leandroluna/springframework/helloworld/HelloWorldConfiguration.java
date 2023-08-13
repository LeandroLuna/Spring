package com.leandroluna.springframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// A record is a class that is restricted to defining simple data carriers.
record Person(String name, int age, Address address) {
}

/**
 *
 */
record Address(String firstLine, String city) {
}

// @Configuration annotation indicates that a class declares one or more @Bean methods and may be processed by the Spring container to generate bean definitions
// and service requests for those beans at runtime.
@Configuration
public class HelloWorldConfiguration {
    // What is a Bean?
    // A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container.
    @Bean
    public String name() {
        return "Leandro";
    }

    @Bean
    public int age() {
        return 21;
    }

    @Bean
    public Person person() {
        return new Person("Luna", 20, new Address("Rua dos Bobo", "Idkwhereland"));
    }

    @Bean
    @Primary
    public Person person2() { // Method Call
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3(String name, int age, Address address) { // Parameter Injection
        return new Person(name, age, address);
    }

    @Bean
    public Person person4(String name, int age, @Qualifier("address2qualifier") Address address) { // Parameter Injection
        return new Person(name, age, address);
    }

    // @Bean(name = "myCustomBeanName") // You can specify a custom name for the bean
    @Bean
    public Address address() {
        return new Address("Rua dos Bobo", "Idkwhereland");
    }

    @Bean
    @Qualifier("address2qualifier")
    public Address address2() {
        return new Address("Rua dos Tolo", "whoknows");
    }
}
