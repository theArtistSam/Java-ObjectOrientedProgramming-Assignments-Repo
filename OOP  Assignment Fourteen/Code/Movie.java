
public abstract class Movie {
    
    protected int idNumber, numberOfDays;
    protected String title;

    // Default constructor
    public Movie(){

    }

    // Argumented Constructor
    public Movie(int idNumber_prime, int numberOfDays_prime, String title_prime){

        this.idNumber = idNumber_prime;
        this.numberOfDays = numberOfDays_prime;
        this.title = title_prime;
    }

    // Setters
    public void setIdNumber(int idNumber_prime){
        this.idNumber = idNumber_prime;
    }
    public void setNumberOfDays(int numberOfDays_prime){
        this.idNumber = numberOfDays_prime;
    }
    public void setTitle(String title_prime){
        this.title = title_prime;
    }

    // Getters
    public int getIdNumber(){
        return idNumber;
    } 
    public int getNumberOfDays(){
        return numberOfDays;
    } 
    public String getTitle(){
        return title;
    } 

    // Equals Method
    public boolean equals(Movie m_prime){
        boolean check = true;

        if ((this.idNumber != m_prime.idNumber) || (this.numberOfDays != m_prime.numberOfDays) || (this.title != m_prime.title)) {
            check = false;
        }

        return check;
    }
    
    public abstract double calcLateFees(int lateDays);
}

class Action extends Movie{

    // constructor
    public Action(){

    }

    // Overridden Method
    public double calcLateFees(int lateDays){
        
        return 3 * lateDays;
    
    }

}
class Comedy extends Movie{
    
    // constructor
    public Comedy(){

    }

    // Overridden Method
    public double calcLateFees(int lateDays){
        
        return 2.5 * lateDays;
    
    }
}
class Drama extends Movie{
    
    // constructor
    public Drama(){

    }

    // Overridden Method
    public double calcLateFees(int lateDays){
        
        return 2 * lateDays;
    
    }
}
