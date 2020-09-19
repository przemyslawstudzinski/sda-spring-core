package spring.di.advanced.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

@Component(value = "SHAHasher")
public class SHAPasswordHasherImpl implements PasswordHasher {

    @Value("SHA-256 MessageDigest") // Sposób wstrzyknięcia wartości "prostych"
    private String name;

    @Value("1")
    private int version;

    public String hash(String password) {
        System.out.println("name: " + name + ", version: " + version);
        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] hash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
        String passwordHash = Base64.getEncoder().encodeToString(hash);
        return passwordHash;
    }

    @Override
    public String toString() {
        return "Hasher{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }
}
