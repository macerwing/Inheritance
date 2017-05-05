
/**
 * Write a description of class Lockpick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Lockpick extends Tool
{
    int pick;
     public Lockpick(String name, int weight, int value ,int dmg, int pck){
        super(name,weight, value, 2);
        pick = pck;
          array = new ArrayList<Object>();
        for (Object i : super.getStats()){ 
            array.add(i);
        }
        array.add(pick);
    }

    public int getpick(){
        return pick;
    }
}