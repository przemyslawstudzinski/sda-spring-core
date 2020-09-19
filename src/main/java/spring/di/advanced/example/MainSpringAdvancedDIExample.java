package spring.di.advanced.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainSpringAdvancedDIExample {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AutoConfig.class);
        User user = applicationContext.getBean(User.class); // Pobranie beana podając klasę jako argument
        user.setUsername("Przemek93");
        user.setPassword("password1234");

        //User user2 = applicationContext.getBean(User.class); // Ustawiony scope na prototype spowoduje że dostaniamy
        // nową instację beana
        //user2.setUsername("Ania_001"); // Ustawiamy inny login. W przypadku scope singletona nadpisalibyśmy
        // poprzednią nazwę w beanie
        //user2.setPassword("password1234");
        System.out.println(user);
        //System.out.println(user2);
    }
}

