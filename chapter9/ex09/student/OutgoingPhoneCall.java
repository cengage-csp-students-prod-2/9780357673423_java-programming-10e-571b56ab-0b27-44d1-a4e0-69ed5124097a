// Write your code here

public class OutgoingPhoneCall extends PhoneCall{
    private double time;
    
  
    public OutgoingPhoneCall(double time, String phone ){
        super(phone);
        this.time = time;
        setPrice(time*0.04); 
    }
    @Override
    public void getInfo(){
        System.out.println("Outgoing phone call " + this.getPhoneNumber() + " 0.04 per minute at "+ this.time + " minutes. Total is $" + this.getPrice());
    }

    @Override
    public double getPrice(){
        return time *0.04;
    }
    @Override
    public String getPhoneNumber() {
        return phoneNumber; // ❌ Error: phoneNumber is private
}

}