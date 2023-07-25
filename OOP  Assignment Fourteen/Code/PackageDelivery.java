public class PackageDelivery {
    
    protected String senderName, senderAddress, recipientName, recipientAddess;
    protected double weight, costPerOunce;
    
    //Defaiut Constructor
    public PackageDelivery(){

    }

    //Argumented Constructor
    public PackageDelivery(String senderName_prime, String senderAddress_prime, String recipientName_prime, String recipientAddress_prime, double weight_prime, double costPerOunce_prime){
        
        this.senderName = senderName_prime;
        this.senderAddress = senderAddress_prime;
        this.recipientName = recipientName_prime;
        this.recipientAddess = recipientAddress_prime;
        
        if(weight_prime > 0){
            this.weight = weight_prime;
        }
        else{
            System.out.println("Enter the right amount of weight!");
        }

        if(costPerOunce_prime > 0){
            this.costPerOunce = costPerOunce_prime;
        }
        else{
            System.out.println("Enter the right cost!");
        }
    }

    // Setters
    public void setSenderName(String senderName_prime){
        this.senderName = senderName_prime;
    }
    public void setSenderAddress(String senderAddress_prime){
        this.senderAddress = senderAddress_prime;
    }
    public void setRecipientName(String recipientName_prime){
        this.recipientName = recipientName_prime;
    }
    public void setRecipientAddress(String recipientAddress_prime){
        this.recipientAddess = recipientAddress_prime;
    }

    public void setWeight(double weight_prime){
        if(weight_prime > 0){
            this.weight = weight_prime;
        }
        else{
            System.out.println("Enter the right amount of weight!");
        }
    }
    public void setCostPerOunce(double costPerOunce_prime){
        if(costPerOunce_prime > 0){
            this.costPerOunce = costPerOunce_prime;
        }
        else{
            System.out.println("Enter the right cost!");
        }
    }

    //Getters
    public String getSenderName(){
        return senderName;
    }
    public String getSenderAddress(){
        return senderAddress;
    }
    public String getRecipientName(){
        return recipientName;
    }
    public String getRecipientAddress(){
        return recipientAddess;
    }
    public double getWeight(){
        return weight;
    }
    public double getCostPerOnce(){
        return costPerOunce;
    }

    // Member function
    public double calculateCost(){
        return weight * costPerOunce;
    } 

}

class TwoDayPackage extends PackageDelivery{

    private double flatFee;
    
    //Defaiut Constructor
    public TwoDayPackage(){
        super();
    }

    //Argumented Constructor
    public TwoDayPackage(String senderName_prime, String senderAddress_prime, String recipientName_prime, String recipientAddress_prime, double weight_prime, double costPerOunce_prime, double flatFee_prime){
        super(senderName_prime, senderAddress_prime, recipientName_prime, recipientAddress_prime, weight_prime, costPerOunce_prime);
        this.flatFee = flatFee_prime;
    }

    // Setters
    public void setFlatFee(double flatFee_prime){
        this.flatFee = flatFee_prime;
    }

    // Getters
    public double getFlatFee(){
        return flatFee;
    }

    // Overriding function 
    public double calculateCost(){
        return super.calculateCost() + flatFee;
    }

}
class OvernightPackage extends PackageDelivery{

    private double additionalFee;
    
    //Defaiut Constructor
    public OvernightPackage(){
        super();
    }

    //Argumented Constructor
    public OvernightPackage(String senderName_prime, String senderAddress_prime, String recipientName_prime, String recipientAddress_prime, double weight_prime, double costPerOunce_prime, double additionalFee_prime){
        super(senderName_prime, senderAddress_prime, recipientName_prime, recipientAddress_prime, weight_prime, costPerOunce_prime);
        this.additionalFee = additionalFee_prime;
    }

    // Setters
    public void setAdditionalFee(double additionalFee_prime){
        this.additionalFee = additionalFee_prime;
    }

    // Getters
    public double getAdditionalFee(){
        return additionalFee;
    }

    // Overriding function 
    public double calculateCost(){
        return super.calculateCost() + additionalFee;
    }

}
