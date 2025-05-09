// Write your code here

public class OutgoingPhoneCall extends PhoneCall{
    private double time;
    private double price;
  
    public OutgoingPhoneCall(String phone , double time){
        super(phone);
        this.time = time;
        this.price = time * 0.04 ;
    }
    @Override
    public void display(){
        System.out.println("Outgoing phone call " + PC.getPhoneNumber() + " 0.04 per minute at "+ this.time + " minutes. Total is $" + PC.getPrice()  );
    }
}