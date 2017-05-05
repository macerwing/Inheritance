
/**
 * Write a description of class pickaxe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class PickAxe extends Tool
{
    int Strength;
     public PickAxe(String name, int weight, int value ,int dmg, int st){
        super(name,weight, value, 2);
        Strength = st;
          array = new ArrayList<Object>();
        for (Object i : super.getStats()){ 
            array.add(i);
        }
        array.add(Strength);
    }

    public int getStrength(){
        return Strength;
    }
}
