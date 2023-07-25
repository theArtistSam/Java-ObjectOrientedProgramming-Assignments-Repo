
public class runner_4 {
    
    public static void main(String[] args) {
        
        InventoryItem i1 = new InventoryItem("Abdullah", 45);
        InventoryItem i2 = new InventoryItem("Abdullah", 45);
        System.out.println(i1.compareObjects(i2));
    
    }   

}

// Interface
interface compare {   
    boolean compareObjects(Object o);
}


class InventoryItem implements compare{

    private String name; 
    private int uniqueItemID; 

    // Default Constructor
    public InventoryItem(){

    }

    // Argumented Constructor
    public InventoryItem(String name_prime, int uniqueItemID_prime){
        this.name = name_prime;
        this.uniqueItemID = uniqueItemID_prime;
    }
    
    // Setters
    public void setName(String name_prime){
        this.name = name_prime;
    }
    public void setuniqueItemID(int uniqueItemID_prime){
        this.uniqueItemID = uniqueItemID_prime;
    }

    // Getters
    public String getName(){
        return name;
    }
    public int getuniqueItemID(){
        return uniqueItemID;
    }

    
    public boolean compareObjects(Object o) {
        
        // Checking instance first
        if(o instanceof InventoryItem){
            // Downcasting 
            InventoryItem temp = (InventoryItem) o;
            if(this.name == temp.name && this.uniqueItemID == temp.uniqueItemID){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            System.out.println("Take it easy, Sir! Put the right thing in there!");
            return false;
        }
        
    }
    

}

