
/**
 * Write a description of class Gloves here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Gloves extends Armor{
    ArrayList<Object> array;
    int grip;
    public Gloves(String name, int weight, int value, int defence, int gp){
       super(name, weight, value, defence);
       grip = gp;
       array = new ArrayList<Object>();
       for (Object i : super.getStats()){ 
            array.add(i);
        }
       array.add(grip);
    }
    public ArrayList<Object> getStats(){
        return array;
    }
    public int getgrip(){
        return grip;
    }
}
