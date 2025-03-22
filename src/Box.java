public class Box extends Shape
{

   Box(double ent)
    {
        volume = ent;
    }
   public boolean Add(Shape shape)
    {
         double VolA = this.volume;
         double VolB = shape.volume;
         if (VolA - VolB > 0)
         {
             this.volume += -VolB;
             return  true;
         }
         else
         {
             return false;
         }
    }
}
