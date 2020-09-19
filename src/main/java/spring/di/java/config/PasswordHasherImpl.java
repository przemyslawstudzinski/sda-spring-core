package spring.di.java.config;

import org.springframework.util.DigestUtils;

public class PasswordHasherImpl implements PasswordHasher {
    public String hash(String password) {
        String passwordHash = DigestUtils.md5DigestAsHex(password.getBytes());
        System.out.println("password hash: " + passwordHash);
        return passwordHash;
    }
}
