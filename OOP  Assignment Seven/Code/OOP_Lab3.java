/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Lab Task: Recurrsion   
*/
import java.util.*;
import java.lang.*;
import java.util.Arrays;
public class OOP_Lab3{
        public static void main(String[] args){

        
        account a1 = new account();
        a1.display();

        account a2 = new account(2345345);
        a2.display();

        account a3 = new account(2345345, 1995, 1234567891);
        a3.display();

        }
}

class account{

        int balance;
        int yearOfOpening;
        long cnic;


        // default constructor
        public account(){

        }

        // one argument constructors
        public account(int money){

                if(money < 0){
                        System.out.println("You cannot put negative money");
                }
                else{
                        this.balance = money;
                }
                
        }

        // three argument constructor
        public account(int money, int year, long cnic_numeber){

                // check for money
                if(money < 0){
                        System.out.println("You cannot put negative money");
                }
                else{
                        this.balance = money;
                }

                // check for cnic number
                if(cnic_numeber == 13){
                        this.cnic = cnic_numeber;
                }
                else{
                        System.out.println("Invalid CNIC number");
                }                                
                this.yearOfOpening = year;
        }

        void set_values(int money, int year, long cnic_numeber){

                // check for money
                if(money < 0){
                        System.out.println("You cannot put negative money");
                }
                else{
                        balance = money;
                }

                // check for cnic number
                if(cnic_numeber == 13){
                        cnic = cnic_numeber;
                }
                else{
                        System.out.println("Invalid CNIC number");
                }                                
                yearOfOpening = year;
        }

        void withDraw(int money){
                // check for money
                if(money < balance){
                        System.out.println("You don't have this much money! Try filling up the bucket!");
                }
                else{
                        int remaining_balance = balance - money;
                        System.out.println("Your remaining balance is: " + remaining_balance);
                }       
        }

        void deposit(int money){
                // check for money
                if(money < 0){
                        System.out.println("You cannot put -ve money! Try entering the right amount");
                }
                else{
                        int remaining_balance = balance + money;
                        System.out.println("Your remaining balance is: " + remaining_balance);
                }
        }

        int age(){
                
                int ageOfAccount = 2022 - yearOfOpening;
                return ageOfAccount;
                //System.out.println("Your account age is: " + ageOfAccount);

        }

        void display(){
                System.out.println("Your Balance is: " + balance);
                System.out.println("Your Year of opening is: " + yearOfOpening);
                System.out.println("Your CNIC Number is: " + cnic);
        }
}
