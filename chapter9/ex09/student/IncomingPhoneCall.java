// Write your code here

public class IncomingPhoneCall extends PhoneCall{
    private double price;
    
    public IncomingPhoneCall(String Phone){
        super(Phone);
        this.price = 0.02;
        
    }

    @Override
    public void display(){
        System.out.println("Incoming phone call " + PC.getPhoneNumber() + " 0.02 per call. Total is $" + this.Price  );
    }

}