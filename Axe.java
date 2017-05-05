
/**
 * Write a description of class axe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Axe extends Weapon{
    int Choppingspeed;
    ArrayList<Object> array;
     public Axe(String name, int weight, int value ,int dmg, int cp){
        super(name,weight, value, 2);
        Choppingspeed = cp;
          array = new ArrayList<Object>();
        for (Object i : super.getStats()){ 
            array.add(i);
        }
        array.add(Choppingspeed);
    }

    public int getChoppingspeed(){
        return Choppingspeed;
    }
}