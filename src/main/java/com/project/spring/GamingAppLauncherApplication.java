package com.project.spring;

import com.project.spring.game.GameRunner;
import com.project.spring.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.project.spring.game")
public class GamingAppLauncherApplication {


    public static void main(String[] args){
        try(var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)){
            //context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
