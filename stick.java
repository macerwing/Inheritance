
/**
 * Write a description of class Stick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Stick extends Tool
{
    int length;
     public Stick(String name, int weight, int value ,int dmg, int lgth){
        super(name,weight, value, 2);
        length = lgth;
          array = new ArrayList<Object>();
        for (Object i : super.getStats()){ 
            array.add(i);
        }
        array.add(damage);
    }

    public int getlentgh(){
        return length;
    }
}


