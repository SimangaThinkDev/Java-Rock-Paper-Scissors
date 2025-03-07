import java.util.ArrayList;
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

        // Keep a copy of options as a list, Trust me
        ArrayList<String> list = new ArrayList<>(options.keySet());
        
        // Display options to user
        System.out.println("Please pick a hand to play");
        for (String option: list) {
            System.out.printf("%d. %s\n", enumerate, option);
            enumerate++;
        }
        System.out.print(">> ");
        userChoice = scanner.nextInt() - 1;
        scanner.nextLine();


        scanner.close();
        
    }
}