package bankaccount;


public class Account {
    
    private String accName;
    private int accNumber;
    private double balance;
    
    public Account(){
        
    }

    public Account(String accName, int accNumber, double balance) {
        this.accName = accName;
        this.accNumber = accNumber;
        this.balance = balance;
    }
    
    

    public void setAccName(String PaccName) {
        this.accName = PaccName;
    }

    public void setAccNumber(int PaccNumber) {
        this.accNumber = PaccNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccName() {
        return accName;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }
    
    public void adjustBalance(double custBalance){
        balance=balance+custBalance;
    }
}
