// Write your code here
public class DomesticDivision extends Division{

    protected String state;
    public DomesticDivision( int account ,String div, String st){
        super(div,account);
        state = st;
    }

    @Override
    public void display(){
        System.out.print("Domestic Division: Division " + this.getDivisionTitle() + " Acct# " + this.getAcctNum()+  "\nLocated in " + this.state );
    }
}