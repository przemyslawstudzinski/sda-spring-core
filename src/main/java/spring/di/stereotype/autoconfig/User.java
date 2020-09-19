package spring.di.stereotype.autoconfig;

import org.springframework.stereotype.Component;

@Component
public class User {

    private String username;

    private String password;

    // Atrybut requierd określa czy autowiązanie jest wymagane
    private PasswordHasher passwordHasher;

    //@Autowired //Od wersji 4.3 Spring Framework adnotacja Autowired na konstruktorze nie jest wymagana
    public User(PasswordHasher passwordHasher) {
        this.passwordHasher = passwordHasher;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = passwordHasher.hash(password);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
