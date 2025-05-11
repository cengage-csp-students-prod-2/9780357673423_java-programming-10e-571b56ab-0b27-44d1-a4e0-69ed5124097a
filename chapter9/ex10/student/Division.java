// Write your code here
public abstract class Division{
    protected String divisionTitle;
    protected int acctNum;

    public Division(String dt, int acc){
        divisionTitle = dt;
        this.acctNum = acc;

    }
    public abstract void display();

    public String getDivisionTitle(){
        return divisionTitle;
        
    }
    public int getAcctNum(){
        return acctNum;
    }

}