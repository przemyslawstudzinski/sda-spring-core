package spring.di.java.config;

public interface PasswordHasher {
    String hash(String password);
}
