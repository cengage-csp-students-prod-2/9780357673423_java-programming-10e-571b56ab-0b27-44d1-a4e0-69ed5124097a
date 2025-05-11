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
        else{
            settings = 1;
            hasAutoShutoff = false;
        }
        
    }

    public void setHasAutoShutoff(boolean shutoff) {
    if (shutoff && !hasAutoShutoff) {
        price += 5.75;
    } else if (!shutoff && hasAutoShutoff) {
        price -= 5.75;
    }
    hasAutoShutoff = shutoff;
}


    public int getSettings(){
        return settings;
    }
    public boolean getHasAutoShutoff(){
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