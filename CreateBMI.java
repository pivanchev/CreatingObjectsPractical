
package CreatingObjectsPractical;
import java.util.Scanner;


public class CreateBMI {
    
    public static void main(String[] args) {
        
        BMI bmi1 = new BMI("Plamen Ivanchev",34,70.866,198.416);
        
        System.out.println("BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());
    }
    
}
