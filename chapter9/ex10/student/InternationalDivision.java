// Write your code here

public class InternationalDivision extends Division{
    protected String country;
    protected String language;

    public InternationalDivision(String account, String div, String c, String l){
        super(div,account);
        country = c;
        language = l;

    }

    @Override
    public void display(){
        System.out.print("International Division: Division " + this.getDivisionTitle() + " Acct# " + this.getAcctNum() + "\nCountry is " + this.country + "\nLanguage Spoken is " + this.language);
    }
    



}