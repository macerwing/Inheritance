
/**
 * Write a description of class Weapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.lang.Math;
public abstract class Weapon extends Item implements WeaponInterface{
    int attack;
    ArrayList<Object> array;
    public Weapon(String name, int weight, int value,int atk){
        super(name, weight, value);
        attack = atk;
        array = new ArrayList<Object>();
        for (Object i : super.getStats()){ 
            array.add(i);
        }
        array.add(attack);
    }

    public boolean parry(){
        if (attack > (int)(Math.random()*100 + 1)){
            return true;
        } else{
            return false;
        }
    }
    
    public ArrayList<Object> getStats(){
        return array;
    }
    
    public int attack(){
        return attack;
    }
}
