// Write your code here
public class ElectricBlanket extends Blanket{
    protected int settings;
    protected boolean hasAutoShutoff;
    
    
    public ElectricBlanket(){
        settings = 1;
        hasAutoShutoff = false;

    }

    public void setSettings(int st){
        if ((st >= 1) && (st <=5)) {
            settings = st;
        }
        else{
            ElectricBlanket();
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
    public void toString(){
        if (hasAutoShutoff){
        System.out.println(this.getSize() + " size " + this.getColor() + " " + this.material  + " blanket. Price $" + this.price +". Blanket has automatic shutoff and " + this.getSettings() + " setting.");
   }
   else{
        System.out.println(this.getSize() + " size " + this.getColor() + " " + this.material  + " blanket. Price $" + this.price +". no automatic shutoff and " + this.getSettings() + " setting.");
   }

}
}