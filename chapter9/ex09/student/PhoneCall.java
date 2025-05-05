// Write your code here
public class PhoneCall{
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

    public String getPhoneNumber(){
        return phoneNumber;
    }
    public double getPrice(){
        return price;
    }
    public void display(){
        System.out.println("");
    }
}