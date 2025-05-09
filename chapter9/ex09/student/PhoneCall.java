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
    

    public  String getPhoneNumber(){
        return phoneNumber;
    }
    public abstract double getPrice();
    public abstract void getInfo();
}