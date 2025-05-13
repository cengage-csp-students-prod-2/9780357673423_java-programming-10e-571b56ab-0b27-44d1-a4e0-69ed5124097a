import java.util.*;
public class UseGeometric2
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      double area;
      int height = 0;
      int width = 0;
      int x;
      String figureType;
      GeometricFigure2[] figures = new GeometricFigure2[5];
      for(x = 0; x < figures.length; ++x)
      {
         System.out.print("Is this a (S)quare or a (T)riangle? >> ");
         figureType = kb.nextLine();
         System.out.print("Enter height >> ");
         height = kb.nextInt();
         kb.nextLine();
         if(!figureType.equals("S"))
         {
            System.out.print("Enter width >> ");
            width = kb.nextInt();
            kb.nextLine();
         }
         if(figureType.equals("S"))
            figures[x] = new Square2(height);
         else
            figures[x] = new Triangle2(height, width);
       }
       for(x = 0; x < figures.length; x++)
       {
          height = figures[x].getHeight();
          width = figures[x].getWidth();
          figureType = figures[x].getFigure();
          area = figures[x].figureArea(height, width);
          System.out.println("The "+ figureType + " with height = " +
             height + " and with width = " + width +
            " has an area of " + area);
          figures[x].displaySides();
       }
   }
}