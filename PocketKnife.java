
/**
 * Write a description of class PoketKnife here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class PocketKnife extends Tool
{
    int Sharpness;
     public PocketKnife(String name, int weight, int value ,int dmg, int srp){
        super(name,weight, value, 2);
        Sharpness = srp;
          array = new ArrayList<Object>();
        for (Object i : super.getStats()){ 
            array.add(i);
        }
        array.add(Sharpness);
    }

    public int getSharpness(){
        return Sharpness;
    }
}