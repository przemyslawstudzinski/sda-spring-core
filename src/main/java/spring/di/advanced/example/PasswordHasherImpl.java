package spring.di.advanced.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

@Component(value = "MD5Hasher")
@Primary // Określnie beanu jako najważniejszego w przypadku konfliktu
public class PasswordHasherImpl implements PasswordHasher {
    public String hash(String password) {
        String passwordHash = DigestUtils.md5DigestAsHex(password.getBytes());
        System.out.println("password hash: " + passwordHash);
        return passwordHash;
    }
}
