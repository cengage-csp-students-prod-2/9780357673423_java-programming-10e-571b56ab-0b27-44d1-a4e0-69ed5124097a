// Write your code here
import java.time.LocalDate;
// public class Wedding{
//     private Couple couple;
//     private LocalDate weddingDate;
//     private String location;
//     public Wedding(Couple cp, LocalDate ld, String lc){
//         couple = cp;
//         weddingDate = ld;
//         location = lc;


//     }

//     public Couple getCouple(){
//         return couple;
//     }

//     public LocalDate getWeddingDate(){
//         return weddingDate;
//     }

//     public String getLocation(){
//         return location;
//     }

// }


public class Wedding
{
   private Couple couple;
   private LocalDate weddingDate;
   private String location;
   public Wedding(){
      this.couple = new Couple();
      this.weddingDate = LocalDate.now();
      this.location = "" ;
   }
   public Wedding(Couple c, LocalDate date, String loc)    {
      this.couple = c;
      this.weddingDate = date;
      this.location = loc;
   }
   public Couple getCouple()    {
      return couple;
   }
   public LocalDate getWeddingDate()    {
      return weddingDate;
   }
   public String getLocation()    {
      return location;
   }
}