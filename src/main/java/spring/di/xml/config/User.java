package spring.di.xml.config;

public class User {

    private String username;

    private String password;

    private PasswordHasher passwordHasher;

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
