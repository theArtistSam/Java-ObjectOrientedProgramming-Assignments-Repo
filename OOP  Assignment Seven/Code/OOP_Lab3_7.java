/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2   
*/
import java.util.*;
import java.lang.*;
import java.util.Arrays;
public class OOP_Lab3_7{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String[] array = new String[20];
        array[0] = "CS";
        array[1] = "SE";
        array[2] = "EE";
        array[3] = "BBA";
        array[4] = "AI";
        university u1 = new university("Comsats", array, "Islamabad", "Anwar");
        
        u1.display();        
        System.out.println(u1.checkIfLocationIsInCaptial());
        System.out.println("Enter elements! Press [0] to Exit");
        while(true){
                String user = input.next();
                if(user.equals("0")){
                        break;
                }
                else{
                        u1.addDepartments(user);        
                }
                
        }
        
        u1.display();
        }       
}

class university{
        
        String uniName;
        String location;
        String rectorName;
        String[] departments = new String[20];
        
        // default constructor
        public university(){

        }

        // two argument constructor
        public university(String name, String rector_name){

                if(name.length() > 2){
                        this.uniName = name;        
                }
                else{
                        System.out.println("Small in length. Add right user name!");
                }
                if(rector_name.length() > 2){
                        this.rectorName = rector_name;        
                }
                else{
                        System.out.println("Small in length. Add right user name!");
                }

        }

        // all argument constructor
        public university(String name, String[] array, String place, String rector_name){

                if(name.length() > 2){
                        this.uniName = name;        
                }
                else{
                        System.out.println("Small in length. Add right user name!");
                }
                
                if(array.length <= 20){
                        for(int i = 0; i < array.length; i++){
                                chapterName[i] = array[i];
                        }
                }
                else{
                        for(int i = 0; i < departments.length; i++){
                                chapterName[i] = array[i];
                        }       
                }
                
                if(place.length() > 2){
                        this.location = place;        
                }
                else{
                        System.out.println("Small in length. Add right user name!");
                }

                if(rector_name.length() > 2){
                        this.rectorName = rector_name;        
                }
                else{
                        System.out.println("Small in length. Add right user name!");
                }
                

        }

        void set_values(String name, String[] array, String place, String rector_name){

                if(name.length() > 2){
                        uniName = name;        
                }
                else{
                        System.out.println("Small in length. Add right user name!");
                }
                
                if(array.length <= 20){
                        for(int i = 0; i < array.length; i++){
                                chapterName[i] = array[i];
                        }
                }
                else{
                        for(int i = 0; i < departments.length; i++){
                                chapterName[i] = array[i];
                        }       
                }
                
                if(place.length() > 2){
                        location = place;        
                }
                else{
                        System.out.println("Small in length. Add right user name!");
                }

                if(rector_name.length() > 2){
                        rectorName = rector_name;        
                }
                else{
                        System.out.println("Small in length. Add right user name!");
                }

        }

        
        void addDepartments(String abc){

                for(int i = 0; i < departments.length; i++){
                        if(departments[i] == null){
                                departments[i] = abc;
                                break;
                        }
                }
                
        }

        boolean checkIfLocationIsInCaptial(){
                
                
                if(location.equalsIgnoreCase("islamabad")){
                        return true;
                }
                else{
                        return false;
                }

        }

        void display(){
                System.out.println("The name of the university is: " + uniName);
                System.out.println("Location of university is: " + location);
                System.out.println("Rector name is: " + rectorName);

                System.out.println("Departments names are and its length is " + departments.length);
                for(int i = 0; i < departments.length; i++){
                        if(departments[i] == null){
                                continue;
                        }
                        System.out.print(departments[i] + " ");
                }
                System.out.println();
        }
        
}
