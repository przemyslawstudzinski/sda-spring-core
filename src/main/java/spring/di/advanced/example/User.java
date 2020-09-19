package spring.di.advanced.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class User {

    private String username;

    private String password;

    //@Autowired
    private PasswordHasher passwordHasher;

    // Użycie adnotacji Qualifier informuje Spring-a jaki bean ma wstrzyknąć
    public User(@Qualifier(value = "SHAHasher") PasswordHasher passwordHasher) {
        this.passwordHasher = passwordHasher;
    }

//    @Autowired
//    public void setPasswordHasher(PasswordHasher passwordHasher) {
//        this.passwordHasher = passwordHasher;
//    }

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
                ", passwordHash='" + password + '\'' +
                '}';
    }
}
