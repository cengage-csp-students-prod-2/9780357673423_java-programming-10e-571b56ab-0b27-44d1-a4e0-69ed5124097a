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
   public Wedding(Couple c, LocalDate date, String loc)    {
      couple = c;
      weddingDate = date;
      location = loc;
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