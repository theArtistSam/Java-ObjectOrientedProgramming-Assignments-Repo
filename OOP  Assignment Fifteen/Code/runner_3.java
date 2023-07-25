

public class runner_3 {
    public static void main(String[] args) {
        
        Point p1 = new Point(4,7);
        Point p2 = (Point) p1.clone();
        p2.display();
        p1.display();
    }
}

class Point implements Cloneable{
    
    private int x;
    private int y;

    // Default Constructor
    public Point(){

    }

    // Argumented Constructor
    public Point(int x_prime, int y_prime){
        this.x = x_prime;
        this.y = y_prime;
    }

    // Making copies of the objects 
    public Object clone(){
        return new Point(this.x, this.y);
    }

    public void display(){
        System.out.println("X is: " + x);
        System.out.println("Y is: " + y);
    }

}
