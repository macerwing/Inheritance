
/**
 * Write a description of class shovel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Shovel extends Tool
{
    int power;
     public Shovel(String name, int weight, int value ,int dmg, int PL){
        super(name,weight, value, 2);
        power = PL;
          array = new ArrayList<Object>();
        for (Object i : super.getStats()){ 
            array.add(i);
        }
        array.add(damage);
    }

    public int getpower(){
        return power;
    }
}