import java.util.Random;
/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    private Random randomGenerator;

    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        randomGenerator = new Random();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printOneRandom()
    {
        System.out.println("New random number " + randomGenerator.nextInt(100));
    }
    
    public void printMultiRandom(int howMany)
    {
        int index = 0;
        while (index < howMany)
        {
            printOneRandom();
            index++;
        }
    }
    
    public String getResponse()
    {
        int index = randomGenerator.nextInt(3);
        if (index == 0){
            return "yes";
        }
        else if (index == 1){
            return "no";
        }
        else{
            return "maybe";
        }
    }
}
