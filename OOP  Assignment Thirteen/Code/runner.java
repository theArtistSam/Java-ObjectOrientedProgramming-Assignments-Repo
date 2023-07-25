/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2   
*/
import java.util.*;
import java.lang.*;
import java.util.Arrays;

public class runner{
    public static void main(String[] args){


        Email e1 = new Email("Document ka text", "Hafif Ashiq", "Noone", "Broken");
        File f1 = new File();

        System.out.println(ContainsKeyword(e1, "Broken"));
                

    }

    public static boolean ContainsKeyword(Document docObject, String keyword){
        if(docObject.toString().indexOf(keyword,0) >= 0){
            return true;
        }
        else{
            return false;
        }
        
    }
               
}

class Document{

    protected String text;

    // Default Constructor
    public Document(){

    }

    // Argumented Constructor
    public Document(String text_prime){
        this.text = text_prime;
    }

    // Setters
    public void setText(String text_prime){
        this.text = text_prime;
    }

    // Getters
    public String getText(){
        return text;
    }

    public String toString(){
        return text;
    }

}

class Email extends Document{

    private String sender;
    private String recipient;
    private String title;

    // Default Constructor
    public Email(){
        super();

    }
    // Argumented Constructor
    public Email(String text_prime, String sender_prime, String recipient_prime, String title_prime){
        super(text_prime);
        this.sender = sender_prime;
        this.recipient = recipient_prime;
        this.title = title_prime;
    }

    // Setters
    public void setSender(String sender_prime){
        this.sender = sender_prime;
    }

    public void setRecipient(String recipient_prime){
        this.recipient = recipient_prime;
    }

    public void setTitle(String title_prime){
        this.title = title_prime;
    }

    // Getters
    public String getSender(){
        return sender;
    }
    public String getRecipient(){
        return recipient;
    }
    public String getTitle(){
        return title;
    }

    public String toString(){
        return getText() + " " + sender + " " + recipient + " " + title + " ";
    }

}
class File extends Document{

    private String pathName;
    
    // Default Constructor
    public File(){
        super();

    }
    // Argumented Constructor
    public File(String text_prime, String pathName_prime){
        super(text_prime);
        this.pathName = pathName_prime;
    }

    // Setters
    public void setPathName(String pathName_prime){
        this.pathName = pathName_prime;
    }

    // Getters
    public String getPathName(){
        return pathName;
    }

    public String toString(){
        return getText() + " " + pathName;
    }

}