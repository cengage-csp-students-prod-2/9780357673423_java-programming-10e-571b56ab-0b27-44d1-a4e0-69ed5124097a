// Write your code here

public class OutgoingPhoneCall{
    private double time;
    PhoneCall PC; 
    public OutgoingPhoneCall(String phone , double time){
        PC = new PhoneCall(phone);
        PC.setPhoneNumber(phone);
        this.time = time;
        PC.setPrice(time * 0.04);
    }
    public void display(){
        System.out.println("Outgoing phone call " + PC.getPhoneNumber() + " 0.04 per minute at "+ this.time + " minutes. Total is $" + PC.getPrice()  );
    }
}