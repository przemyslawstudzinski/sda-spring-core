package spring.di.xml.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Aktualnie rzadko stosuje sie konfigurację XML, lecz w starszych projektach często można się spotkać z takim
 * sposobem konfiguracji.
 */
public class MainSpringXmlConfigDIExample {

    public static void main(String[] args) {
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("configuration.xml");
        // Drugi sposób w przypadku użycia @ImportResource z xml konfiguracyjnym
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(XmlConfig.class);
        User user = (User) applicationContext.getBean("xmluser"); // Pobranie beana po nazwie
        user.setUsername("Przemek93");
        user.setPassword("password1234");
        System.out.println(user);
    }
}

