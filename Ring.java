
/**
 * Write a description of class Rings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Ring extends Armor{
    ArrayList<Object> array;
    int charisma;
    public Ring (String name, int weight, int value, int defence, int charm){
       super(name, weight, value, defence);
       charisma = charm;
       array = new ArrayList<Object>();
       for (Object i : super.getStats()){ 
            array.add(i);
        }
       array.add(charisma);
    }
    public ArrayList<Object> getStats(){
        return array;
    }
    public int getcharisma(){
        return charisma;
    }
}
