
package CreatingObjectsPractical;


public class Car {
    
    private String make;
    private int year_of_manifacture;
    private String reg_number;
    private double price;
    
    public Car(){
        
    }

    public Car(String make, int year_of_manifacture, String reg_number, double price) {
        this.make = make;
        this.year_of_manifacture = year_of_manifacture;
        this.reg_number = reg_number;
        this.price = price;
    }
    
    public void printCarInfo(){
        System.out.println(this.make + "," + this.year_of_manifacture + "," + this.reg_number + "," + this.price);
    }
    
    public void setPrice(){
        this.price=price;
    }
    
    public double getPrice(){
        return price;
    }
}
