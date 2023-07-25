/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Lab Task: Basic Classes and methods   
*/
import java.util.*;
import java.lang.*;
import java.util.Arrays;
public class OOP_Lab2{
        public static void main (String[] args){

                // Circle Objects
                circle c1 = new circle();
                c1.radius = 5;
                c1.circumference();

                // rectangle Objects
                rectangle r1 = new rectangle();
                r1.length = 5;
                r1.width = 10;
                r1.display();
                r1.area();

                // Point Objects
                point p1 = new point();
                p1.x = 5;
                p1.y = 10;
                p1.display();
                p1.move(32, 40);

                // time Objects
                time t1 = new time();
                t1.now = 21;
                t1.min = 120;
                t1.sec = 234;
                t1.display();
                t1.calculate_hours(426);

                // day Objects
                date d1 = new date();
                d1.year = 2021;
                d1.month = "February";
                d1.day = "Tuesday";
                d1.display();
                d1.check_leap(2000);

                // book Objects
                book b1 = new book();
                b1.author = "Henry Avery";
                b1.pages = 2453;
                b1.title = "The lost treasure";
                b1.display();
                b1.change_author("Sam");

                // student Objects
                student s1 = new student();
                s1.name = "Sam";
                s1.reg = 002;
                s1.reg_courses[0] = "Math";
                s1.reg_courses[1] = "Isl";
                s1.reg_courses[2] = "Sci";
                s1.reg_courses[3] = "OOP";
                s1.reg_courses[4] = "Cal";
                s1.display();
                s1.change_reg(4);
        }        
}


class circle{

        int radius;

        public void set_values(int radius_circle){

                radius = radius_circle;
        }


        public void circumference(){

                double circumference = 2 * 3.14 * radius;
                System.out.println("-------------------\nThe circle has a circumference of: " + circumference);
        }

}

class rectangle{

        int length;
        int width;

        public void set_values(int length_rec, int width_rec){

                length = length_rec;
                width = width_rec;

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

        int x;
        int y;

        public void set_values(int x_location, int y_location){

                x = x_location;
                y = y_location;

        }

        public void display(){

                System.out.println("-------------------\nThe point is at x: " + x);
                System.out.println("The point is at y: " + y);
        }        

        public void move(int x_axis, int y_axis){

                System.out.println("The rectangle has now at x: " + x_axis + " and y: " + y_axis);
        }

}

class time{

        int now;
        int min;
        int sec;

        public void set_values(int time_now, int time_min, int time_sec){

                now = time_now;
                min = time_min;
                sec = time_sec;

        }

        public void display(){

                System.out.println("-------------------\nThe time right now is: " + now + " PM/AM");
                System.out.println("Minutes right now are: " + min);
                System.out.println("Seconds right now are: " + sec);
        }        

        public void calculate_hours(int min){

                System.out.println("The hours are: " + min/60);
        }

}

class date{

        int year;
        String month;
        String day;

        public void set_values(int year_now, String month_now, String day_now){

                year = year_now;
                month = month_now;
                day = day_now;

        }

        public void display(){

                System.out.println("-------------------\nCurrent year is: " + year);
                System.out.println("Month is: " + month);
                System.out.println("Day is: " + day);
        }        

        public void check_leap(int year){

                if(year % 4 == 0){
                        System.out.println(year + " is a leap year!");        
                }
                else{
                        System.out.println(year + " is a not leap year!");       
                }

                
        }

}
class book{
    
        String author;
        int pages;
        String title;

        public void set_values(String name, int page, String book){

                author = name;
                pages = page;
                title = book;

        }

        public void display(){

                System.out.println("-------------------\nName of the author is: " + author);
                System.out.println("Book has " + pages + " number of pages");
                System.out.println("Title of the book is: " + title);
        }        

        public void change_author(String author){
                System.out.println("Now the author of the book is: " + author);
                
        }

}

class student{
    
        String name;
        int reg;
        String[] reg_courses = new String[5];

        public void set_values(String student, int roll, String[] courses){

                name = student;
                reg = roll;
                reg_courses = {"Math", "Cal", "Sci", "Isl", "OOP"};

        }

        public void display(){

                System.out.println("-------------------\nName of the student is: " + name);
                System.out.println("Student has " + reg + " registration number");
                for(int i = 0; i < reg_courses.length; i++){
                        System.out.print(reg_courses[i] + " ");  
                              
                }
                
        }        

        public void change_reg(int reg){
                System.out.println("\nNow registration number is: " + reg);
                
        }

}