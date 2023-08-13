package com.leandroluna.springframework;

import com.leandroluna.springframework.game.GameRunner;
import com.leandroluna.springframework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// App01GamingBasicJava is the same as App02HelloWorldSpring, but using regular Java
public class App03GamingSpringBeans {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
