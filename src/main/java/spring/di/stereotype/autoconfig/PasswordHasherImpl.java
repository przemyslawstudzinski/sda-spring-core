package spring.di.stereotype.autoconfig;

import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

// Dzięki tej adnotacji nie musimy tworzyć sami beana tylko Spring robi to za nas.
// Możemy również tak jak w przykładzie podać własna nazwę beana.
@Component(value = "passwordHasher")
public class PasswordHasherImpl implements PasswordHasher {
    public String hash(String password) {
        String passwordHash = DigestUtils.md5DigestAsHex(password.getBytes());
        System.out.println("password hash: " + passwordHash);
        return passwordHash;
    }
}
