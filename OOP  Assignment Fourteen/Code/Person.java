

public abstract class Person {
    
    protected String name;

    // Default Constructor
    public Person(){

    }
    // Argumented Constructor
    public Person(String name_prime){
        this.name = name_prime;
    }

    // Setters
    public void setName(String name_prime){
        this.name = name_prime;
    }
    // Getters
    public String getName(){
        return name;
    }

    // Abstract Method
    public abstract boolean isOutstanding();

}

class Student extends Person{
    
    private double CGPA;

    // Default Constructor
    public Student(){
        super();
    }
    // Argumented Constructor
    public Student(String name_prime, double CGPA_Prime){
        super(name_prime);
        this.CGPA = CGPA_Prime;
    }

    // Setters
    public void setCGPA(double CGPA_Prime){
        this.CGPA = CGPA_Prime;
    }
    // Getters
    public double getCGPA(){
        return CGPA;
    }

    // Obverriding Abstract Method
    public boolean isOutstanding(){
        boolean check = true;

        if (CGPA < 3.5) {
            check = false;
        }
        return check;
    }
}
class Professor extends Person{

    private int numberOfPublications;

    // Default Constructor
    public Professor(){
        super();
    }
    // Argumented Constructor
    public Professor(String name_prime, int numberOfPublications_prime){
        super(name_prime);
        this.numberOfPublications = numberOfPublications_prime;
    }

    // Setters
    public void setNumberOfPublications(int numberOfPublications_prime){
        this.numberOfPublications = numberOfPublications_prime;
    }
    // Getters
    public int getNumberOfPublications(){
        return numberOfPublications;
    }

    // Obverriding Abstract Method
    public boolean isOutstanding(){
        boolean check = true;

        if (numberOfPublications < 50) {
            check = false;
        }
        return check;
    }
}
