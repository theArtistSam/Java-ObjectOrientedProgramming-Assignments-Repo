/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2   
*/

public class runner{
    public static void main(String[] args){
        
        System.out.println("\nEmployee Class Data");
        System.out.println("-------------------");
        Employee[] array = new Employee[4];

        weeklyEmployee w1 = new weeklyEmployee("Abdullah", "Mehdi", "247", 15000);
        HourlyEmployee h1 = new HourlyEmployee("Abdullah", "Mehdi", "247", 15, 15000);
        CommisionEmployee c1 = new CommisionEmployee("Abdullah", "Mehdi", "247", 15, 150);
        BasePlusCommisionEmployee b1 = new BasePlusCommisionEmployee("Abdullah", "Mehdi", "247", 15, 150, 50000);

        array[0] = w1;
        array[1] = h1;
        array[2] = c1;
        array[3] = b1;
        
        for(int i = 0; i < array.length; i++){
            System.out.println("Earning is: " + array[i].earnings());
        }

        System.out.println("\nMovie Class Data");
        System.out.println("-------------------");

        Movie[] array_2 = new Movie[3];

        array_2[0] = new Action();
        array_2[1] = new Comedy();
        array_2[2] = new Drama();
        
        for(int i = 0; i < array_2.length; i++){
            System.out.println("Movie Fee is: " + array_2[i].calcLateFees(7));
        }

        // Boolean Check
        System.out.println(array_2[0].equals(array_2[1])); 
        // Gotta do downcasting

        System.out.println("\nPackage Class Data");
        System.out.println("-------------------");

        PackageDelivery[] array_3 = new PackageDelivery[2];

        array_3[0] = new TwoDayPackage("Abdullah", "Islamabad", "Hafif", "Canada", 50, 10, 5000);
        array_3[1] = new OvernightPackage("Abdullah", "Islamabad", "Hafif", "Canada", 50, 10, 3000);
        
        for(int i = 0; i < array_3.length; i++){
            System.out.println("Package Fee is: " + array_3[i].calculateCost());
        }

        System.out.println("\nPerson Class Data");
        System.out.println("-------------------");

        Person[] array_4 = new Person[2];

        array_4[0] = new Student("Abdullah", 4);
        array_4[1] = new Professor("Sam", 100);
        
        // Boolean Check
        System.out.println("Student: " + array_4[0].isOutstanding());
        System.out.println("Professor: " + array_4[1].isOutstanding());

        System.out.println("\nConvert Class Data");
        System.out.println("-------------------");

        Convert[] array_5 = new Convert[3];

        array_5[0] = new l_to_g(10);
        array_5[1] = new f_to_c(32);
        array_5[2] = new f_to_m(6);
        
        // Boolean Check
        System.out.println("Liters to Gallons: " + array_5[0].compute());
        System.out.println("Fahrenheit to Celsius: " + array_5[1].compute());
        System.out.println("Feet to Meters: " + array_5[2].compute());
        

    }
}

abstract class Employee {

    protected String firstName;
    protected String lastName;
    protected String SSN;
    
    // Default Constructor
    public Employee(){

    }

    // Argumented Constructor
    public Employee(String firstName_prime, String lastName_prime,String SSN_prime){

        this.firstName = firstName_prime;
        this.lastName = lastName_prime;
        this.SSN = SSN_prime;

    }

    // Setters
    public void setFirstName(String firstName_prime){
        this.firstName = firstName_prime;
    }
    public void setLastName(String lastName_prime){
        this.lastName = lastName_prime;
    }
    public void setSSN(String SSN_prime){
        this.SSN = SSN_prime;
    }

    // Getters
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getSSN(){
        return SSN;
    }

    // Abstract Method Declaration
    public abstract int earnings();
        
}

class weeklyEmployee extends Employee{

    private int weeklySalary;

    // Default Constructor
    public weeklyEmployee(){
        super();
    }

    // Argumented Constructor
    public weeklyEmployee(String firstName_prime, String lastName_prime,String SSN_prime, int weeklySalary_prime){
        super(firstName_prime, lastName_prime, SSN_prime);
        this.weeklySalary = weeklySalary_prime;
    }

    // Setters
    public void setWeeklySalary(int weeklySalary_prime){
        this.weeklySalary = weeklySalary_prime;
    }

    // Getters
    public int getWeeklySalary(){
        return weeklySalary;
    }

    public int earnings(){
        return weeklySalary;
    } 
}

class HourlyEmployee extends Employee{

    private int hours;
    private int wagePerHour;

    // Default Constructor
    public HourlyEmployee(){
        super();
    }

    // Argumented Constructor
    public HourlyEmployee(String firstName_prime, String lastName_prime,String SSN_prime, int hours_prime, int wagePerHour_prime){
        super(firstName_prime, lastName_prime,SSN_prime);
        this.hours = hours_prime;
        this.wagePerHour = wagePerHour_prime;
    }

    // Setters
    public void setHours(int hours_prime){
        this.hours = hours_prime;
    }
    public void setWagePerHour(int wagePerHour_prime){
        this.wagePerHour = wagePerHour_prime;
    }

    // Getters
    public int getHours(){
        return hours;
    }
    public int getWagePerHour(){
        return wagePerHour;
    }

    public int earnings(){
        return hours * wagePerHour;
    } 
}

class CommisionEmployee extends Employee{

    protected int sales;
    protected int CommisionRate;

    // Default Constructor
    public CommisionEmployee(){
        super();
    }

    // Argumented Constructor
    public CommisionEmployee(String firstName_prime, String lastName_prime,String SSN_prime, int sales_prime, int CommisionRate_prime){
        super(firstName_prime, lastName_prime,SSN_prime);
        this.sales = sales_prime;
        this.CommisionRate = CommisionRate_prime;
    }

    // Setters
    public void setSales(int sales_prime){
        this.sales = sales_prime;
    }
    public void setCommisionRate(int CommisionRate_prime){
        this.CommisionRate = CommisionRate_prime;
    }

    // Getters
    public int getSales(){
        return sales;
    }
    public int getCommisionRate(){
        return CommisionRate;
    }

    public int earnings(){
        return sales * CommisionRate;
    } 
}

class BasePlusCommisionEmployee extends CommisionEmployee{

    private int basicSalary;

    // Default Constructor
    public BasePlusCommisionEmployee(){
        super();
    }

    // Argumented Constructor
    public BasePlusCommisionEmployee(String firstName_prime, String lastName_prime,String SSN_prime, int sales_prime, int CommisionRate_prime, int basicSalary_prime){
        super(firstName_prime, lastName_prime, SSN_prime, sales_prime, CommisionRate_prime);
        this.basicSalary = basicSalary_prime;
    }

    // Setters
    public void setBasicSalary(int basicSalary_prime){
        this.basicSalary = basicSalary_prime;
    }

    // Getters
    public int getBasicSalary(){
        return basicSalary;
    }

    public int earnings(){
        return super.earnings() + basicSalary;
    } 
}