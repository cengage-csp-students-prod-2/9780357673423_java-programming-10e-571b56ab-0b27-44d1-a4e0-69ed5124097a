// Write your code here

public class IncomingPhoneCall extends PhoneCall{
    
    
    public IncomingPhoneCall(String Phone){
        super(Phone);
        this.setPrice(0.02);
        
    }

    @Override
    public void getInfo(){
        System.out.println("Incoming phone call " + this.getPhoneNumber() + " 0.02 per call. Total is $" + this.getPrice()  );
    }

    @Override
    public double getPrice(){
        return 0.02;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber; // ❌ Error: phoneNumber is private
    }

}