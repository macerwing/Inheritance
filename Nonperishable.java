
/**
 * Write a description of class Nonperishables here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Nonperishable extends Tool
{
    int lasting;
     public Nonperishable(String name, int weight, int value ,int dmg, int lt){
        super(name,weight, value, 2);
        lasting = lt;
          array = new ArrayList<Object>();
        for (Object i : super.getStats()){ 
            array.add(i);
        }
        array.add(lasting);
    }

    public int getlasting(){
        return lasting;
    }
}