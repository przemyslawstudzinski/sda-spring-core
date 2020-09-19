package spring.di.advanced.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import javax.annotation.PostConstruct;

@Configuration
@ComponentScan // Włączenie automatycznego skanowania w obrębie tego pakietu
@PropertySource("classpath:version.properties") // Załadowanie pliku properties. Wszystkie pliki z katalogu resources są w classpath.
public class AutoConfig {

    @Value("${app.version:Not defined}") // Pobranie wartości z pliki properties oraz zdefiniowanie jej w przypadku nie odnalezienia klucza
    private String version;

    @PostConstruct // Adnotacja z Javy EE dzięki której metoda zostanie automatycznie wywołana po utworzeniu bean-a.
    public void printAppVersionOnStart() {
        System.out.println("App version: " + version);
    }
}
