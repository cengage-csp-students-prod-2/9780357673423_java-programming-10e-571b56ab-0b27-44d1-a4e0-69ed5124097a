// Write your code here
public class DomesticDivision extends Division{

    protected String state;
    public DomesticDivision(String st, String div, int account){
        super(div,account);
        state = st;
    }

    @Override
    public void display(){
        System.out.print("International Division: Division " + this.getDivisionTitle() + " Acct# " + this.getAcctNum()+  "\nLocated in " + this.state );
    }
}