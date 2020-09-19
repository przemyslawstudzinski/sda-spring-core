package simple.di;

public class MainSampleDIExample {

    public static void main(String[] args) {
        PasswordHasher passwordHasher = new PasswordHasherImpl();
        User user = new User(passwordHasher);

        // Dzięki wstrzyknięciu zależności informujemy, że User nie będzie prawidłowo działał bez implementacji PasswordHasher
        user.setUsername("Przemek93");
        user.setPassword("password1234");
        System.out.println(user);
    }
}
