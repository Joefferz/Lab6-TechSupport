import java.util.HashMap;
/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MapTester
{
    private HashMap<String, String> contacts;
    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        contacts = new HashMap<>();
    }
    
    public void enterNumber(String name, String number) //<key, value>
    {
        contacts.put(name , number);
    }
    
    public String lookupNumber(String name)
    {
        return contacts.get(name);
    }
}
