
/**
 * Write a description of class Lantern here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Lantern extends Tool
{
    int Light;
     public Lantern(String name, int weight, int value ,int dmg, int lt){
        super(name,weight, value, 2);
        Light = lt;
          array = new ArrayList<Object>();
        for (Object i : super.getStats()){ 
            array.add(i);
        }
        array.add(Light);
    }

    public int getLight(){
        return Light;
    }
}