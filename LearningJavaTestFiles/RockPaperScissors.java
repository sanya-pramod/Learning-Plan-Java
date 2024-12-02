import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        int randomNum = (int)(Math.random() * 3); // Generates 0, 1, or 2
        String compValue;
        
        // Determine computer's choice
        if (randomNum == 0){
            compValue = "R"; // Rock
        } else if (randomNum == 1) {
            compValue = "P"; // Paper
        } else {
            compValue = "S"; // Scissors
        }

        // Prompt user for input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter R for Rock, P for Paper, or S for Scissors:");
        String userInput = scanner.nextLine().toUpperCase();

        // Determine the result
        if (userInput.equals(compValue)) {
            System.out.println("It's a tie!");
        } else if (
            (userInput.equals("R") && compValue.equals("S")) ||
            (userInput.equals("P") && compValue.equals("R")) ||
            (userInput.equals("S") && compValue.equals("P"))
        ) {
            System.out.println("User Wins!");
        } else {
            System.out.println("Computer Wins!");
        }

        // Close the scanner
        scanner.close();
    }
}
