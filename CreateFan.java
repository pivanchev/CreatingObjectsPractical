package CreatingObjectsPractical;

public class CreateFan {
    
    public static void main(String[] args) {
        
        Fan fan1 = new Fan(3,true,10,"yellow");
        
        Fan fan2 = new Fan(2,false,5,"blue");
        
        System.out.print(fan1.toString());
        System.out.print(fan2.toString());
    }
    
}
