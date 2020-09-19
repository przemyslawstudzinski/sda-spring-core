package spring.di.java.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainSpringJavaConfigDIExample {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        //User user = (User) applicationContext.getBean("user"); // Pobranie beana po nazwie
        User user = (User) applicationContext.getBean(User.class); // Pobranie beana podając klasę jako argument

        user.setUsername("Przemek93");
        user.setPassword("password1234");
        System.out.println(user);
    }
}

