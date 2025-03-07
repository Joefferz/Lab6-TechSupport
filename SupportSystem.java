/**
 * This class implements a technical support system. It is the top level class 
 * in this project. The support system communicates via text input/output 
 * in the text terminal.
 * 
 * This class uses an object of class InputReader to read input from the user,
 * and an object of class Responder to generate responses. It contains a loop
 * that repeatedly reads input and generates output until the users wants to 
 * leave.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */

/*
 * 2. Summary of what it is and what it does, a field summary and a constructor
 * summary. Other classes are formatted the same way. Its purpose is to explain
 * how to use the class.
 * 
 * 3. One tests the substring beginning and at the specified index with the
 * specified  prefix. While the other one tests if the string starts with the
 * specfied prefix.
 * 
 * 4. public boolean endsWith(String suffix) 
 * 
 * 5. public int length()
 * 
 * 6. Links in the method summary, refer you to the method details.
 * 
 * 7. public String trim()
 * 
 * 10. boolean
 * 
 * 12. Package: java.util
 *     Random(): Creates a new random number generator.
 *     Create a new instance: Random rnd = new Random();
 *     Generate random number: nextInt()
*/     

public class SupportSystem
{
    private InputReader reader;
    private Responder responder;
    
    /**
     * Creates a technical support system.
     */
    public SupportSystem()
    {
        reader = new InputReader();
        responder = new Responder();
    }

    /**
     * Start the technical support system. This will print a welcome
     * message and enter into a dialog with the user, until the user
     * ends the dialog.
     */
    public void start()
    {
        boolean finished = false;

        printWelcome();

        while(!finished) {
            String input = reader.getInput();
            input = input.trim(); //Question 8
            input = input.toLowerCase(); //Question 9
            if(input.equals("bye")) { //Question 11
               finished = true;
            }
            else {
                String response = responder.generateResponse(input);
                System.out.println(response);
            }
        }

        printGoodbye();
    }

    /**
     * Print a welcome message to the screen.
     */
    private void printWelcome()
    {
        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println();
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");
    }

    /**
     * Print a good-bye message to the screen.
     */
    private void printGoodbye()
    {
        System.out.println("Nice talking to you. Bye...");
    }
}