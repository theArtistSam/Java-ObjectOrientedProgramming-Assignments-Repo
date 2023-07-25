/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2   
*/
import java.util.*;
import java.lang.*;
import java.util.Arrays;
public class OOP_Lab3_6{
        public static void main(String[] args){

        
        student s1 = new student();
        String[] array = {"Math", "OOP", "DSA", "Calculus", "Science"};
        s1.set_values("Sam", array, 3.3, "theArtistSam@gmail.com");
        s1.display();        
        System.out.println(s1.checkProbStatus());
        System.out.println(s1.searchSubject("DSA"));
        System.out.println(s1.validateEmail());
        }       
}

class student{

        String name;
        double gpa;
        String email;
        String[] subject = new String[5];


        // default constructor
        public student(){

        }

        // three argument constructor
        public student(String student, String[] array, double grades, String email_address){

                this.name = student;
                this.gpa = grades;
                this.email = email_address;
                if(array.length <= 5){
                        for(int i = 0; i < array.length; i++){
                                chapterName[i] = array[i];
                        }
                }
                else{
                        for(int i = 0; i < subject.length; i++){
                                chapterName[i] = array[i];
                        }       
                }

        }

        void set_values(String student, String[] array, double grades, String email_address){

                name = student;
                gpa = grades;
                email = email_address;

                if(array.length <= 5){
                        for(int i = 0; i < array.length; i++){
                                chapterName[i] = array[i];
                        }
                }
                else{
                        for(int i = 0; i < subject.length; i++){
                                chapterName[i] = array[i];
                        }       
                }

        }

        
        boolean checkProbStatus(){

                if(gpa < 2){
                        return true;
                }
                else{
                        return false;
                }
        }

        boolean searchSubject(String subject_name){
                
                boolean check = false;
                for(int i = 0; i < subject.length; i++){
                        if(subject[i].equals(subject_name)){
                                check = true;
                                break;
                        }
                }

                if(check == true){
                        return true;
                }
                else{
                        return false;
                }

        }

        boolean validateEmail(){
                
                boolean check = false;
                if(email.contains("@") && email.contains(".com")){
                        return true;
                }
                else{
                        return false;
                }

        }

        void display(){
                System.out.println("The name of the student is: " + name);
                System.out.println("GPA of the student is: " + gpa);
                System.out.println("The email of the student is: " + email);
                
                System.out.println("Subject names are");
                for(int i = 0; i < subject.length; i++){
                        System.out.print(subject[i] + " ");
                }
                System.out.println();
        }
        
}
