
/**
 * Write a description of class food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class chestgaurd extends Armor{
    ArrayList<Object> array;
    int health;
    public chestgaurd(String name, int weight, int value, int defence, int hp){
       super(name, weight, value, defence);
       health = hp;
       array = new ArrayList<Object>();
       for (Object i : super.getStats()){ 
            array.add(i);
        }
       array.add(health);
    }
    public ArrayList<Object> getStats(){
        return array;
    }
    public int gethealth(){
        return health;
    }
}