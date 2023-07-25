
import java.util.*;
public class runner{
    public static void main(String[] args){

        // Implementation
        circle c1 = new circle(45);
        System.out.println(c1.getArea()); 

        
    }
    
}

// Interface
interface Shape{
    double getArea();
}

// Circle Class
class circle implements Shape{

    private double radius;

    // Default Constructor
    public circle(){

    }

    // Argumented Constructor
    public circle(double radius_prime){
        this.radius = radius_prime;
    }

    // Setters
    public void setRadius(double radius_prime){
        this.radius = radius_prime;
    }

    // Getters
    public double getRadius(){
        return radius;
    }

    // Overriding Method!
    public double getArea() {
        
        return 3.14 * (radius * radius);

    }

}
// Rectangle Class
class rectangle implements Shape{

    private double length;
    private double width;
    
    // Default Constructor
    public rectangle(){

    }

    // Argumented Constructor
    public rectangle(double length_prime, double width_prime){
        
        this.length = length_prime;
        this.width = width_prime;
    }

    // Setters
    public void setLength(double length_prime){
        this.length = length_prime;
    }
    public void setWidth(double width_prime){
        this.width = width_prime;
    }

    // Getters
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }

    // Overriding Method!
    public double getArea() {
        
        return length * width;

    }

}