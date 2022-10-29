import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        User user = new User(1L, "admin", "admin", "admin@admin.com");
//        System.out.println("User: " + user.getLogin());
//        System.out.println("Id: " + user.getId());

//        user.setLogin("nowy-admin");
//        user.setPassword("admin-password");
//        user.setEmail("updated-email@email.com");
//        System.out.println("User id: " + user.getId()
//                + ", user login: " + user.getLogin() + ", user email: "+user.getEmail()
//                + ", user password: "+user.getPassword());

//
       Admin adm = new Admin("Ala", "Kowalska", "kasia@wp.pl");
        System.out.println(user.toString());
        System.out.println(adm.toString());

        }
    }


