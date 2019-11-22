
package CreatingObjectsPractical;
import java.util.Scanner;


public class CreateBMI {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BMI bmi1 = new BMI();
        
        System.out.print("Enter you name: ");
        String name=sc.nextLine();
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        System.out.print("Enter your weight in pounds: ");
        double weight=sc.nextDouble();
        System.out.print("Enter your height in inches: ");
        double height=sc.nextDouble();
        
        
        bmi1.setName(name);
        bmi1.setAge(age);
        bmi1.setWeight(weight);
        bmi1.setHeight(height);
        
        System.out.println("BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());
    }
    
}
