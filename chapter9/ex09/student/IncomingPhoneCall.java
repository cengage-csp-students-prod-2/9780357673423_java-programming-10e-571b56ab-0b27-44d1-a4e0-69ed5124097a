// Write your code here

public class IncomingPhoneCall{

    PhoneCall PC ;
    public IncomingPhoneCall(String Phone){
        PC = new PhoneCall(Phone );
        PC.setPhoneNumber(Phone);
        PC.setPrice(0.02);
    }

    public void display(){
        System.out.println("Incoming phone call " + PC.getPhoneNumber() + " 0.02 per call. Total is $" + PC.getPrice()  );
    }

}