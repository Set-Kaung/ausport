/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ausport;

import java.util.List;

import ausport.model.Gender;
import ausport.model.Role;
import ausport.model.User;
import ausport.model.UserDAOImpl;


// import ausport.model.*;
// import ausport.util.PasswordHelper;
// import static ausport.model.Role.ADMIN;

public class App {

    public static void main(String[] args) {
            Gender g2 = Gender.MALE;
            switch (g2) {
                case Gender.MALE:
                    System.out.println("This is a male!");
                    break;
                default:
                    System.out.println("This is a female.");
                    break;
            }
            
    }

}
