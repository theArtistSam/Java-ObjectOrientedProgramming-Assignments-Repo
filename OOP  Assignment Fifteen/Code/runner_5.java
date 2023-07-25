public class runner_5 {
    public static void main(String[] args) {
        
        String[] abc = new String[3];
        abc[0] = "Abdullah";
        abc[1] = "Hafif"; 
        abc[2] = "Mansoor";

        NameCollection n1 = new NameCollection(abc);
        System.out.println(n1.hasNext(2));
        System.out.println(n1.getNext(1));
    }
}

interface Enumeration {

    // return true if a value exists in the next index
    public boolean hasNext(int index); 
    // returns the next element in the collection as an Object 
    public Object getNext(int index); 

}

// NameCollection implements a collection of names using  a simple array. 
class NameCollection implements Enumeration{

    String[] names = new String[100]; 

    // Default Constructor
    public NameCollection(){

    }

    // Argumented Constructor
    public NameCollection(String[] names_prime){
        
        if (names_prime.length >= this.names.length) {
            for(int i = 0; i < names.length; i++){
                this.names[i] = names_prime[i];
            }
        }
        else{
            for(int i = 0; i < names_prime.length; i++){
                this.names[i] = names_prime[i];
            }
        }

    }

    // Overriding Methods
    public boolean hasNext(int index) {

        if (names[index + 1] != null) {
            return true;
        }
        return false;
    }

    
    public Object getNext(int index) {
        
        // As string is an object that's why we use it like that!
        if(hasNext(index)){
            return names[index + 1];
        }
        return null;
    }


}

