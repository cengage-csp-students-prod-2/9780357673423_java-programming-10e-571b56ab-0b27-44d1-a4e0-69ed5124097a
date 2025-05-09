// Write your code here

public class IncomingPhoneCall extends PhoneCall{
    
    
    public IncomingPhoneCall(String Phone){
        super(Phone);
        setPrice = 0.02;
        
    }

    @Override
    public void display(){
        System.out.println("Incoming phone call " + this.getPhoneNumber() + " 0.02 per call. Total is $" + this.getPrice()  );
    }

    @Override
    public double getPrice(){
        return 0.02;
    }
}