
/**
 * Write a description of class hatchet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Hatchet extends Tool
{
    int Distance;
     public Hatchet(String name, int weight, int value ,int dmg, int ft){
        super(name,weight, value, 2);
        Distance = ft;
          array = new ArrayList<Object>();
        for (Object i : super.getStats()){ 
            array.add(i);
        }
        array.add(damage);
    }

    public int getdistance(){
        return Distance;
    }
}
