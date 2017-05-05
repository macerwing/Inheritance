
/**
 * Write a description of class fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Fire extends Tool
{
    int Fuel;
     public Fire(String name, int weight, int value ,int dmg, int burn){
        super(name,weight, value, 2);
        Fuel = burn;
          array = new ArrayList<Object>();
        for (Object i : super.getStats()){ 
            array.add(i);
        }
        array.add(damage);
    }

    public int getFuel(){
        return Fuel;
    }
}
