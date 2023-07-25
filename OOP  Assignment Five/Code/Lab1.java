/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Lab Task: Recurrsion   
*/
import java.util.*;
import java.lang.*;
import java.util.Arrays;
public class Lab1{
        static Scanner input = new Scanner(System.in);
        public static void main (String[] args){



        // Method 1
        System.out.println("Power is: " + power(4, 5));
        System.out.println("-----------------");
        // Method 2
        pattern();
        //Mehtod 3
        printLinearArray(array());
        // Method 4
        System.out.println("\n-----------------");
        System.out.println("Concatenated String is: " + concat("good", " luck"));
        // Method 5
        sum_average();
        // Method 6
        highest_array();
        // Method 7
        min_array();
        // Method 8
        telephone_array();
        // Method 10
        System.out.println("--------------\nNew String is: " + replace_Character());
        // Method 11
        email();
        //Method 9
        issues();

        }
        // Question Number 1
        public static double power(double num1, double num2){

                double power = Math.pow(num1, num2); 
                
                return power;
        }

        // Question Number 2
        public static void pattern(){

                for(int i = 0; i < 6; i++){
                        for(int j = 0; j < i; j++){
                                if(j == 0){
                                        System.out.print(i + " ");        
                                }
                                
                                if(j > -1){
                                    System.out.print("*" + " ");        
                                }

                                
                        }
                        for(int k = 0; k < i; k++){
                                if(k == 0)
                               System.out.print(i + " ");
                        }

                        System.out.println();
                }
        }

        public static int[] array(){
                System.out.println("-----------------\nEnter Values");
                int even = 0;
                int odd = 0;

                int[] array = new int[5];
                for(int i = 0; i < array.length; i++){
                        int user = input.nextInt();
                        if(user == 0){
                                continue;
                        }
                        else{
                                array[i] = user;
                        }
                }
                for(int i = 0; i < array.length; i++){
                        if(array[i] % 2 == 0){
                                even++;
                        }
                        else{
                                odd++;
                        }
                }

                System.out.println("Even numbers are: " + even);
                System.out.println("Odd numbers are: " + odd);

                return array;
        } 

        public static void printLinearArray(int[] array){
                System.out.println("-----------------");
                for(int i = 0; i < array.length; i++){
                        System.out.print(array[i] + " ");
                }
        }

        public static String concat(String s1, String s2){
                String join = s1 + s2;
                return join;
        }
        public static void sum_average(){
                int[] array = {1, 2, 3, 4, 5};
                int sum = 0;
                for(int i = 0; i < array.length; i++){
                        sum+= array[i];
                }
                System.out.println("------------\nSum is: " + sum);
                System.out.println("------------\nAverage is: " + sum/(array.length));

        }
        public static void highest_array(){
                int[] array = new int[5];
                System.out.println("-------------\nEnter array elements: ");
                
                for(int i = 0; i < array.length; i++){
                        int user = input.nextInt();
                        array[i] = user;        
                }
                int max = array[0];
                for(int i = 0; i < array.length; i++){
                        if(array[i] > max){
                                max = array[i];
                        }        
                }
                System.out.println("-------------\nMax value of array is: " + max);
        }
        public static void min_array(){
                int[] array = new int[5];
                System.out.println("-------------\nEnter array elements: ");
                
                for(int i = 0; i < array.length; i++){
                        int user = input.nextInt();
                        array[i] = user;        
                }
                int min = array[0];
                for(int i = 0; i < array.length; i++){
                        if(array[i] < min){
                                min = array[i];
                        }        
                }
                System.out.println("-------------\nMinimum value of array is: " + min);
        }
        public static void telephone_array(){
                
                int[] telephone_Service = new int[10];
                System.out.println("-------------\nEnter [1] for excellent service\nEnter [2] for good service\nEnter [3] for Average service\nEnter [4] for below average service\nEnter [5] for poor service");       
                int choice_1 = 0;
                int choice_2 = 0;
                int choice_3 = 0;
                int choice_4 = 0;
                int choice_5 = 0;
                for(int i = 0; i < telephone_Service.length; i++){
                        int user = input.nextInt();
                        telephone_Service[i] = user;        
                }
                for(int i = 0; i < telephone_Service.length; i++){
                        if(telephone_Service[i] == 1){
                                choice_1++;
                        }
                        else if(telephone_Service[i] == 2){
                                choice_2++;
                        }
                        else if(telephone_Service[i] == 3){
                                choice_3++;
                        }
                        else if(telephone_Service[i] == 4){
                                choice_4++;
                        }
                        else if(telephone_Service[i] == 5){
                                choice_5++;
                        }       
                }
                System.out.println("-------------\n" + choice_1 + " Users rated Excellent Service");
                System.out.println(choice_2 + " Users rated Good Service");
                System.out.println(choice_3 + " Users rated Average Service");
                System.out.println(choice_4 + " Users rated Below Average Service");
                System.out.println(choice_5 + " Users rated Poor Service");
        }

        public static String replace_Character(){
                String string = "WelcTme tT TutTrialspTint.cTm";
                String new_String = string.replace("T","O");
                return new_String;
        }
        public static void email(){
                System.out.println("Enter your email address");
                String string = input.next();
                String username = string.substring(0, string.indexOf("@"));
                System.out.println("-------------\nUsername is: " + username);

        }
        public static void issues(){
                String[] issues = {"Political", "Environmental", "Social", "Pollution", "Violence"};
                int[][] display = new int[5][10];
                System.out.println("------------------\nGive your Opinion");
                System.out.println("Press [1] for Political");
                System.out.println("Press [2] for Environmental");
                System.out.println("Press [3] for Social");
                System.out.println("Press [4] for Pollution");
                System.out.println("Press [5] for Violence");

                for(int i = 0; i < display.length; i++){
                        for(int j = 0; j < display[i].length; j++){
                                display[i][j] = input.nextInt();
                        }
                }

                int average = 0;

                int choice_1 = 0;
                int choice_2 = 0;
                int choice_3 = 0;
                int choice_4 = 0;
                int choice_5 = 0;

                for(int i = 0; i < display.length; i++){
                        for(int j = 0; j < display[i].length; j++){
                                if(display[i][j] == 1){
                                        choice_1++;
                                }
                                else if(display[i][j] == 2){
                                        choice_2++;
                                }
                                else if(display[i][j] == 3){
                                        choice_3++;
                                }
                                else if(display[i][j] == 4){
                                        choice_4++;
                                }
                                else if(display[i][j] == 5){
                                        choice_5++;
                                }
                                
                        }
                }

                average = (choice_1 + choice_2 + choice_3 + choice_4 + choice_5) / 10;
                //System.out.println("Average is: " + average);
        
                if(choice_1 > choice_2  && choice_1 > choice_3 && choice_1 > choice_4 && choice_1 > choice_5){
                        System.out.println("Political is the higest issue: " + choice_1 + " times");
                }                
                if(choice_2 > choice_1  && choice_2 > choice_3 && choice_2 > choice_4 && choice_2 > choice_5){
                        System.out.println("Environmental is the higest issue: " + choice_2 + " times");
                }
                if(choice_3 > choice_1  && choice_3 > choice_2 && choice_3 > choice_4 && choice_3 > choice_5){
                        System.out.println("Social is the higest issue: " + choice_3 + " times");
                }
                if(choice_4 > choice_1  && choice_4 > choice_2 && choice_4 > choice_3 && choice_4 > choice_5){
                        System.out.println("Pollution is the higest issue: " + choice_4 + " times");
                }
                if(choice_5 > choice_1  && choice_5 > choice_2 && choice_5 > choice_3 && choice_5 > choice_4){
                        System.out.println("Violence is the higest issue: " + choice_5 + " times");
                }

                System.out.println("-------------------");
                
                if(choice_1 < choice_2  && choice_1 < choice_3 && choice_1 < choice_4 && choice_1 < choice_5){
                        System.out.println("Political is the lowest issue: " + choice_1 + " times");
                }                
                if(choice_2 < choice_1  && choice_2 < choice_3 && choice_2 < choice_4 && choice_2 < choice_5){
                        System.out.println("Environmental is the lowest issue: " + choice_2 + " times");
                }
                if(choice_3 < choice_1  && choice_3 < choice_2 && choice_3 < choice_4 && choice_3 < choice_5){
                        System.out.println("Social is the lowest issue: " + choice_3 + " times");
                }
                if(choice_4 < choice_1  && choice_4 < choice_2 && choice_4 < choice_3 && choice_4 < choice_5){
                        System.out.println("Pollution is the lowest issue: " + choice_4 + " times");
                }
                if(choice_5 < choice_1  && choice_5 < choice_2 && choice_5 < choice_3 && choice_5 < choice_4){
                        System.out.println("Violence is the lowest issue: " + choice_5 + " times");
                }

                System.out.println("-------------------");

                if(average == 1){
                        System.out.println("Political is the average issue: " + average + " times");
                }
                if(average == 2){
                        System.out.println("Environmental is the average issue: " + average + " times");
                }
                if(average == 3){
                        System.out.println("Social is the average issue: " + average + " times");
                }
                if(average == 4){
                        System.out.println("Pollution is the average issue: " + average + " times");
                }
                if(average == 5){
                        System.out.println("Violence is the average issue: " + average + " times");
                }
        }

}

