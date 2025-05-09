// Write your code here
public abstract class PhoneCall{
    protected String phoneNumber;
    private double price;

    public PhoneCall(String phone){

        this.phoneNumber = phone;
        this.price = 0.0 ;
    }

    public void setPrice(double pr){
        this.price = pr;
    }
    

    // public  String getPhoneNumber(){
    //     return phoneNumber;
    // }
    public abstract String getPhoneNumber();

    public abstract double getPrice();
    public abstract void getInfo();
}