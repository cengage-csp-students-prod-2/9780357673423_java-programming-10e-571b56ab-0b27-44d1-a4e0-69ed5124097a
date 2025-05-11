// Write your code here
public class ElectricBlanket extends Blanket{
    protected int settings;
    protected boolean hasAutoShutoff;
    
    
    public ElectricBlanket(){
        super();
        settings = 1;
        hasAutoShutoff = false;

    }

    public void setSettings(int st){
        if ((st >= 1) && (st <=5)) {
            settings = st;
        }
        
    }

    public void setHasAutoShutoff(boolean isit){
        if (isit){
            this.price = price + 5.75;
            hasAutoShutoff = isit;
        }

    }

    public int getSettings(){
        return settings;
    }
    public boolean hasAutoShutoff(){
        return hasAutoShutoff;
    }
    

    @Override
public String toString() {
    String base = super.toString();
    base += hasAutoShutoff ? ". Blanket has automatic shutoff and " : ". no automatic shutoff and ";
    base += settings + " setting" + (settings != 1 ? "s." : ".");
    return base;
}
}