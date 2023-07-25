/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Lab Task: Recurrsion   
*/
import java.util.*;
import java.lang.*;
import java.util.Arrays;
public class OOP_Lab3_2{
        public static void main(String[] args){

        
        discriminant d1 = new discriminant();
        d1.display();

        account d2 = new account(4, 5, 7);
        d2.display();

        }
}

class discriminant{

        double a;
        double b;
        double c;


        // default constructor
        public discriminant(){

        }

        // three argument constructor
        public discriminant(double value_a, double value_b, double value_c){

                // check for a
                if(a < 0){
                        System.out.println("You cannot put negative value");
                }
                else{
                        this.a = value_a;
                }

                // check for b
                if(b < 0){
                        System.out.println("You cannot put negative value");
                }
                else{
                        this.b = value_b;
                }

                // check for c
                if(c < 0){
                        System.out.println("You cannot put negative value");
                }
                else{
                        this.c = value_c;
                }
        }

        void set_values(double value_a, double value_b, double value_c){

                // check for a
                if(a < 0){
                        System.out.println("You cannot put negative value");
                }
                else{
                        a = value_a;
                }

                // check for b
                if(b < 0){
                        System.out.println("You cannot put negative value");
                }
                else{
                        b = value_b;
                }

                // check for c
                if(c < 0){
                        System.out.println("You cannot put negative value");
                }
                else{
                        c = value_c;
                }
        }

        double getDiscriminant(){
                
                double discriminant = b * b - 4.0 * a * c;
                return discriminant;       
        }

        boolean checkIfDiscriminantIsGreaterThan100(){
                if(getDiscriminant() > 100){
                        return true;
                }
                else{
                        return false;
                }
        }

        void display(){
                System.out.println("Value of A is: " + a);
                System.out.println("Value of B is: " + b);
                System.out.println("Value of C is: " + c);
        }
}
