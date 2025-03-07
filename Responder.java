//import java.util.Random;
//import java.util.ArrayList;
import java.util.HashMap;
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
        responses.put("a", "123");
        responses.put("b" , "456");
        responses.put("c" , "789");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String word)
    {
        //int index = randomGenerator.nextInt(randomResponses.size());
        //return randomResponses.get(index);
        String answer = responses.get(word);
        if(answer == null){
            answer = pickDefaultResponse();
        }
        return answer;
    }
    
    private String pickDefaultResponse()
    {
        return "Enter a valid key...";
    }
}