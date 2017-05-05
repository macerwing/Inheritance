
/**
 * Write a description of class Sword here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Sword extends Weapon
{
    int thrust;
     public Sword(String name, int weight, int value ,int dmg, int tt){
        super(name,weight, value, 2);
        thrust = tt;
          array = new ArrayList<Object>();
        for (Object i : super.getStats()){ 
            array.add(i);
        }
        array.add(thrust);
    }

    public int getthrust(){
        return thrust;
    }
}
