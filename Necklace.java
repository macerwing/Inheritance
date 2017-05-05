
/**
 * Write a description of class Necklace here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Necklace extends Armor{
    ArrayList<Object> array;
    int luck;
    public Necklace (String name, int weight, int value, int defence, int lck){
       super(name, weight, value, defence);
       luck = lck;
       array = new ArrayList<Object>();
       for (Object i : super.getStats()){ 
            array.add(i);
        }
       array.add(luck);
    }
    public ArrayList<Object> getStats(){
        return array;
    }
    public int getluck(){
        return luck;
    }
}
