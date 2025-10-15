package co.edu.escuelaing;

public class SecurityUtils {
    public static User login(User u){
        System.out.println("Username: " + u.getName());
        System.out.println("Password: " + u.getPassword());
        u.setPassword("");
        return u;
    }

}
