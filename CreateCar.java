
package CreatingObjectsPractical;
import java.util.Scanner;

public class CreateCar {
    
    public static void main(String[] args) {
        
       
    
        
        Car c1 =  new Car("Ford",2008,"BVD 123",20000  );
        c1.printCarInfo();
        System.out.println("The price of the car object is: " + c1.getPrice());
        
        Scanner sc=new Scanner(System.in);
        
        Car[] cars= new Car[2];
        
        String make,regNo;
        double price;
        int year0fManifacture;
        
        for(int i=0;i<cars.length;i++){
            System.out.print("Enter the make for Car " + (i+1) + ": ");
            make=sc.nextLine();
            
            System.out.print("Enter the year of manifacture for Car " + (i+1) + ": ");
            year0fManifacture=sc.nextInt();
            sc.nextLine();
            
            System.out.print("Enter the registration number for car " + (i+1) + ": ");
            regNo=sc.nextLine();
            
            System.out.print("Enter the price for car " + (i+1) + ": ");
            price=sc.nextDouble();
            sc.nextLine();
            
            System.out.println(make + ", " +year0fManifacture + ", " +regNo + ", " +price);
            System.out.println();
        }
            
           
 
    }
    
}
