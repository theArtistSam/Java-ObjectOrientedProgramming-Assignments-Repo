
import java.util.*;
public class Question_1{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
         

        Question[] q_array = new Question[3];
        q_array[0] = new Question("1", "What is the square root of 4?", "2");
        q_array[1] = new Question("2", "Are you good at Math?", "yes");
        q_array[2] = new Question("3", "What is the capital of England?", "London");
        
        Student s1 = new Student("Abdullah", 20, "24", "123");
        Exam e1 = new Exam(q_array, s1, 0);
        
        e1.TakeExam();
    }

}

class Question {

    private String id;
    private String quesStatement;
    private String answer;

    // Argumented Constructor
    public Question(String id_prime, String quesStatement_prime, String answer_prime){

        this.id = id_prime;
        this.quesStatement = quesStatement_prime;
        this.answer = answer_prime;

    }  
    // Setters
    public void setID(String id_prime){
        this.id = id_prime;
    }
    public void setQuesStatement(String quesStatement_prime){
        this.quesStatement = quesStatement_prime;
    }
    public void setAnswer(String answer_prime){
        this.answer = answer_prime;
    }
    // Setters
    public String getID(){
        return id;
    }
    public String getQuesStatement(){
        return quesStatement;
    }
    public String getAnswer(){
        return answer;
    }
    
    public String toString(){

        return id + " " + quesStatement + " " + answer + " ";
    }

    
} 
class Person {

    private String name;
    private int age;

    // Default Constructor
    public Person(){

    }
    // Argumented Constructor
    public Person(String name_prime, int age_prime){

        this.name = name_prime;
        this.age = age_prime;

    }  
    
    // Setters
    public void setID(String name_prime){
        this.name = name_prime;
    }
    public void setQuesStatement(int age_prime){
        this.age = age_prime;
    }

    // Getters
    public String getID(){
        return name;
    }
    public int getAge(){
        return age;
    }
    
    public String toString(){

        return name + " " + age + " ";
    }
    
}

class Student extends Person{

    private String regID, pswd;

    // Default Constructor
    public Student(){

        super();
    }
    // Argumented Constructor
    public Student(String name_prime, int age_prime, String regID_prime, String pswd_prime){

        super(name_prime, age_prime);
        this.regID = regID_prime;
        this.pswd = pswd_prime;

    }  
    
    // Setters
    public void setRegID(String regID_prime){
        this.regID = regID_prime;
    }
    public void setPswd(String pswd_prime){
        this.pswd = pswd_prime;
    }

    // Getters
    public String getRegID(){
        return regID;
    }
    public String getPswd(){
        return pswd;
    }
    
    public String toString(){

        return super.toString() + " " + regID + " " + pswd + " ";
    }
    
}
class Exam {

    private Question[] q = new Question[3];
    private Student s;
    private double score;

    // Default Constructor
    public Exam(){

    }
    // Argumented Constructor
    public Exam(Question[] q_prime, Student s_prime, double score_prime){

        for (int i = 0; i < q_prime.length; i++) {
            this.q[i] = q_prime[i];
        }
        this.s = s_prime;
        this.score = score_prime;

    }  
    
    // Setters
    public void setQ(Question[] q_prime){
        for (int i = 0; i < q_prime.length; i++) {
            this.q[i] = q_prime[i];
        }
    }
    public void setS(Student s_prime){
        this.s = s_prime;
    }
    public void setQuesStatement(double score_prime){
        this.score = score_prime;
    }

    // Getters
    public Question[] getQ(){
        return q;
    }
    public Student getS(){
        return s;
    }
    public double getScore(){
        return score;
    }

    public String toString(){

        String str = "";

        for (int i = 0; i < q.length; i++) {
            str += q[i];
        }

        return str + " " + s.getRegID() + " " + s.getPswd() + " " + score + " ";
    }

    // Take Exam
    public void TakeExam(){
        // Presenting Questions
        for (int i = 0; i < q.length; i++) {
            System.out.println(q[i].getQuesStatement());
            String answer = Question_1.input.next();
            
            if(q[i].getAnswer().equalsIgnoreCase(answer)){
                System.out.println("You answered right!");;
                score++;
            }
        }   
    }
    public void displayStatus(){

        if(score < 50){
            System.out.println("Fail!");
        }
        else{
            System.out.println("Pass!");
        }

    }

}   