/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2   
*/
import java.util.*;
import java.lang.*;
import java.util.Arrays;
public class runner_q1{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // Essentials
        String person_name = "Abdullah";
        String[] food_array = {"Apple", "Banana", "Mango", "Grewia"};
        double[] price_array = {100, 50, 120, 160};
        int[] quantity_array = {5, 12, 7, 5};

        tuck_shop t1 = new tuck_shop(person_name, food_array, price_array, quantity_array);
        
        // Default Displaying
        t1.display();

        // Add Item
        System.out.println("Added item essentials are");
        t1.add_Items("Oreo", 300, 4);
        t1.display();

        // Buy Item
        t1.buy("Apple", 5);
        t1.display();

        // Minimum quantity item
        System.out.println(t1.Item_With_Minimum_Quantity() + " has minimum quantity");

        // Maximum priced item
        System.out.println(t1.Item_With_Minimum_Price() + " has minimum price");
        
        }       
}

class tuck_shop{
        
        String owner;
        String[] food_items = new String[100];
        double[] price = new double[100];
        int[] quantity = new int[100];
        
        // default constructor
        public tuck_shop(){

        }

        // four argument constructor
        public tuck_shop(String name, String[] string_array, double[] double_array, int[] int_array){

                this.owner = name;

                // Check Array for Food Items 
                if(string_array.length <= 100){
                        for(int i = 0; i < string_array.length; i++){
                                food_items[i] = string_array[i];
                        }
                }
                else{
                        for(int i = 0; i < food_items.length; i++){
                                food_items[i] = string_array[i];
                        }       
                }

                // Check Array for Price 
                if(double_array.length <= 100){
                        for(int i = 0; i < double_array.length; i++){
                                price[i] = double_array[i];
                        }
                }
                else{
                        for(int i = 0; i < price.length; i++){
                                price[i] = double_array[i];
                        }       
                }

                // Check Array for Quantity 
                if(double_array.length <= 100){
                        for(int i = 0; i < int_array.length; i++){
                                quantity[i] = int_array[i];
                        }
                }
                else{
                        for(int i = 0; i < quantity.length; i++){
                                quantity[i] = int_array[i];
                        }       
                }                

        }
        
        void add_Items(String food_item, double price_items, int quantity_items){

                
                for(int i = 0; i < food_items.length; i++){
                        if(food_items[i] == null){
                                food_items[i] = food_item;
                                price[i] = price_items;
                                quantity[i] = quantity_items;
                                break;
                        }
                }
                
        }

        void buy(String food_item, int quantity_items){

                for(int i = 0; i < food_items.length; i++){
                        if(food_items[i].equals(food_item)){
                                food_items[i] = null;
                                price[i] = 0.0;
                                quantity[i] = 0;
                                break;
                        }
                }
                
        }

        int total_price(){

                int total_price = 0;
                
                for(int i = 0; i < price.length; i++){
                        if(price[i] != 0.0){
                                total_price += price[i]; 
                        }
                }

                return total_price;
                
        }

        String Item_With_Minimum_Quantity(){
                
                
                int min = Integer.MAX_VALUE;
                String item_name = "";

                for(int i = 0; i < quantity.length; i++){
                        if (food_items[i] != null) {
                                if(quantity[i] < min){
                                min = quantity[i];
                                item_name = food_items[i]; 
                                }
                        }
                }

                return item_name;
                
        }

        String Item_With_Minimum_Price(){
                
                double min = Integer.MAX_VALUE;
                String item_name = "";
                
                for(int i = 0; i < quantity.length; i++){
                        if (food_items[i] != null) {
                                if(price[i] < min){
                                min = price[i];
                                item_name = food_items[i]; 
                                }
                        }
                }

                return item_name;
                
        }

        void display(){
                System.out.println("----------------------------------\nThe name of the owner is: " + owner);
                System.out.println();

                System.out.println("Food Items\tQuantity\tPrice");
                for(int i = 0; i < food_items.length; i++){
                        if(food_items[i] == null){
                                continue;
                        }
                        System.out.println(food_items[i] + "\t\t" + quantity[i] + "\t\t" + price[i]);
                        
                        
                }
                System.out.println();
                
        }
        
}
