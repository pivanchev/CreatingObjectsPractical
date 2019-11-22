
package CreatingObjectsPractical;

public class BMI {
    
    private String name;
    private int age;
    private double height;
    private double weight;
    public static final double KG_PER_POUND=0.45359237;
    public static final double METERS_PER_INCH=0.0254;

    public BMI(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    
    public double getBMI(){
        double BMI=weight*KG_PER_POUND/((height*METERS_PER_INCH)*(height*METERS_PER_INCH));
        return Math.round(BMI*100)/100.0;    
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
    
    public String getStatus(){
     double BMI=getBMI();
     if(BMI<18.5){
         return "Underweight";
     }else if(BMI<25){
         return " Normal";
     }else if(BMI<30){
         return "Overweight";    
     }else{
         return "Obese";
     }
           
    }
}
