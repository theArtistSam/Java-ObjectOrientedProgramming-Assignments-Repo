/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2   
*/
import java.util.*;
import java.lang.*;
import java.util.Arrays;
public class composition{
        public static void main(String[] args){

                Employee2 e1 = new Employee2();

                My_Date d1 = new My_Date (4,5,1992);
                My_Date d2 = new My_Date (4,5,2005);
                job j1 = new job (1, 60000, "Computer Operator");
                

                Employee2 e2 = new Employee2("saneeha", "aamir", d1, d2, j1);                
                e2.display(); 
                System.out.println("\n" + e2.checkSalary());
                
                // Runner
                address a1 = new address (5, 12, "Multan");
                person p1 = new person("Sam", "Edwards", a1);
                book b1 = new book(p1, "OOP", "Oxford");
                b1.display();
                System.out.println("\n" + b1.checkStreet());

                // Runner
                pizza p4 = new pizza("medium", 5, 6, 7);
                pizza p5 = new pizza("small", 2, 2, 3);
                pizza p6 = new pizza("large", 5, 2, 0);
                System.out.println(p4.calcCost());
                System.out.println(p4.getDescription());

                pizzaOrder pz = new pizzaOrder(p4, p5, p6);
                pz.display();

                                
        }
               
}
class Employee2 {
   
    private String firstName;
    private String lastName;
    private My_Date birthDate;
    private My_Date hireDate;
    private job person_Job;
   
    public Employee2()
    {
        birthDate = new My_Date();
        hireDate = new My_Date();
        person_Job = new job();
    }
   
    public Employee2(String f, String l, My_Date d1 , My_Date d2, job j1)
    {
        firstName = f;
        lastName = l;
        birthDate = d1;
        hireDate = d2;
        person_Job = j1;
    }

    // setters
    public void setBirthDate(My_Date d1)
    {
        birthDate =d1;
    }

    public void setHireDate(My_Date d1)
    {
        hireDate =d1;
    }

    public void setJob(job j1)
    {
        person_Job = j1;
    }
   
    // getters
    public My_Date  getBirthDate()
    {
        return birthDate;
    }

    public My_Date  getHireDate()
    {
        return hireDate;
    }
    
    public job getJob()
    {
        return person_Job;
    }

     public void display()
     {
         System.out.println(firstName);
         System.out.println(lastName);
         System.out.println(birthDate.getDay() + "  " + birthDate.getMonth() + "  "+ birthDate.getYear());
         System.out.println(hireDate.getDay() + "  " + hireDate.getMonth() + "  "+ hireDate.getYear());
         System.out.println(person_Job.getId() + "  " + person_Job.getSalary() + "  " + person_Job.getDesignation());
              
     }
    
     public void display2()
     {
         System.out.println(firstName);
         System.out.println(lastName);
         birthDate.display();
         hireDate.display();
     }

     public boolean checkExperience(My_Date current_year){

        boolean check = true;

        if(current_year.getYear() - hireDate.getYear() < 5){
                check = false;
        }

        return check;
     }

     public boolean checkSalary(){

        boolean check = true;

        if(person_Job.getSalary() < 50000){
                check = false;
        }
        return check;
     }     
   
}

class My_Date {
        
        private int day;
        private int month;
        private int year; 

 

    public My_Date(int day, int month, int year) {

        this.day = day;
        this.month = month;
        this.year = year;
    }

 

    public My_Date() {
    }

 

    public int getDay() {
        return day;
    }

 

    public void setDay(int day) {
        this.day = day;
    }

 

    public int getMonth() {
        return month;
    }

 

    public void setMonth(int month) {
        this.month = month;
    }

 

    public int getYear() {
        return year;
    }

 

    public void setYear(int year) {
        this.year = year;
    }
    
    public void display() {

        System.out.println(day + "  " + month + "  " + year);
    }


}

class job{

        private int id;
        private int salary;
        private String designation;

        // default constructor
        public job(){

        }

        // argumented constructor
        public job(int id_prime, int salary_prime, String designation_prime){
                
                // check for ID
                if(id_prime > 0){
                        this.id = id_prime;
                }
                else{
                        System.out.println("Enter the right ID ");
                }

                // check for Salary
                if(salary_prime > 0){
                        this.salary = salary_prime;
                }
                else{
                        System.out.println("Enter the right salary ");
                }

                // Designation
                this.designation = designation_prime;
        }

        // setters
        public void setId(int id_prime){
                // check for ID
                if(id_prime > 0){
                        this.id = id_prime;
                }
                else{
                        System.out.println("Enter the right ID ");
                }
        }

        public void setSalary(int salary_prime){
                  // check for Salary
                if(salary_prime > 0){
                        this.salary = salary_prime;
                }
                else{
                        System.out.println("Enter the right salary ");
                }
        }

        public void setDesignation(String designation_prime){
                // Designation
                this.designation = designation_prime;
        }


        // getters
        public int getId(){
                return id;
        }

        public int getSalary(){
                return salary;
        }

        public String getDesignation(){
                return designation;
        }


}

class address{

        private int home;
        private int street;
        private String city;

        // default constructor
        public address(){

        }

        // argumented constructor
        public address(int home_prime, int street_prime, String city_prime){
                
                // check for Home
                if(home_prime > 0){
                        this.home = home_prime;
                }
                else{
                        System.out.println("Enter the house number ");
                }

                // check for Street
                if(street_prime > 0){
                        this.street = street_prime;
                }
                else{
                        System.out.println("Enter the right street number ");
                }

                // City
                this.city = city_prime;
        }

        // setters
        public void setHome(int home_prime){
                // check for Home
                if(home_prime > 0){
                        this.home = home_prime;
                }
                else{
                        System.out.println("Enter the house number ");
                }
        }

        public void setStreet(int street_prime){
                // check for Street
                if(street_prime > 0){
                        this.street = street_prime;
                }
                else{
                        System.out.println("Enter the right street number ");
                }
        }

        public void setCity(String city_prime){
                // City
                this.city = city_prime;
        }


        // getters
        public int getHome(){
                return home;
        }

        public int getStreet(){
                return street;
        }

        public String getCity(){
                return city;
        }

        // display Methods
        public void display(){
                System.out.println("House Number is: " + home);
                System.out.println("Street Number is: " + street);
                System.out.println("City is: " + city);
        }
}

class person{

        private String firstName;
        private String lastName;
        private address a1;


        // default constructor
        public person(){
                this.a1 = new address(); 
        }

        // argumented constructor
        public person(String firstName_prime, String lastName_prime, address a1_prime){

                this.firstName = firstName_prime;
                this.lastName = lastName_prime;
                this.a1 = a1_prime;
        }

        // setters
        public void setFirstName(String firstName_prime){
                this.firstName = firstName_prime;
        }

        public void setLastName(String lastName_prime){
                this.lastName = lastName_prime;
        }
        public void setA1(address a1_prime){
                this.a1 = a1_prime;
        }

        // getters
        public String getFirstName(){
                return firstName;
        }
        public String getLastName(){
                return lastName;
        }
        public address getA1(){
                return a1;
        }

        // display Methods
        public void display()
        {
                System.out.println(firstName);
                System.out.println(lastName);
                System.out.println(a1.getHome() + "  " + a1.getStreet() + "  " + a1.getCity());
              
        }
    
        public void display2()
        {
                System.out.println(firstName);
                System.out.println(lastName);
                a1.display();
        }

        public boolean checkLocation(){

                boolean check = true;
                if(!a1.getCity().equalsIgnoreCase("Islamabad")){
                        check = false;
                }

                return check;
        }
}

class book{

        private person author;
        private String bookName;
        private String publisher;

        // default constructor
        public book(){
                this.author = new person(); 
        }

        // argumented constructor
        public book(person author_prime, String bookName_prime, String publisher_prime){

                this.author = author_prime;
                this.bookName = bookName_prime;
                this.publisher = publisher_prime;
                
        }

        // setters
        public void setAuthor(person author_prime){
                this.author = author_prime;
        }

        public void setBookName(String bookName_prime){
                this.bookName = bookName_prime;
        }
        public void setPublisher(String publisher_prime){
                this.publisher = publisher_prime;
        }

        // getters
        public person getAuthor(){
                return author;
        }
        public String getBookName(){
                return bookName;
        }
        public String getPublisher(){
                return publisher;
        }
        

        // display Methods
        public void display()
        {
                System.out.println(bookName);
                System.out.println(publisher);
                System.out.println(author.getFirstName() + "  " + author.getLastName() + "  " + author.getA1().getHome() + "  " + author.getA1().getStreet() + "  " + author.getA1().getCity());
              
        }
    
        public void display2()
        {
                System.out.println(bookName);
                System.out.println(publisher);
                author.display();
        }

        public boolean checkStreet(){
                
                boolean check = true;

                if(author.getA1().getStreet() > 10){
                        check = false;
                }

                return check;
        }

}
class pizza{

        private String size;
        private int no_Of_cheese_toppings;
        private int no_Of_pepperoni_toppings;
        private int no_Of_ham_toppings;

        // default constructor
        public pizza(){

        }

        // argumented constructor
        public pizza(String size_prime, int no_Of_cheese_toppings_prime, int no_Of_pepperoni_toppings_prime, int no_Of_ham_toppings_prime){
                this.size = size_prime;

                // Check for cheese Topings
                if(no_Of_cheese_toppings_prime >= 0){
                        this.no_Of_cheese_toppings = no_Of_cheese_toppings_prime;
                }
                else{
                        System.out.println("Enter the positive number");
                }

                // Check for Pepperoni Topings
                if(no_Of_pepperoni_toppings_prime >= 0){
                        this.no_Of_pepperoni_toppings = no_Of_pepperoni_toppings_prime;
                }
                else{
                        System.out.println("Enter the positive number");
                }

                // Check for ham Topings
                if(no_Of_ham_toppings_prime >= 0){
                        this.no_Of_ham_toppings = no_Of_ham_toppings_prime;
                }
                else{
                        System.out.println("Enter the positive number");
                }

        }       

        // setters
        public void setSize(String size_prime){
                size = size_prime;
        }
        public void SetNo_Of_cheese_toppings(int no_Of_cheese_toppings_prime){
                // Check for cheese Topings
                if(no_Of_cheese_toppings_prime >= 0){
                        this.no_Of_cheese_toppings = no_Of_cheese_toppings_prime;
                }
                else{
                        System.out.println("Enter the positive number");
                }
        }
        public void SetNo_Of_pepperoni_toppings(int no_Of_pepperoni_toppings_prime){
                // Check for cheese Topings
                if(no_Of_pepperoni_toppings_prime >= 0){
                        this.no_Of_pepperoni_toppings = no_Of_pepperoni_toppings_prime;
                }
                else{
                        System.out.println("Enter the positive number");
                }
        }
        public void SetNo_Of_ham_toppings(int no_Of_ham_toppings_prime){
                // Check for ham Topings
                if(no_Of_ham_toppings_prime >= 0){
                        this.no_Of_ham_toppings = no_Of_ham_toppings_prime;
                }
                else{
                        System.out.println("Enter the positive number");
                }
        }

        // getters
        public String getSize(){
                return size;
        }
        public int getNo_Of_cheese_toppings(){
                return no_Of_cheese_toppings;
        }
        public int getNo_Of_pepperoni_toppings(){
                return no_Of_pepperoni_toppings;
        }
        public int getNo_Of_ham_toppings(){
                return no_Of_ham_toppings;
        }

        public void display(){
                System.out.println("Size is: " + size);
                System.out.println("Total Cheese Toppings: " + no_Of_cheese_toppings);
                System.out.println("Total Pepperoni Toppings: " + no_Of_pepperoni_toppings);
                System.out.println("Total Ham Toppings: " + no_Of_ham_toppings);
        }
        public double calcCost(){

                int totalCost = 0;

                // for small size
                if(size.equalsIgnoreCase("small")){
                        totalCost = 10 + (2 * no_Of_cheese_toppings) + (2 * no_Of_pepperoni_toppings) + (2 * no_Of_ham_toppings);
                }
                // for small size
                else if(size.equalsIgnoreCase("medium")){
                        totalCost = 12 + (2 * no_Of_cheese_toppings) + (2 * no_Of_pepperoni_toppings) + (2 * no_Of_ham_toppings);
                }
                // for large size
                if(size.equalsIgnoreCase("large")){
                        totalCost = 14 + (2 * no_Of_cheese_toppings) + (2 * no_Of_pepperoni_toppings) + (2 * no_Of_ham_toppings);
                }

                return totalCost;

        }

        public String getDescription(){

                String q_cheese = no_Of_cheese_toppings + "";
                String q_pepperoni = no_Of_pepperoni_toppings + "";
                String q_ham = no_Of_ham_toppings + "";
                 
                return size + " " + q_cheese + " " + q_pepperoni + " " + q_ham;
        }

}

class pizzaOrder{

        private pizza pizza_1;
        private pizza pizza_2;
        private pizza pizza_3;

        // default constructor
        public pizzaOrder(){
                
                this.pizza_1 = new pizza();
                this.pizza_2 = new pizza();
                this.pizza_3 = new pizza();
        }

        public pizzaOrder(pizza pizza_1_prime, pizza pizza_2_prime, pizza pizza_3_prime){
                
                this.pizza_1 = pizza_1_prime;
                this.pizza_2 = pizza_2_prime;
                this.pizza_3 = pizza_3_prime;
        }

        // setters
        public void setPizza_1(pizza pizza_1_prime){
                this.pizza_1 = pizza_1_prime;
        }
        public void setPizza_2(pizza pizza_2_prime){
                this.pizza_2 = pizza_2_prime;
        }
        public void setPizza_3(pizza pizza_3_prime){
                this.pizza_3 = pizza_3_prime;
        }

        // getters
        public pizza getPizza_1(){
                return pizza_1;
        }
        public pizza getPizza_2(){
                return pizza_2;
        }
        public pizza getPizza_3(){
                return pizza_3;
        }

        public void display(){
                System.out.println(pizza_1.getSize() + " " + pizza_1.getNo_Of_cheese_toppings() + " " + pizza_1.getNo_Of_pepperoni_toppings() + " " + pizza_1.getNo_Of_ham_toppings());
                System.out.println(pizza_2.getSize() + " " + pizza_2.getNo_Of_cheese_toppings() + " " + pizza_2.getNo_Of_pepperoni_toppings() + " " + pizza_2.getNo_Of_ham_toppings());
                System.out.println(pizza_3.getSize() + " " + pizza_3.getNo_Of_cheese_toppings() + " " + pizza_3.getNo_Of_pepperoni_toppings() + " " + pizza_3.getNo_Of_ham_toppings());
        }
        public void display2(){
                pizza_1.display();
                pizza_2.display();
                pizza_3.display();
        }
        public double calcTotal(){

                return pizza_1.calcCost() + pizza_2.calcCost() + pizza_3.calcCost();
        }
}