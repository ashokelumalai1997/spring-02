package com.project.spring.examples.a1;

import com.project.spring.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
//@ComponentScan("com.project.spring.examples.a1") - equivalent to below line
@ComponentScan
public class DependencyInjectionLauncherApplication {

    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
