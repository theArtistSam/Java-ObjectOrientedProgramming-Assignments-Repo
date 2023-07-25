import java.io.*;
import java.io.Serializable;
//import java.util.Set;
public class fileHandling{
    public static void main(String[] args) {
        
        /* My_Date d2 = new My_Date(2, 4, 2001);
        company c1 = new company("nestle", "isb");
        product p1 = new product("slice", "juice", 50, d2, c1);
        
        System.out.println(d2.toString());
        System.out.println(c1.toString());
        System.out.println(p1.toString()); */
        
    }
}

   

class person implements Serializable{

    private String name, phone ,gender;

    // Default Constructor
    public person(){

    }

    // Argumented Constructor
    public person(String name_prime, String phone_prime, String gender_prime){
        this.name = name_prime;
        this.phone = phone_prime;
        this.gender = gender_prime;
        
    }

    // setters
    public void setGender(String gender_prime) {
        this.gender = gender_prime;
    }
    public void setName(String name_prime) {
        this.name = name_prime;
    }
    public void setPhone(String phone_prime) {
        this.phone = phone_prime;
    }

    // Getters
    public String getGender() {
        return gender;
    }
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }

    public String toString() {
        
        return name + " " + phone + " " + gender + " ";
    }

}

class student extends person{

    private String section;
    private int GPA, semester;
    private department d1;
    
    // Default Constructor
    public student(){
        super();
    }

    // Argumented Constructor
    public student(String name_prime, String phone_prime, String gender_prime, String section_prime, int GPA_prime, int semester_prime, department d1_prime){
        super(name_prime, phone_prime, gender_prime);
        this.section = section_prime;
        this.GPA = GPA_prime;
        this.semester = semester_prime;
        this.d1 = d1_prime;
    }

    // Setters
    public void setGPA(int GPA_prime) {
        this.GPA = GPA_prime;
    }
    public void setSection(String section_prime) {
        this.section = section_prime;
    }
    public void setSemester(int semester_prime) {
        this.semester = semester_prime;
    }
    public void setD1(department d1_prime) {
        this.d1 = d1_prime;
    }

    // Getters
    public int getGPA() {
        return GPA;
    }
    public String getSection() {
        return section;
    }
    public int getSemester() {
        return semester;
    }
    public department getD1() {
        return d1;
    }

    public String toString(){
        return section + " " + (GPA + "") + " " + (semester + "") + " " + super.toString() + " " + d1.toString();
    }

}

class department implements Serializable{

    private String name, location;

    // Default Constructor
    public department(){

    }

    // Argumented Constructor
    public department(String name_prime, String location_prime){
    
        this.name = name_prime;
        this.location = location_prime;
        
    }

    // Setters
    public void setLocation(String location_prime) {
        this.location = location_prime;
    }
    public void setName(String name_prime) {
        this.name = name_prime;
    }

    // Getters
    public String getLocation() {
        return location;
    }
    public String getName() {
        return name;
    }
    public String toString(){
        return name + " " + location + " ";
    }

}

class My_Date implements Serializable{
        
    private int day;
    private int month;
    private int year; 


    public My_Date(){

    }

    public My_Date(int day, int month, int year) {

        this.day = day;
        this.month = month;
        this.year = year;
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


    public String toString() {
        
        return day + "  " + month + "  " + year;
    }

    public void display() {

        System.out.println(day + "  " + month + "  " + year);
    }


}

class company implements Serializable{

    private String companyName;
    private String companyLocation;

    // Default Constructor 
    public company(){

    }

    // Argumented Constructor 
    public company(String companyName_prime, String companyLocation_prime){

        this.companyName = companyName_prime;
        this.companyLocation = companyLocation_prime;

    }

    // Setters
    public void setCompanyLocation(String companyLocation_prime) {
        this.companyLocation = companyLocation_prime;
    }

    public void setCompanyName(String companyName_prime) {
        this.companyName = companyName_prime;
    }

    // Getters

    public String getCompanyLocation() {
        return companyLocation;
    }

    public String getCompanyName() {
        return companyName;
    }

    // toString
    public String toString() {
        return companyName + " " + companyLocation;
    }
}

class product implements Serializable{

    private String name, category;
    private double price;
    private My_Date dateOfExpiry;
    private company c;

    // Default Constructor
    public product(){

    }

    // Argiumented Constructor
    public product(String name_prime, String category_prime, double price_prime, My_Date date_prime, company c_prime){

        this.name = name_prime;
        this.category = category_prime;
        this.dateOfExpiry = date_prime;
        this.price = price_prime;
        this.c = c_prime;
    }

    // setters
    public void setC(company c_prime) {
        this.c = c_prime;
    }
    public void setCategory(String category_prime) {
        this.category = category_prime;
    }
    public void setDateOfExpiry(My_Date dateOfExpiry_prime) {
        this.dateOfExpiry = dateOfExpiry_prime;
    }
    public void setName(String name_prime) {
        this.name = name_prime;
    }
    public void setPrice(double price_prime) {
        this.price = price_prime;
    }

    // Getters
    public company getC() {
        return c;
    }
    public String getCategory() {
        return category;
    }
    public My_Date getDateOfExpiry() {
        return dateOfExpiry;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    public String toString() {
        return name + " " + category + " " + dateOfExpiry.toString() + " " + c.toString() + " " + price; 
    }
}