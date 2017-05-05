
/**
 * Write a description of class SmokeBomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class SmokeBomb extends Weapon{
    int Cover;
    ArrayList<Object> array;
     public SmokeBomb(String name, int weight, int value ,int dmg, int cr){
        super(name,weight, value, 2);
        Cover = cr;
          array = new ArrayList<Object>();
        for (Object i : super.getStats()){ 
            array.add(i);
        }
        array.add(Cover);
    }

    public int getCover(){
        return Cover;
    }
}