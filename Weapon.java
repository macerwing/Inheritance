
/**
 * Write a description of class Weapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Weapon extends Item implements WeaponInterface
{
    int damage;
    public Weapon(String name, int weight, int value, int dmg){
       super(name, weight, value);
       damage = dmg;
    }

}
