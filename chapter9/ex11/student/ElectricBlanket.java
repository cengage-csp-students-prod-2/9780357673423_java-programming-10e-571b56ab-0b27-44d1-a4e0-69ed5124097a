public class ElectricBlanket extends Blanket {
    private int settings;
    private boolean hasAutoShutoff;
    private final int MAX_SETTINGS = 5;
    private double shutoffPremium;
    private final double S_PRICE = 5.75;
    public ElectricBlanket()    {
       settings = 1;
       hasAutoShutoff = false;
       shutoffPremium = 0;
    }
    public int getSettings()    {
       return settings;
    }
    public boolean getHasAutoShutoff()    {
       return hasAutoShutoff;
    }
    public void setSettings(int s)    {
       if(s < 1 || s > MAX_SETTINGS)
          s = 1;
       settings = s;
    }
    public void setHasAutoShutoff(boolean h)    {
       hasAutoShutoff = h;
       if(h)       {
          shutoffPremium = S_PRICE;
       }
       else       {
           shutoffPremium = 0;
       } 
       price = BASE_PRICE + sizePremium + materialPremium + shutoffPremium; 
    }
    public String toString()    {
       String s;
       s = super.toString();
       if(hasAutoShutoff)
          s += ". Blanket has automatic shutoff";
       else
          s += ". no automatic shutoff";
       s += " and " + settings;
       if(settings == 1)
          s += " setting.";
       else
          s += " settings.";
       return s;
    }
 } 


// public class ElectricBlanket extends Blanket {
//     protected int settings;
//     protected boolean hasAutoShutoff;

//     public ElectricBlanket() {
//         super(); // <<-- This is crucial
//         settings = 1;
//         hasAutoShutoff = false;
//     }

//     public int getSettings() {
//         return settings;
//     }

//     public void setSettings(int st) {
//         if (st >= 1 && st <= 5) {
//             settings = st;
//         } else {
//             settings = 1;
//         }
//     }

//     public boolean getHasAutoShutoff() {
//         return hasAutoShutoff;
//     }

//     public void setHasAutoShutoff(boolean shutoff) {
//         if (shutoff && !hasAutoShutoff) {
//             price += 5.75;
//         } else if (!shutoff && hasAutoShutoff) {
//             price -= 5.75;
//         }
//         hasAutoShutoff = shutoff;
//     }

//     @Override
//     public String toString() {
//         String base = super.toString();
//         base += hasAutoShutoff
//             ? ". Blanket has automatic shutoff and "
//             : ". no automatic shutoff and ";
//         base += settings + " setting" + (settings != 1 ? "s." : ".");
//         return base;
//     }
// }
