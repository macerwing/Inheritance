
/**
 * Write a description of class Gun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Gun extends Weapon{
    int range;
    ArrayList<Object> array;
     public Gun(String name, int weight, int value ,int dmg, int rn){
        super(name,weight, value, 2);
        range = rn;
          array = new ArrayList<Object>();
        for (Object i : super.getStats()){ 
            array.add(i);
        }
        array.add(range);
    }

    public int getrange(){
        return range;
    }
}