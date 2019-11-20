
package CreatingObjectsPractical;


public class Rectangle {
    
    private double width;
    private double height;
    private int count;
    
     public Rectangle(){
        count++;
        
    }
   
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        count++;
        
        
    }
    
    
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    
    public double getArea(){
        return width*height;
    }
    
    public double getPerimeter(){
        
       return 2*(width+height);
    }
    
    public int getCount(){
       
        return count;
    }
  }
