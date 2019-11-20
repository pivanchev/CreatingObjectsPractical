package CreatingObjectsPractical;

public class Fan {
    
    private final int SLOW=1;
    private final int MEDIUM=2;
    private final int FAST=3;
    private int speed;
    private boolean fanIs;
    private double radius;
    private String colour;

    public Fan(int speed,boolean fanIs,double radius,String colour) {
        this.speed=speed;
        this.fanIs=fanIs;
        this.radius=5.0;
        this.colour="blue";
        
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void fanIs(boolean on) {
        this.fanIs = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColour(String color) {
        this.colour = colour;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean fanIs() {
        return fanIs;
    }

    public double getRadius() {
        return radius;
    }

    public String getColour() {
        return colour;
    }
    
    public String toString(){
        
        if(fanIs==true){
        return ("Fan speed:" + this.speed + "," + "colour: " + this.colour + "," + "radius: " + this.radius);   
        }else
           return("Fan colour: " + this.colour + "," + "radius: " + this.radius + "\n" + "fan is OFF");
        
        
    }
    
    
}