// // Write your code here

// public class Couple {
//     private Person bride;
//     private Person groom;
//     public Couple(Person br , Person gr){
//         bride = br;
//         groom = gr;

//     }

//     public Person getBride(){
//         return bride;
//     }
//     public Person getGroom(){
//         return groom;
//     }
    


// }

public class Couple {
    private Person bride;
    private Person groom;
    public Couple(){
      this.bride = new Person();
      this.groom = new Person();
    }
    public Couple(Person br, Person gr)    {
      this.bride = br;
      this.groom = gr;
    }
    public Person getBride()    {
       return bride;
    }
    public Person getGroom()    {
       return groom;
    }
 }