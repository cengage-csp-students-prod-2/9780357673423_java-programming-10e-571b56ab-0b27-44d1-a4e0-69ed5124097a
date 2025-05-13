public class Square extends GeometricFigure
{
   private double area;
   public Square(int h)
   {
     super(h, h, "Square");
   }
   public double figureArea(int w, int h)
   {
     area = (double)(w * h);
     return area;
   }
}