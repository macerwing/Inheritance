
/**
 * Write a description of class GodsBane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class GodsBane extends Weapon
{
    int rawpower;
     public GodsBane(String name, int weight, int value ,int dmg, int raw){
        super(name,weight, value, 2);
        rawpower = raw;
          array = new ArrayList<Object>();
        for (Object i : super.getStats()){ 
            array.add(i);
        }
        array.add(rawpower);
    }
    
    public ArrayList<Object> getStats(){
        return array;
    }

    public int getrawpower(){
        return rawpower;
    }
}