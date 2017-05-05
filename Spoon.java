
/**
 * Write a description of class Spoon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Spoon extends Weapon{
    int scooping;
    ArrayList<Object> array;
     public Spoon(String name, int weight, int value ,int dmg, int sp){
        super(name,weight, value, 2);
        scooping = sp;
          array = new ArrayList<Object>();
        for (Object i : super.getStats()){ 
            array.add(i);
        }
        array.add(scooping);
    }

    public int getscooping(){
        return scooping;
    }
}