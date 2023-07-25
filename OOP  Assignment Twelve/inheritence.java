
/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2   
*/
import java.util.*;
import java.lang.*;
import java.util.Arrays;
public class inheritence{
        public static void main(String[] args){

                /*// Laptop Class
                laptop l1 = new laptop(20, 500, 1000, 50, 30, 40, 50, 150);
                l1.display();

                System.out.println("\n");

                // Publication Class
                publication p1 = new publication("Welcome Home", 456);
                p1.display();

                System.out.println("\n");
                
                // Book Class
                book b1 = new book();
                b1.display();

                System.out.println("\n");

                // Tape Class
                tape t1 = new tape("Welcome Home", 456, 60);
                t1.display();*/
                           
                // Simple Class
                simple s1 = new simple(6, 5);

                // Verified Simple Class
                verifiedSimple v1 = new verifiedSimple(5, 4);
                v1.sum();

                /*// Person Class
                person p1 = new person("Sam", "Islamabad", "03324532345", "hiidk@gmail.com");
                p1.display();

                System.out.println();

                // Date Class
                My_Date d1 = new My_Date(2,10,2020);

                // Employee Class
                employee e1 = new employee("Sam", "Islamabad", "03324532345", "hiidk@gmail.com", "3", 55000, d1);
                e1.display();

                // Staff Class
                staff s1 = new staff("Sam", "Islamabad", "03324532345", "hiidk@gmail.com", "3", 55000, d1, "Whatcha doin' there, pal?");
                s1.display();*/

        }
               
}

class Computer{


        protected int wordSize;
        protected int memorySize;
        protected int storageSize;
        protected int speed;

        // default constructor
        public Computer(){

        }

        //Argumented Constructor
        public Computer(int wordSize_prime, int memorySize_prime, int storageSize_prime, int speed_prime){
                this.wordSize = wordSize_prime;
                this.memorySize = memorySize_prime;
                this.storageSize = storageSize_prime;
                this.speed = speed_prime;
        }

        public void display(){
                System.out.println("wordSize is: " + wordSize);
                System.out.println("memorySize is: " + memorySize);
                System.out.println("storageSize is: " + storageSize);
                System.out.println("speed is: " + speed);
        }
}

class laptop extends Computer{

        private int length;
        private int width;
        private int height;
        private int weight;


        // default constructor
        public laptop(){
                super();
        }

        // argumented constructor
        public laptop(int wordSize_prime, int memorySize_prime, int storageSize_prime, int speed_prime, int length_prime, int width_prime, int height_prime, int weight_prime){
                super(wordSize_prime, memorySize_prime, storageSize_prime, speed_prime);
                this.length = length_prime;
                this.width = width_prime;
                this.height = height_prime;
                this.weight = weight_prime;

        }

        public void display(){
                
                super.display();
                System.out.println("length is: " + length);
                System.out.println("width is: " + width);
                System.out.println("height is: " + height);
                System.out.println("weight is: " + weight);

        }

}

class publication{


        protected String title;
        protected int price;

        //default constructor
        public publication(){

        }

        //argumented constructor
        public publication(String title_prime, int price_prime){

                this.title = title_prime;
                this.price = price_prime;
        }

        public void display(){
                System.out.println("Title is: " + title);
                System.out.println("Price is: " + price);
        }

}

class book extends publication{

        private int pageCount;

        //default constructor
        public book(){

                super();
        }

        //argumented constructor
        public book(String title_prime, int price_prime, int pageCount_prime){

                super(title_prime, price_prime);
                this.pageCount = pageCount_prime;
        }

        public void display(){
                super.display();
                System.out.println("Page Count is: " + pageCount);
        }

}

class tape extends publication{

        private int playingTimeInMinutes;

        //default constructor
        public tape(){
                super();
        }

        //argumented constructor
        public tape(String title_prime, int price_prime, int playingTimeInMinutes_prime){

                super(title_prime, price_prime);
                this.playingTimeInMinutes = playingTimeInMinutes_prime;
        }

        public void display(){
                super.display();
                System.out.println("Playing time is: " + playingTimeInMinutes);
        }

}


class person{


        protected String name;
        protected int age;

        //default constructor
        public person(){

        }

        //argumented constructor
        public person(String name_prime, int age_prime){

                this.name = name_prime;
                this.age = age_prime;
        }

        // getters
        public String getName(){
                return name;
        }

        public int getAge(){
                return age;
        }

        public void display(){
                
                System.out.println("Name is: " + name);
                System.out.println("Age is: " + age);
        }

}

class vehicle{

        protected String manuName;
        protected int numberOfCylinders;
        protected person owner;

        //default constructor
        public vehicle(){
                
        }

        //argumented constructor
        public vehicle(String manuName_prime, int numberOfCylinders_prime, person owner_prime){

                this.manuName = manuName_prime;
                this.numberOfCylinders = numberOfCylinders_prime;
                this.owner = owner_prime;
        }

        // getters
        public String getManuName(){
                return manuName;
        }

        public int getAnumberOfCylinders(){
                return numberOfCylinders;
        }

        public person getOwner(){
                return owner;
        }

        public void display(){
                
                System.out.println("Manufacturer’s name is: " + manuName);
                System.out.println("Number of Cylinders are: " + numberOfCylinders);
                owner.display();
        }

}

class truck extends vehicle{

        private double loadingCap;
        private int towingCapicity;

        //default constructor
        public truck(){
                super();
        }

        //argumented constructor
        public truck(String manuName_prime, int numberOfCylinders_prime, person owner_prime, double loadingCap_prime, int towingCapicity_prime){
                
                super(manuName_prime, numberOfCylinders_prime, owner_prime);
                this.loadingCap = loadingCap_prime;
                this.towingCapicity = towingCapicity_prime;
        }

        public void display(){

                System.out.println("Loading Capicity is: " + loadingCap);
                System.out.println("towingCapicity Capicity is: " + towingCapicity);
                System.out.println("manuName is: " + manuName);
                System.out.println("Number of Cylinders is: " + numberOfCylinders);
                System.out.println("Owner: " + owner.getName() + " " + owner.getAge());
        }

}

class simple{


        protected int num1;
        protected int num2;


        // default constructor
        public simple(){

        }

        
        // Argumented constructor
        public simple(int num1_prime, int num2_prime){
                
                this.num1 = num1_prime;
                this.num2 = num2_prime;
        }

        //setters
        public void setNum1(int num1_prime){
                this.num1 = num1_prime;
        }

        public void setNum2(int num2_prime){
                this.num2 = num2_prime;
        }

        //getters
        public int getNum1(){
                return num1;
        }

        public int getNum2(){
                return num2;
        }

        public void sum(){

                System.out.println("Sum of two numbers is: " + (num1 + num2));
        }

        public void sub(){

                System.out.println("Sub of two numbers is: " + (num1 - num2));
        }

        public void mul(){

                System.out.println("Mul of two numbers is: " + (num1 * num2));
        }

        public void div(){

                System.out.println("Div of two numbers is: " + (num1 / num2));
        } 
}

class verifiedSimple extends simple{


        public verifiedSimple(){
                super();
        }

        public verifiedSimple(int num1_prime, int num2_prime){
                super(num1_prime, num2_prime);
        }

        public void sum(){
                
                if(getNum1() > 0 && getNum2() > 0){
                        super.sum();
                }
                else{
                        System.out.println("Add number greater than 0");              
                }
        }

        public void sub(){
                if(getNum1() > 0 && getNum2() > 0){
                        super.sub();
                }
                else{
                        System.out.println("Add number greater than 0");              
                }
        }

        public void mul(){
                if(getNum1() > 0 && getNum2() > 0){
                        super.mul();
                }
                else{
                        System.out.println("Add number greater than 0");              
                }
        }

        public void div(){
                if(getNum1() > 0 && getNum2() > 0){
                        super.div();
                }
                else{
                        System.out.println("Add number greater than 0");              
                }
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

class person{

        protected String name;
        protected String address;
        protected String phoneNumber;
        protected String email;

        // default constructor
        public person(){

        }

        // argumented constructor
        public person(String name_prime, String address_prime, String phoneNumeber_prime, String email_prime){
                
                this.name = name_prime;
                this.address = address_prime;
                this.phoneNumber = phoneNumeber_prime;
                this.email = email_prime;
        }

        //setters
        public void setName(String name_prime){
                this.name = name_prime;
        }

        public void setAddress(String address_prime){
                this.address = address_prime;
        }

        public void setPhoneNumber(String phoneNumeber_prime){
                this.phoneNumber = phoneNumeber_prime;
        }

        public void setEmail(String email_prime){
                this.email = email_prime;
        }

        //getters
        public String getName(){
                return name;
        }

        public String getAddress(){
                return address;
        }

        public String getPhoneNumber(){
                return phoneNumber;
        }

        public String getEmail(){
                return email;
        }

        public String toString(){

                return name + " " + address + " " + phoneNumber + " " + email; 
        }
        public void display(){
                System.out.println("Name is: " + name);
                System.out.println("\nAddress is: " + address);
                System.out.println("\nPhone Number is: " + phoneNumber);
                System.out.println("\nEmail is: " + email);
        }
}

class student extends person{

        private String status;

        // default constructor
        public student(){

                super();
        }

        // argumented constructor
        public student(String name_prime, String address_prime, String phoneNumeber_prime, String email_prime, String status_prime){
                
                
                super(name_prime, address_prime, phoneNumeber_prime, email_prime);
                this.status = status_prime;
        }

        public void display(){
                System.out.println("Name is: " + getName());
                System.out.println("\nAddress is: " + getAddress());
                System.out.println("\nPhone Number is: " + getPhoneNumber());
                System.out.println("\nEmail is: " + getEmail());
                System.out.println("\nStatus is: " + status);
        }
}
class employee extends person{
        
        private String office;
        private int salary;
        private My_Date date;

        // default constructor
        public employee(){

                super();
        }

        // argumented constructor
        public employee(String name_prime, String address_prime, String phoneNumeber_prime, String email_prime, String office_prime, int salary_prime, My_Date date_prime){
                
                super(name_prime, address_prime, phoneNumeber_prime, email_prime);
                this.office = office_prime;
                this.salary = salary_prime;
                this.date = date_prime;

        }

        // setters
        public void setOffice(String office_prime){
                this.office = office_prime;
        }

        public void setSalary(int salary_prime){
                this.salary = salary_prime;
        }

        public void setDate(My_Date date_prime){
                this.date = date_prime;
        }


        //getters
        public String getOffice(){
                return office;
        }

        public int getSalary(){
                return salary;
        }
        public My_Date getDate(){
                return date;
        }

        public void display(){
                System.out.println("Name is: " + getName());
                System.out.println("\nAddress is: " + getAddress());
                System.out.println("\nPhone Number is: " + getPhoneNumber());
                System.out.println("\nEmail is: " + getEmail());
                System.out.println("Office is: " + office);
                System.out.println("\nSalray is: " + salary);
                date.display();
        }        

}

class faculty extends employee{
        

        private int officeHours;
        private String rank;

        // default constructor
        public faculty(){

                super();
        }

        // argumented constructor
        public faculty(String name_prime, String address_prime, String phoneNumeber_prime, String email_prime, String office_prime, int salary_prime, My_Date date_prime, int officeHours_prime, String rank_prime){
                
                super(name_prime, address_prime, phoneNumeber_prime, email_prime, office_prime, salary_prime, date_prime);
                this.officeHours = officeHours_prime;
                this.rank = rank_prime;

        }

        public void display(){
                
                System.out.println("Name is: " + getName());
                System.out.println("\nAddress is: " + getAddress());
                System.out.println("\nPhone Number is: " + getPhoneNumber());
                System.out.println("\nEmail is: " + getEmail());

                System.out.println("Office is: " + getOffice());
                System.out.println("\nSalray is: " + getSalary());
                getDate().display();

                System.out.println("Office hours are: " + officeHours);
                System.out.println("\nRank is: " + rank);
        }


}
class staff extends employee{

        protected String title;

                // default constructor
        public staff(){

                super();
        }

        // argumented constructor
        public staff(String name_prime, String address_prime, String phoneNumeber_prime, String email_prime, String office_prime, int salary_prime, My_Date date_prime, String title_prime){
                
                super(name_prime, address_prime, phoneNumeber_prime, email_prime, office_prime, salary_prime, date_prime);
                this.title = title_prime;

        }

        public void display(){

                System.out.println("Name is: " + getName());
                System.out.println("\nAddress is: " + getAddress());
                System.out.println("\nPhone Number is: " + getPhoneNumber());
                System.out.println("\nEmail is: " + getEmail());

                System.out.println("Office is: " + getOffice());
                System.out.println("\nSalray is: " + getSalary());
                getDate().display();

                System.out.println("\nTitle is: " + title);
        }
 
        
}