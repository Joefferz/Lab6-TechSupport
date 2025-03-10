//import java.util.Random;
//import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder
{
    //private Random randomGenerator;
    //private ArrayList<String> randomResponses;
    private HashMap<String, String> responses;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        //randomGenerator = new Random();
        //randomResponses = new ArrayList<>();
        responses = new HashMap<>();
        fillResponsesMap();
    }
    
    private void fillResponsesMap(){
        //randomResponses.add("hello");
        //randomResponses.add("yes");
        //randomResponses.add("no");
        //randomResponses.add("maybe");
        //randomResponses.add("i don't know");
        responses.put("slow", "Try restarting your pc");
        responses.put("update" , "Is your system up to date");
        responses.put("help" , "What do you need help with");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> words)
    {
        //int index = randomGenerator.nextInt(randomResponses.size());
        //return randomResponses.get(index);
        for(String keyWord : words)
        {
            if(responses.containsKey(keyWord))
            {
                return responses.get(keyWord);
            }
        }
        return pickDefaultResponse();
    }
    
    private String pickDefaultResponse()
    {
        return "Could you please elaborate";
    }
}