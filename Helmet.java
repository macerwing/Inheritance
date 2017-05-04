
/**
 * Write a description of class potion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Helmet extends Armor{
    ArrayList<Object> array;
    int vision;
    public Helmet(String name, int weight, int value, int defence, int los){
       super(name, weight, value, defence);
       vision = los;
       array = new ArrayList<Object>();
       for (Object i : super.getStats()){ 
            array.add(i);
        }
       array.add(vision);
    }
    public ArrayList<Object> getStats(){
        return array;
    }
    public int getVision(){
        return vision;
    }
}