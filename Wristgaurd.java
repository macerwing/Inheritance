
/**
 * Write a description of class pepples here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Wristgaurd extends Armor{
    ArrayList<Object> array;
    int repel;
    public Wristgaurd(String name, int weight, int value, int defence, int rp){
       super(name, weight, value, defence);
       repel= rp;
       array = new ArrayList<Object>();
       for (Object i : super.getStats()){ 
            array.add(i);
        }
       array.add(repel);
    }
    public ArrayList<Object> getStats(){
        return array;
    }
    public int getrepel(){
        return repel;
    }
}