/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2   
*/
import java.util.*;
import java.lang.*;
import java.util.Arrays;
public class OOP_Lab3_3{
        public static void main(String[] args){

        
        }       
}

class rectangle{

        int width;
        int length;


        // default constructor
        public rectangle(){

        }

        // three argument constructor
        public rectangle(int value_width, int value_length){

                // check for a
                if(value_width < 0){
                        System.out.println("You cannot put negative value");
                }
                else{
                        this.width = value_width;
                }

                // check for b
                if(value_length < 0){
                        System.out.println("You cannot put negative value");
                }
                else{
                        this.length = value_length;
                }

        }

        void set_values(int value_width, int value_length){

                // check for a
                if(value_width < 0){
                        System.out.println("You cannot put negative value");
                }
                else{
                        width = value_width;
                }

                // check for b
                if(value_length < 0){
                        System.out.println("You cannot put negative value");
                }
                else{
                        length = value_length;
                }

        }

        int calculateArea(){
                
                int area = width * length;
                return area;       
        }

        boolean checkSquare(){
                if(length == width){
                        return true;
                }
                else{
                        return false;
                }
        }

        void display(){
                System.out.println("Width of rectangle is: " + width);
                System.out.println("Length of rectangle is: " + length);
        }
        
}
