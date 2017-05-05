
/**
 * Write a description of class Sheild here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Sheild extends Armor{
    ArrayList<Object> array;
    int space;
    public Sheild(String name, int weight, int value, int defence, int sp){
       super(name, weight, value, defence);
       space = sp;
       array = new ArrayList<Object>();
       for (Object i : super.getStats()){ 
            array.add(i);
        }
       array.add(space);
    }
    public ArrayList<Object> getStats(){
        return array;
    }
    public int getspace(){
        return space;
    }
}
