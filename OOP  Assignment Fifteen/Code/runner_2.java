public class runner_2 {
    public static void main(String[] args) {
     
        salariedEmployee s1 = new salariedEmployee("Abdullah", "Mehdi", "768321", 50000);
        System.out.println(s1.getPaymentAmount());
        
    }
}
interface payable{

    double getPaymentAmount();

}

class invoice implements payable{

    private String partNumber, partDescription;
    private int quantity;
    private double pricePerItem;
    
    // Default Constructor
    public invoice(){

    }

    // Argumented Constructor
    public invoice(String partNumber_prime, String partDescription_prime, int quantity_prime, double pricePerItem_prime){
        this.partNumber = partNumber_prime;
        this.partDescription = partDescription_prime;
        this.quantity = quantity_prime;
        this.pricePerItem = pricePerItem_prime;
    }

    // Setters
    public void setPartNumber(String partNumber_prime){
        this.partNumber = partNumber_prime;
    }
    public void setPartDescription(String partDescription_prime){
        this.partDescription = partDescription_prime;
    }
    public void setQuantity(int quantity_prime){
        this.quantity = quantity_prime;
    }
    public void setPricePerItem(double pricePerItem_prime){
        this.pricePerItem = pricePerItem_prime;
    }

    // Getters
    public String getPartNumber(){
        return partNumber;
    }
    public String getPartDescription(){
        return partDescription;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPricePerItem(){
        return pricePerItem;
    }

    // Overriding Method!
    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }
    
}
abstract class Employee implements payable{

    private String firstName, lastName, socialSecurityNumeber;
    
    // Default Constructor
    public Employee(){

    }

    // Argumented Constructor
    public Employee(String firstName_prime, String lastName_prime, String socialSecurityNumeber_prime){
        this.firstName = firstName_prime;
        this.lastName = lastName_prime;
        this.socialSecurityNumeber = socialSecurityNumeber_prime;
    }

    // Setters
    public void setFirstName(String firstName_prime){
        this.firstName = firstName_prime;
    }
    public void setLastName(String lastName_prime){
        this.lastName = lastName_prime;
    }
    public void setSocialSecurityNumeber(String socialSecurityNumeber_prime){
        this.socialSecurityNumeber = socialSecurityNumeber_prime;
    }

    // Getters
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getSocialSecurityNumeber(){
        return socialSecurityNumeber;
    }
    
}

class salariedEmployee extends Employee {

    private double weeklySalary;

    // Default Constructor
    public salariedEmployee(){
        super();
    }

    // Argumented Constructor
    public salariedEmployee(String firstName_prime, String lastName_prime, String socialSecurityNumeber_prime, double weeklySalary_prime){
        super(firstName_prime, lastName_prime, socialSecurityNumeber_prime);
        this.weeklySalary = weeklySalary_prime;
    }

    // Setters
    public void setWeeklySalary(double weeklySalary_prime){
        this.weeklySalary = weeklySalary_prime;
    }

    // Getters
    public double getWeeklySalary(){
        return weeklySalary;
    }
    
    public double getPaymentAmount() {
        
        return weeklySalary;
    }
    
}

