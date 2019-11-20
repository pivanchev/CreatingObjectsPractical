
package CreatingObjectsPractical;

public class CreateRectangle {

  
    public static void main(String[] args) {
         
        Rectangle rec1 = new Rectangle(4.0,40);
        System.out.println("Rectangle 1");
        System.out.println("Area: " + rec1.getArea());
        System.out.println("Perimeter: " + rec1.getPerimeter());
        
        Rectangle rec2 = new Rectangle(3.5,35.9);
        
        System.out.println("Rectangle 2");
        System.out.println("Area: " + rec2.getArea());
        System.out.println("Perimeter: " + rec2.getPerimeter());
        
        System.out.println("The total number of rectangles is " + (rec1.getCount() + rec2.getCount()));
        
    }
    
}
