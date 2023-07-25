import java.io.*;
public class fileHandling{
    public static void main(String[] args) {
    
        department d1 = new department("CS", "ISB");
        student s1 = new student("hafif", "123456789101", "Male", "BCS 3A", 4, 3, d1);
        student s2 = new student("Sam", "123456789101", "Male", "BCS 3A", 4, 3, d1);
        student s3 = new student("Mansoor", "123456789101", "Male", "BCS 3A", 4, 3, d1);

        FileOperations f1 = new FileOperations();
        
        // ------------- ADDING NEW ELEMENTS ------------- //

        f1.writeToFile(d1, "department");
        
        f1.writeToFile(s1, "student");
        f1.writeToFile(s2, "student");
        f1.writeToFile(s3, "student");
       
        
        f1.readFromFile("student");
        f1.readFromFile("department");

        f1.searchByName("hafif", "student");
        f1.searchByDepartments("CS", "department");
        
        f1.delete("Hafif", "student");
        f1.update("Sam", "Fun", "student");
        f1.readFromFile("student");
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
