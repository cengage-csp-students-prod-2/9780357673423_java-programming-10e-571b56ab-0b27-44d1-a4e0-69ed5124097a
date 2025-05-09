// Write your code here
public abstract class PhoneCall{
    private String phoneNumber;
    private double price;

    public PhoneCall(String phone){

        this.phoneNumber = phone;
        this.price = 0.0 ;
    }

    public void setPrice(double pr){
        this.price = pr;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public  String getPhoneNumber(){
        return phoneNumber;
    }
    // public abstract double getPrice();
    public abstract void display();
}