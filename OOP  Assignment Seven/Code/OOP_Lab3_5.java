/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2   
*/
import java.util.*;
import java.lang.*;
import java.util.Arrays;
public class OOP_Lab3_5{
        public static void main(String[] args){

        
        book b1 = new book();
        String[] array = {"Flag", "Flag"};
        b1.set_values("Aam", array);
        b1.display();        
        System.out.println(b1.checkIfAuthorStartsWithA());
        System.out.println(b1.searchChapter("Flag"));
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
                if(array.length <= 5){
                        for(int i = 0; i < array.length; i++){
                                chapterName[i] = array[i];
                        }
                }
                else{
                        for(int i = 0; i < chapterName.length; i++){
                                chapterName[i] = array[i];
                        }       
                }

        }

        void set_values(String writer, String[] array){

                author = writer;
                if(array.length <= 5){
                        for(int i = 0; i < array.length; i++){
                                chapterName[i] = array[i];
                        }
                }
                else{
                        for(int i = 0; i < chapterName.length; i++){
                                chapterName[i] = array[i];
                        }       
                }

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

        boolean searchChapter(String chapter_name){
                
                boolean check = false;
                for(int i = 0; i < chapterName.length; i++){
                        if(chapterName[i].equals(chapter_name)){
                                check = true;
                                break;
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
                        if(chapterName[i] == null){
                                continue;
                        }
                        System.out.print(chapterName[i] + " ");
                }
                System.out.println();
        }
        
}
