
/**
 * Write a description of class tools here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Tools extends Item{
    int damage;
    public Tools (String name, int weight, int value, int dmg){
        super(name, weight, value);
        damage = dmg;
        array = new ArrayList<Object>();
        for (Object i : super.getStats()){ 
            array.add(i);
        }
        array.add(damage);
    }

    public ArrayList<Object> getStats(){
        return array;
    }

    public int getDamage(){
        return damage;
    }
}
