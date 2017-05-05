
/**
 * Write a description of class leaves here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Boot extends Armor{
    ArrayList<Object> array;
    int speed;
    public Boot (String name, int weight, int value, int defence, int aos){
       super(name, weight, value, defence);
       speed = aos;
       array = new ArrayList<Object>();
       for (Object i : super.getStats()){ 
            array.add(i);
        }
       array.add(speed);
    }
    public ArrayList<Object> getStats(){
        return array;
    }
    public int getspeed(){
        return speed;
    }
}
