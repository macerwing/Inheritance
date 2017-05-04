
/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
public abstract class Item implements ItemInterface{
    int weight;
    String name;
    int value;
    ArrayList<Object> array;
    public Item(String Nm, int weight, int val ){
        this.weight = weight;
        name = Nm;
        value = val;
        array = new ArrayList<Object>();
        array.add(name);
        array.add(value);
        array.add(weight);
    }
    public int getWeight(){
        return weight;
    }
    public String getName(){
        return name;
    }
    public int getValue(){
        return value;
    }
    public ArrayList<Object> getStats(){
        return array;
    }
}