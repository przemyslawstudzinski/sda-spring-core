package spring.di.stereotype.autoconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainSpringStereotypeAutoconfigDIExample {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutoConfig.class);
        User user = applicationContext.getBean(User.class); // Pobranie beana podając klasę jako argument

        user.setUsername("Przemek93");
        user.setPassword("password1234");
        System.out.println(user);
    }
}

