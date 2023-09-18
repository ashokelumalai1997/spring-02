# Spring

`` Q1: Spring Container vs Spring Context vs IOC Container vs Application Context ``

`` Q2: Java Bean vs Spring Bean``

`` Q3: How can I list all Beans managed by Spring Framework``

`` Q4: What if multiple matching beans are available?``

`` Q5: Spring is managing Objects and performing auto-wiring. 
    a. But aren't we writing code to create objects?
    b. How do we create Spring to create objects for us?``

`` Q6: Is Spring really making things simple/easy?``

## Spring Container/Spring context/Spring IOC container
Manages spring bean and their lifecycle

1. Bean Factory: Basic spring container (used in IOT areas)
2. Application context : Advanced spring container with enterprise-specific features(Mostly used, recommended for web apps, web services - REST and microservices)
    a. Easy to use in web apps
    b. Easy internationalization
    c. Easy integration with Spring AOP


## Java Bean vs POJO vs Spring Bean
Java Bean
1. Need public no arg constructor (auto initialized by Java if not done)
2. Getters and Setters
3. Implements java.io.Serializable

Spring Bean
Anything Java Object that is managed by Spring Context
Spring uses IOC container (Bean Factory or Application Context) to manage these objects

POJO
No constraints. Any Java Object is a POJO

## How can I list Beans managed by Spring context
Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

## What if multiple matching beans
@Primary annotation to mention which one to use
Use @Qualifier("") in declaration of Beans and mentionn Qualifier in auto wiring parameter

# spring-02
