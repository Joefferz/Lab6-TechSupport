import java.util.Random;
import java.util.ArrayList;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder
{
    private Random randomGenerator;
    private ArrayList<String> randomResponses;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        randomGenerator = new Random();
        randomResponses = new ArrayList<>();
        fillResponses();
    }
    
    private void fillResponses(){
        randomResponses.add("hello");
        randomResponses.add("yes");
        randomResponses.add("no");
        randomResponses.add("maybe");
        randomResponses.add("i don't know");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int index = randomGenerator.nextInt(randomResponses.size());
        return randomResponses.get(index);
    }
}