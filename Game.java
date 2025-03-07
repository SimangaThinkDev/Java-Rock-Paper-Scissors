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
        // So the reason i did this is because I initially wanted to index into the keySet()
        // Tehn I just decided to move it to a list instead
        ArrayList<String> list = new ArrayList<>(options.keySet());
        
        // Display options to user
        System.out.println("Please pick a hand to play");
        for (String option: list) {
            System.out.printf("%d. %s\n", enumerate, option);
            enumerate++;
        }
        // Collect user input (I minus one for indexing, kept it at plus for user)
        System.out.print(">> ");
        userChoice = scanner.nextInt() - 1;
        scanner.nextLine();

        // Store the results as the actual vals
        String userResult = list.get(userChoice);
        String computerResult = list.get(computerChoice);

        // For transparency show the user that you recorded what they chose and
        // what the computer chose
        System.out.printf("User has chosen %s\n", userResult);
        System.out.printf("Computer has chosen %s\n", computerResult);
        
        // Implement game checker

        // equal choices //
        if (userResult.equals(computerResult))
        {
            System.out.println("It is a Tie!");
        }
        // Losing Choice for user //
        else if ( userResult.equals(options.get(computerResult)[0]) || userResult.equals(options.get(computerResult)[1]) ) {
            System.out.println("You Lose! ");
        }
        // Winning choice for user //
        else {
            System.out.println("You Win!");
        }

        // Ask the user if they want to continue
        System.out.print("Play Again: ");
        String playAgain = scanner.nextLine();
        
        // Use Recursion to allow the player to play again
        if (playAgain.toLowerCase().equals("yes")) {
            main(args);
        }else {
            System.out.println("Bye");
        }

        // close the scanner
        scanner.close();
        
    }
}