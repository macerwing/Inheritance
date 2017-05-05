
/**
 * Write a description of class crossbow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class crossbow extends Weapon
{
    int rounds;
     public crossbow(String name, int weight, int value ,int dmg, int rnds){
        super(name,weight, value, 2);
        rounds= rnds;
          array = new ArrayList<Object>();
        for (Object i : super.getStats()){ 
            array.add(i);
        }
        array.add(rounds);
    }
   
    public int getrounds(){
        return rounds;
    }
}