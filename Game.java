import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Game {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        // Main code here
        HashMap<String, String[]> options = new HashMap<>();
        Random random = new Random();

        // Declarations
        int userChoice;
        int computerChoice = random.nextInt(5);
        int enumerate = 1; // you should know by now why I am doing this

        // Add all the options
        //Rock
        String[] rock = {"Scissor", "Lizard"};
        options.put("Rock", rock);
        //Paper
        String[] paper = {"Spock", "Rock"};
        options.put("Paper", paper);
        //Scissor
        String[] scissor = {"Paper", "Lizard"};
        options.put("Scissor", scissor);
        //Lizard
        String[] lizard = {"Paper", "Spock"};
        options.put("Lizard", lizard);
        //Spock
        String[] spock = {"Rock", "Scissor"};
        options.put("Spock", spock);



        
        scanner.close();
        
    }
}