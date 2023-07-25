/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2   
*/
import java.util.*;
import java.lang.*;
import java.util.Arrays;
public class OOP_Lab3_4{
        public static void main(String[] args){

        
        }       
}

class point{

        int x;
        int y;


        // default constructor
        public point(){

        }

        // three argument constructor
        public point(int value_x, int value_y){

                this.x = value_x;
                this.y = value_y;

        }

        void set_values(int value_x, int value_y){

                x = value_x;
                y = value_y;

        }

        void move(int value_x, int value_y){
                
                x = x + value_x;
                y = y + value_y;

        }

        boolean checkOrigin(){
                if(x == 0 && y == 0){
                        return true;
                }
                else{
                        return false;
                }
        }

        void display(){
                System.out.println("Value of x coordinate is: " + x);
                System.out.println("Value of y coordinate is: " + y);
        }
        
}
