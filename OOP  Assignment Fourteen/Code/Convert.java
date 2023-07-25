

abstract class Convert {
    
    protected double val1, val2;
    
    // Default Constructor
    public Convert(){

    }

    // Argumented Constructor
    public Convert(double val1_prime){
        this.val1 = val1_prime;
    }

    // Setters
    public void setVal1(double val1_prime){
        this.val1 = val1_prime;
    }
    public void setVal2(double val2_prime){
        this.val2 = val2_prime;
    }

    // Getters
    public double getVal1(){
        return val1;
    }
    public double getVal2(){
        return val2;
    }

    public abstract double compute();
}

class l_to_g extends Convert{

    // Default Constructor
    public l_to_g(){
        super();
    }

    // Argumented Constructor
    public l_to_g(double val1_prime){
        super(val1_prime);
    }
    
    // Overriding Abstract Method 
    public double compute() {
        val2 = val1 * 0.264172;
        return val2;
    }
    
}
class f_to_c extends Convert{

    // Default Constructor
    public f_to_c(){
        super();
    }

    // Argumented Constructor
    public f_to_c(double val1_prime){
        super(val1_prime);
    }
    
    // Overriding Abstract Method 
    public double compute() {
        val2 = ((val1 - 32) * 5 ) / 9;
        return val2;
    }
    
}
class f_to_m extends Convert{

    // Default Constructor
    public f_to_m(){
        super();
    }

    // Argumented Constructor
    public f_to_m(double val1_prime){
        super(val1_prime);
    }
    
    // Overriding Abstract Method 
    public double compute() {
        val2 = val1 * 0.3048;
        return val2;
    }
    
}
