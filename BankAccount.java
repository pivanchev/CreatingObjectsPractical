
package bankaccount;
import java.util.Scanner;


public class BankAccount {

 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        double startGift=0.99;
        Account ba1=new Account();
        
        System.out.print("Enter customer`s name: ");
        String custName=sc.nextLine();
        
        System.out.print("Enter customer`s account number: ");
        int custNum=sc.nextInt();
        
        ba1.setAccName(custName);
        ba1.setAccNumber(custNum);
        
        ba1.adjustBalance(startGift);
        
        System.out.print("Welcome, with the gift of $" + startGift);
        System.out.println("\nYour new balance is $:" + ba1.getBalance());
 
    }
    
}
