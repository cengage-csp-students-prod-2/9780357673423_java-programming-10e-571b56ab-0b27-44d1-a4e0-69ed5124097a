// Write your code here
public abstract class Division{
    protected String divisionTitle;
    protected String acctNum;

    public Division(String dt, String acc){
        divisionTitle = dt;
        this.acctNum = acc;

    }
    public abstract void display();

    public String getDivisionTitle(){
        return divisionTitle;
        
    }
    public String getAcctNum(){
        return acctNum;
    }

}