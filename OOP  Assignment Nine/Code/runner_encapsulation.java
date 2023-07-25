/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2   
*/
import java.util.*;
import java.lang.*;
import java.util.Arrays;
public class runner_encapsulation{
        public static void main(String[] args){
                Scanner input = new Scanner(System.in);
                
                // rectangle class
                /*rectangle r1 = new rectangle();
                rectangle r2 = new rectangle(4, 5);
                r1.setLength(25);
                
                if(r1.getLength() > r2.getLength()){
                        System.out.println("Object 1 has greater length");
                }
                
                else{
                        System.out.println("Object 2 has greater length");    
                }

                System.out.println();

                // Point class
                point p1 = new point();
                point p2 = new point(4, 5);

                p1.setY(5);
                p2.setY(p1.getY());
                System.out.println(p2.getY());*/

                // method with in a method!
                /*fraction f1 = new fraction(4, 5);
                fraction f2 = new fraction(4, 5);
                System.out.println(f1.fractionCheck(f2));*/

                // method with in a method!
                /*book b1 = new book("Sam", "One");
                book b2 = new book("Sam Edwards", "One");
                b1.display();
                b2.display();
                System.out.println("----------------------\n" + b1.authorsCheck(b2));*/

                // student class
                int[] array = {45, 46, 47, 48, 49};
                int[] array_2 = {50, 51, 52, 53, 54, 55};
                student s1 = new student("Sam", array);
                student s2 = new student("Hafif", array_2);
                student s3 = new student("Sam", array_2);

                s1.display();
                s2.display();
                s3.display();


                // account class
                account a1 = new account(25000);
                account a2 = new account(25000);

                a1.display();
                a1.deposit(5000);
                a1.display();
                a1.withdraw(500);
                a1.display();
                a2.display();
                

                // Marks class
                marks m1 = new marks(45, 55, 65);
                marks m2 = new marks(78, 54, 98);

                if(m1.calculatePercentage(300) > m2.calculatePercentage(300)){
                        System.out.println("M1 has gotten more grades");
                        m1.display();
                }
                else{
                        System.out.println("M2 has gotten more grades");        
                        m2.display();
                }

                if(m1.getMark1() > m2.getMark1()){
                        System.out.println("M1 has gotten more grades in subject 1");
                        System.out.println(m1.getMark1());
                }
                else{
                        System.out.println("M2 has gotten more grades in subject 1");        
                        System.out.println(m2.getMark1());
                }                
        }
               
}

class rectangle{

        private int length;
        private int width;


        // default constructor
        public rectangle(){

        }

        // argument constructor
        public rectangle(int val_length, int val_width){

                // length check
                if(val_length > 0){
                        this.length = val_length;
                }
                else{
                        System.out.println("Add the right length!");
                }

                // width check
                if(val_width > 0){
                        this.width = val_width;
                }
                else{
                        System.out.println("Add the right width!");
                }
        }

        // setters
        public void setLength(int val_length){
                if(val_length > 0){
                        length = val_length;
                }
                else{
                        System.out.println("Add the right length!");
                }
                
        }

        public void setWidth(int val_width){

                if(val_width > 0){
                        width = val_width;
                }
                else{
                        System.out.println("Add the right width!");
                }
        }

        // getters
        public int getLength(){
                return length;
        }

        public int getWidth(){
                return width;
        }


        public void display(){

                System.out.println("-------------------\nThe rectangle has a length of: " + length);
                System.out.println("The rectangle has a width of: " + width);
        }        

        public void area(){

                int area = length * width;
                System.out.println("The rectangle has an area of: " + area);
        }

}

class point{

        private int x;
        private int y;

        // default constructor
        public point(){

        }

        // argument constructor
        public point(int val_x, int val_y){

                this.x = val_x;
                this.y = val_y;
        }

        // setters
        public void setX(int val_x){
                x = val_x;
        }

        public void setY(int val_y){

                y = val_y;
        }

        // getters
        public int getX(){
                return x;
        }

        public int getY(){
                return y;
        }
        
        public void display(){

                System.out.println("-------------------\nThe point is at x: " + x);
                System.out.println("The point is at y: " + y);
        }        

        public void move(int x_axis, int y_axis){

                x += x_axis;
                y += y_axis;
                System.out.println("The rectangle has now at x: " + x_axis + " and y: " + y_axis);
        }

}

class student{

        private String name;
        private int[] result_array = new int[5];

        // default constructor
        public student(){

        }

        // argument constructor
        public student(String student_name, int[] grades_array){

                this.name = student_name;
                if(grades_array.length <= 5){
                        for(int i = 0; i < grades_array.length; i++){
                                result_array[i] = grades_array[i];
                        }
                }
                else{
                        for(int i = 0; i < result_array.length; i++){
                                result_array[i] = grades_array[i];
                        }
                }
                
        }

        // setters
        public void setName(String student_name){
                name = student_name;
        }

        public void setArray(int[] grades_array){

                if(grades_array.length <= 5){
                        for(int i = 0; i < grades_array.length; i++){
                                result_array[i] = grades_array[i];
                        }
                }
                else{
                        for(int i = 0; i < result_array.length; i++){
                                result_array[i] = grades_array[i];
                        }
                }
        }

        // getters
        public String getName(){
                return name;
        }

        public int[] getArray(){
                return result_array;
        }

        public int average(){
                int sum = 0;
                int average = 0;
                for(int i = 0; i < result_array.length; i++){
                        sum += result_array[i];
                }
                average = sum/result_array.length;
                return average;
        }
        
        public void display(){

                System.out.println("-------------------\nThe name of the student is: " + name);
                System.out.println("Grades of student are: ");
                for(int i = 0; i < result_array.length; i++){
                        if(result_array[i] != 0){
                                System.out.println(result_array[i]);        
                        }
                }
        }        

}

class account{

        private int balance;

        // default constructor
        public account(){

        }

        // argument constructor
        public account(int money){

                
                if(money > 0){
                        this.balance = money;
                }
                
        }

        // setters
        public void setBalance(int money){
               if(money > 0){
                        this.balance = money;
                }
        }

        // getters
        public int getBalance(){
                return balance;
        }

        public int deposit(int add_money){
                if(add_money > 0){
                        balance += add_money;        
                }
                
                return balance;
        }

        public int withdraw(int take_money){
                if(take_money <= balance){
                        balance -= take_money;        
                }
                
                return balance;
        }
        
        public void display(){

                System.out.println("-------------------\nYour Current Balance is: " + balance);
        }        

}

class marks{

        private int mark_1;
        private int mark_2;
        private int mark_3;

        // default constructor
        public marks(){

        }

        // argument constructor
        public marks(int grades_1, int grades_2, int grades_3){

                if(grades_1 > 0 && grades_2 > 0 && grades_3 > 0){
                        this.mark_1 = grades_1;
                        this.mark_2 = grades_2;
                        this.mark_3 = grades_3;

                }
                
        }

        // setters
        public void setMark1(int grades_1){
                if(grades_1 > 0){
                        mark_1 = grades_1;
                }
        }

        public void setMark2(int grades_2){
                if(grades_2 > 0){
                        mark_2 = grades_2;
                }
        }

        public void setMark3(int grades_3){
                if(grades_3 > 0){
                        mark_3 = grades_3;
                }
        }


        // getters
        public int getMark1(){
                return mark_1;
        }

        public int getMark2(){
                return mark_2;
        }

        public int getMark3(){
                return mark_3;
        }

        // methods
        private int calculateTotalMarks(){
        
                return mark_1 + mark_2 + mark_3;
        }
        
        public double calculatePercentage(int total_marks){

                double percentage = (calculateTotalMarks() / total_marks) * 100;

                return percentage; 
        }
        public void display(){

                System.out.println("-------------------\nGrades in subject 1 is: " + mark_1);
                System.out.println("Grades in subject 2 is: " + mark_2);
                System.out.println("Grades in subject 3 is: " + mark_3);
        }        

}

class fraction{

        private int a;
        private int b;

        // default constructor
        public fraction(){

        }

        // argument constructor
        public fraction(int val_a, int val_b){

                this.a = val_a;
                this.b = val_b;
        }

        // setters
        public void setA(int val_a){
                a = val_a;
        }

        public void setB(int val_b){

                b = val_b;
        }

        // getters
        public int getA(){
                return a;
        }

        public int getB(){
                return b;
        }

        public boolean fractionCheck(fraction c){

                
                double f1 = this.a / this.b;
                double f2 = c.a / c.b;

                if(f1 == f2){
                        return true;
                } 
                else{
                        return false;
                }
        }
        
        public void display(){

                System.out.println("-------------------\nA is: " + a);
                System.out.println("B is: " + b);
        }        

}

class book{

        private String author;
        private String title;

        // default constructor
        public book(){

        }

        // argument constructor
        public book(String name_author, String name_title){

                this.author = name_author;
                this.title = name_title;
        }

        // setters
        public void setAuthor(String name_author){
                author = name_author;
        }

        public void setTitle(String name_title){

                title = name_title;
        }

        // getters
        public String getAuthor(){
                return author;
        }

        public String getTitle(){
                return title;
        }

        public boolean authorsCheck(book author_c){


                if(author.equals(author_c.author)){
                        return true;
                } 
                else{
                        return false;
                }
        }
        
        public void display(){

                System.out.println("-------------------\nAuthor is: " + author);
                System.out.println("Title is: " + title);
        }        

}