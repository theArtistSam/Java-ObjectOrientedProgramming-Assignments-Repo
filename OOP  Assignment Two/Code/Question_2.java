
public class Question_2{
    public static void main(String[] args){
        
        // Question No 2        
        // Data required for manager
        Date d1 = new Date(2,4,2010);
        Employee[] array = new Employee[3];
        array[0] = new Employee("Hafif", d1, true, "Student", 66000, 8);
        array[1] = new Employee("Hassan", d1, true, "Student", 66000, 8);
        array[2] = new Employee("Hisham", d1, true, "Student", 66000, 8);

        Person[] p_array = new Person[3];
        p_array[0] = new Employee("Ahmad", d1, true, "Student", 66000, 8);
        p_array[1] = new Employee("Rizwan", d1, true, "Student", 66000, 8);
        p_array[2] = new Manager("Mansoor", d1, false, array, 6, 4000);

        for (int i = 0; i < p_array.length; i++) {
            System.out.println(p_array[i].earning());
        }
     }
}

class Date {
        
    private int day;
    private int month;
    private int year; 

    
    // Default Constructor
    public Date() {
    }

    // Argumented Constructor
    public Date(int day, int month, int year) {

        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Setters
    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }

    // Getters
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    // Display Method
    public void display() {

        System.out.println(day + "  " + month + "  " + year);
    }


}
abstract class Person {

    private String FirstName;
    private Date HireDate;
    private Boolean hasCompanyCar;
    

    // Argumented Constructor
    public Person(String FirstName_prime, Date HireDate_prime, boolean hasCompanyCar_prime ){

        this.FirstName = FirstName_prime;
        this.HireDate = HireDate_prime;
        this.hasCompanyCar =hasCompanyCar_prime;

    }  
    public abstract int earning();
    
}
class Employee extends Person{

    private String Designation;
    private int wage, workingHours;
    
    // Argumented Constructor
    public Employee(String FirstName_prime, Date HireDate_prime, boolean hasCompanyCar_prime, String Designation_prime, int wage_prime, int workingHours_prime ){
        super(FirstName_prime, HireDate_prime, hasCompanyCar_prime);
        this.Designation = Designation_prime;
        this.wage = wage_prime;
        this.workingHours = workingHours_prime;

    }  
    public int earning(){
        return wage * workingHours;
    }
    
}
class Manager extends Person{

    private Employee[] eArray = new Employee[3];
    private int noOfProjects, projectPay;
    
    // Argumented Constructor
    public Manager(String FirstName_prime, Date HireDate_prime, boolean hasCompanyCar_prime, Employee[] eArray_prime, int noOfProjects_prime, int projectPay_prime ){

        super(FirstName_prime, HireDate_prime, hasCompanyCar_prime);
        for (int i = 0; i < eArray_prime.length; i++) {
            this.eArray[i] = eArray_prime[i];
        }
        this.noOfProjects = noOfProjects_prime;
        this.projectPay = projectPay_prime;

    }  
    public int earning(){
        return noOfProjects * projectPay;
    }
    
}
