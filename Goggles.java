
/**
 * Write a description of class Goggles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Goggles extends Armor{
    ArrayList<Object> array;
    int sight;
    public Goggles (String name, int weight, int value, int defence, int st){
       super(name, weight, value, defence);
       sight = st;
       array = new ArrayList<Object>();
       for (Object i : super.getStats()){ 
            array.add(i);
        }
       array.add(sight);
    }
    public ArrayList<Object> getStats(){
        return array;
    }
    public int getsight(){
        return sight;
    }
}
