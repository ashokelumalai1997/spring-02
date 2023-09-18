# Important terminology
## @Component
An instance of class will be managed by SpringFramework

## Dependency : 
Gamerunner needs GamingConsole Impl!

## Component Scan
How does Spring Framework find component class
It scans packages! (@ComponentScan("com.in28minutes"))

## DependencyInjection: 
Identify beans, their dependencies and write them together(provides IOC - inversion of control)

Spring Beans :  An object managed by Spring Framework
IoC container: Manages the lifecycle of beans and dependencies
    Types: ApplicationContext(complex), BeanFactory(simpler features - rarely used)
AutoWiring: Process of wiring in dependencies for a Spring Bean

## @Component vs @Bean

Where?
@Component - Can be used on any Java class  
@Bean - Typically used on methods in Spring Config classes

Ease of use
@Component - Very easy. Just add anotation  
@Bean - You write all the code


Autowiring 
@Component - Yes, Field, Setter, Constructor  
@Bean - method call or method params

Who creates Beans?
@Component -  Spring Framework
@Bean - You write bean creation code


Recommended for
@Component -   Instantiating Beans for Your own Application Code: @Component
@Bean - Custom Business logic(checks, validations etc), Instantiating Beans for 3rd party libs : @Bean






