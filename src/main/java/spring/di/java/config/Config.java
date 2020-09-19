package spring.di.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Klasa konfiguracyjna dla Springa gdzie definiujemy beany.
 * W tym trywailnym przykładzie klas jak i zależności jest mało, jednak "moc" Springa doskonale widać kiedy pracujemy
 * z dużym projektem z wieloma klasami i zależnościami między nimi.
 */
@Configuration
public class Config {

    /**
     * W przypadku jeśli chcemy skorzystać z innej impementaji hash-owania hasła nie potrzebujemy zmieniać impementacji
     * w każdym miejscu w kodzie, zmieniamy jedynie ustawienie implementacji w Beanie.
     */
    @Bean(name = "hasher") // Nazwą beana domyślnie jest nazwa metody
    public PasswordHasher getPasswordHasher() {
        return new PasswordHasherImpl();
    }

    @Bean(name = "user") // Uwaga! passwordHasher zostanie wstrzyknięty przez Springa
    public User getUser(PasswordHasher passwordHasher) { // Automatyczne rozwiązanie zależności przez Spring Framework
        return new User(passwordHasher);
    }
}
