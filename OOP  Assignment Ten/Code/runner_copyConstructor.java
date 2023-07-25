/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2   
*/
import java.util.*;
import java.lang.*;
import java.util.Arrays;
public class runner_copyConstructor{
        public static void main(String[] args){
                Scanner input = new Scanner(System.in);
                
                // rectangle class
                rectangle r1 = new rectangle(4, 5);
                rectangle r2 = new rectangle(10, 5);
        
                rectangle r3 = new rectangle(r2);
                System.out.println();

                System.out.println(r3.equals(r2));

                rectangle temp = r1.compareArea(r3);
                temp.display();

                // account class
                account a1 = new account(1000, 2000, "3630243093223");
                account a2 = new account(345353, 1998, "3630243034523");
                
                a1.display();
                System.out.println(a1.checkValidCnic());
                a1.deposit(5000);
                a1.display();

                account a3 = new account(a2);
                a3.display();
                
                System.out.println();

                System.out.println(a3.equals(a2));

                // Point class

                point p1 = new point(6, 7);
                point p2 = new point(4, 5);

                p1.checkOrigin();

                point temp = p1.addTwoPoints(p2);
                temp.display();

                point temp_2 = p1.addThreePoints(p2, temp);
                temp.display();
                
                // Strudent class
                int[] array = {45, 46, 47, 48, 49};
                int[] array_2 = {50, 51, 52, 53, 54, 55};
                student s1 = new student("Sam", array);
                student s2 = new student("Hafif", array_2);
                student s3 = new student("Sam", array_2);

                s1.compareAverage(s2);
                s1.display();
                s2.display();
                s3.display();

                // book Class
                String[] sub_array_1 = {"Science", "Studies", "Population", "Economy", "Environment"};
                String[] sub_array_2 = {"Math and Science", "Physics", "Population", "Economy", "Logics"};
        
                book b1 = new book("Sam", sub_array_1);
                book b2 = new book("Sam Edwards", sub_array_2);
                b1.compareAuthors(b2);
                b1.compareChapters(b2);

                book temp = new book(b2);
                temp.display();
                b1.display();
                b2.display();

                // departments class
                String[] dep = {"EE", "CS", "AI", "DS", "OOP"};
                university u1 = new university("Comsats", dep, "Islamabad", "Hafif");
                university u2 = new university("Bahira", dep, "Islamabad", "Sam");
                u1.addDepartments("BBA");
                u1.checkLocation("Islamabad");
                u1.compareDepartments(u2);

        }
               
}

class rectangle{

        private int length;
        private int width;


        // default constructor
        public rectangle(){

        }

        // one argument constructor
        public rectangle(int val_length){
                if(val_length > 0){
                        this.length = val_length;
                }
                else{
                        System.out.println("Add the right length!");
                }
        }

        // two argument constructor
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

        public rectangle(rectangle r_prime){
                this.length = r_prime.length; 
                this.width = r_prime.width;
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

        public boolean checkSquare(){
                if(this.length == this.width){
                        return true;
                }
                else{
                        return false;
                }
        }

        public boolean equals(rectangle r){

                if(this.length == r.length && this.width == r.width){
                        return true;
                }
                else{
                        return false;
                }
        }

        public rectangle compareArea(rectangle r_prime){

                int default_area = this.length * this.width;
                int given_area = r_prime.length * r_prime.width;
                this.display(); 
                r_prime.display();

                if(default_area > given_area){
                        
                        return this;
                }
                else{
                        return r_prime;
                }
        }

}

class account{

        private int balance;
        private int yearOfOpening;
        private String cnic;

        // default constructor
        public account(){

        }

        // argument constructor
        public account(int money){

                
                if(money > 0){
                        this.balance = money;
                }
                
        }

        public account(int money, int year, String cnic_number){

                
                if(money > 0){
                        this.balance = money;
                }
                else{
                        System.out.println("Add the right amount of money");
                }

                if(year > 1900){
                        this.yearOfOpening = year;
                }
                else{
                        System.out.println("Add the right year");
                }

                if(cnic_number.length() == 13){
                        this.cnic = cnic_number;
                }
                
        }

        // copy constructor
        public account(account a_prime){
                this.balance = a_prime.balance;
                this.yearOfOpening = a_prime.yearOfOpening;
                this.cnic = a_prime.cnic;
        }

        public boolean equals(account a){

                if(this.balance == a.balance && this.yearOfOpening == a.yearOfOpening && this.cnic == a.cnic){
                        return true;
                }
                else{
                        return false;
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
                System.out.println("Year of opening is: " + yearOfOpening);
                System.out.println("Your cnic number is: " + cnic);
        }
        public boolean checkValidCnic(){
                if(cnic.length() == 13){
                        return true;
                }
                else{
                        return false;
                }
        }        

}

class point{

        private int x;
        private int y;

        // default constructor
        public point(){

        }

        // default constructor
        public point(int val_x){
                this.x = val_x;
        }

        // argument constructor
        public point(int val_x, int val_y){

                this.x = val_x;
                this.y = val_y;
        }

        // copy constructor

        public point(point p_prime){
                this.x = p_prime.x;
                this.y = p_prime.y;
        }

        public boolean equals(point p){

                if(this.x == p.x && this.y == p.y){
                        return true;
                }
                else{
                        return false;
                }
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
        public boolean checkOrigin(){
                if(this.x == 0 && this.y == 0){
                        return true;
                }
                else{
                        return false;
                }
        }

        public point addTwoPoints(point p_prime){
                int x_point = this.x + p_prime.x;
                int y_point = this.y + p_prime.y;

                point p_added = new point(x_point, y_point);

                return p_added;
        }

        public point addThreePoints(point p_prime_1, point p_prime_2){
                int x_point = this.x + p_prime_1.x + p_prime_2.x;
                int y_point = this.y + p_prime_1.y + p_prime_2.y;

                point p_added = new point(x_point, y_point);
                
                return p_added;
        }

}

class student{

        private String name;
        private int[] result_array = new int[5];

        // default constructor
        public student(){

        }

        // one argument constructor
        public student(String student_name){
                this.name = student_name;
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

        // copy constructor
        public student(student s_prime){
                this.name = s_prime.name;

                for(int i = 0; i < this.result_array.length; i++){
                        this.result_array[i] = s_prime.result_array[i];
                }
                
        } 

        public boolean equals(student s){

                boolean check = false;
                if(this.name == s.name){
                        for(int i = 0; i < this.result_array.length; i++){
                                if(this.result_array[i] == s.result_array[i]){
                                        check = true;
                                }
                                else{
                                        check = false;
                                }
                                
                        }
                }

                return check;
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
        public void compareAverage(student s_prime){
                if(this.average() > s_prime.average()){
                        System.out.println("This array has greater average than the given one: " + this.average());
                }
                else{
                        System.out.println("The given one has greater average than this one: " + s_prime.average());
                }
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

class book{

        String author;
        String[] chapterName = new String[5];


        // default constructor
        public book(){

        }

        // three argument constructor
        public book(String writer, String[] array){

                this.author = writer;
                
                this.chapterName = array;

        }

        // copy constructor
        public book(book b_prime){
                this.author = b_prime.author;

                for(int i = 0; i < this.chapterName.length; i++){
                        this.chapterName[i] = b_prime.chapterName[i];
                }
        }

        public boolean equals(book b){

                boolean check = false;
                if(this.author == b.author){
                        for(int i = 0; i < this.chapterName.length; i++){
                                if(this.chapterName[i] == b.chapterName[i]){
                                        check = true;
                                }
                                else{
                                        check = false;
                                }
                        
                        }
                }
                return check;

        }
        public boolean compareAuthors(book b_prime){
                if(this.author.equals(b_prime.author)){
                        return true;
                }
                else{
                        return false;
                }
        }
        public boolean compareChapters(book b_prime){
                boolean check = true;
                for(int i = 0; i < this.chapterName.length; i++){
                        if(!this.chapterName[i].equals(b_prime.chapterName[i])){
                                check = false;
                        }
                }

                return check;
        }
        void set_values(String writer, String[] array){

                author = writer;
                chapterName = array;

        }

        boolean checkIfAuthorStartsWithA(){
                char check =  author.charAt(0);
                if(check == 'A'){
                        return true;
                }
                else{
                        return false;
                }
        }

        boolean checkIfAuthorStartsWithA(String chapter_name){
                
                boolean check = true;
                for(int i = 0; i < chapterName.length; i++){
                        if(chapterName[i].equals(chapterName)){
                                check = true;
                        }
                        else{
                                check = false;
                        }
                }

                if(check == true){
                        return true;
                }
                else{
                        return false;
                }

        }

        void display(){
                System.out.println("The name of the author is: " + author);
                System.out.println("Chapter names are");

                for(int i = 0; i < chapterName.length; i++){
                        System.out.print(chapterName[i] + " ");
                }
                System.out.println();
        }
        
}

class university{
        
        private String uniName;
        private String location;
        private String rectorName;
        private String[] departments = new String[20];
        
        // default constructor
        public university(){

        }

        public university(university u_prime){
                this.uniName = u_prime.uniName;
                this.location = u_prime.location;
                this.rectorName = u_prime.rectorName;

                for(int i = 0; i < departments.length; i++){
                        this.departments[i] = u_prime.departments[i];
                }
        }

        public boolean equals(university u){

                boolean check = false;
                if(this.uniName == u.uniName && this.rectorName == u.rectorName && this.location == u.location){
                        for(int i = 0; i < departments.length; i++){
                                if(this.departments[i] == u.departments[i]){
                                        check = true;
                                }
                                else{
                                        check = false;
                                }
                        }

                }
                return check;
        }

        // setters
        public void setUniName(String name){
                this.uniName = name;
        }

        public void setRectorName(String rector_name){
                this.rectorName = rector_name;
        }

        public void setLocation(String place){
                this.location = place;
        }
        public void setdDepartments(String[] array){
                this.departments = array;
        }

        // getters
        public String getUniName(){
                return uniName;
        }

        public String getRectorName(){
                return rectorName;
        }

        public String getLocation(){
                return location;
        }
        public String[] getdDepartments(){
                return departments;
        }

        // all argument constructor
        public university(String name, String[] array, String place, String rector_name){

                if(name.length() > 2){
                        this.uniName = name;        
                }
                else{
                        System.out.println("Small in length. Add right user name!");
                }
                
                if(array.length >= 20){
                        this.departments = array;        
                }
                else{
                        System.out.println("Size is smaller!");
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

        
        public void addDepartments(String abc){

                for(int i = 0; i < departments.length; i++){
                        if(departments[i] == null){
                                departments[i] = abc;
                                break;
                        }
                }
                
        }

        public boolean checkLocation(String place){
                
                
                if(location.equalsIgnoreCase(place)){
                        return true;
                }
                else{
                        return false;
                }

        }

        public boolean compareDepartments(university u_prime){
                if(this.departments.length > u_prime.departments.length){
                        return true;
                }
                else{
                        return false;
                }
        }


        public void display(){
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
