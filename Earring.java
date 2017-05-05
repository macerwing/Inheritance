
/**
 * Write a description of class Earrings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Earring extends Armor{
    ArrayList<Object> array;
    int hearing;
    public Earring (String name, int weight, int value, int defence, int ete){
       super(name, weight, value, defence);
       hearing = ete;
       array = new ArrayList<Object>();
       for (Object i : super.getStats()){ 
            array.add(i);
        }
       array.add(hearing);
    }
    public ArrayList<Object> getStats(){
        return array;
    }
    public int gethearing(){
        return hearing;
    }
}
