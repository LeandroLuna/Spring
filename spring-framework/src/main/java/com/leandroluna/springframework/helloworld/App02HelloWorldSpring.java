package com.leandroluna.springframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

// App02HelloWorldSpring is the same as App01GamingBasicJava, but using Spring Framework
public class App02HelloWorldSpring {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("person2"));
            System.out.println(context.getBean("person3"));
            System.out.println(context.getBean("person4"));
            // System.out.println(context.getBean("address"));

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
