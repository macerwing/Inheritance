
/**
 * Write a description of class armor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.lang.Math;
public class Armor extends Item implements DefenseCommands
{
    int defence;
    ArrayList<Object> array;
    public Armor(String name, int weight, int value,int def){
        super(name, weight, value);
        defence = def;
        array = new ArrayList<Object>();
        for (Object i : super.getStats()){ 
            array.add(i);
        }
        array.add(defence);
    }

    public boolean blocked(){
        if (defence > (int)(Math.random()*100 + 1)){
            return true;
        } else{
            return false;
        }
    }

    public ArrayList<Object> getStats(){
        return array;
    }
    public int getDefence(){
        return defence;
    }
}
