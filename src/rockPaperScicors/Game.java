package rockPaperScicors;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // loop through and keep asking user to enter the move
        while (true) {

            System.out.print("Enter your move. Type in 'rock', 'paper' or 'scissors'. If you want to exit the game, type in 'quit'. ");
            String myMove = scanner.nextLine();

            if (myMove.equals("quit")) {
                break;
            }

            //check if entered valid move
            if (!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors")) {
                System.out.println("Your move is not valid!");
            } else {
                //randomly generate opponents move (0, 1, 2)
                int rand = (int) (Math.random() * 3);
                String opponentMove = "";
                if (rand == 0) {
                    opponentMove = "rock";
                } else if (rand == 1) {
                    opponentMove = "paper";
                } else if (rand == 2) {
                    opponentMove = "scissors";
                }
                System.out.println("Opponent move: " + opponentMove);

                // calculate if you won lost or tied:
                if (myMove.equals(opponentMove)) {
                    System.out.println("You tied!");
                } else if ((myMove.equals("rock") && opponentMove.equals("scissors")) || (myMove.equals("scissors") && opponentMove.equals("paper")) || (myMove.equals("paper") && opponentMove.equals("rock"))) {
                    System.out.println("You won!");
                } else {
                    System.out.println("You lost!");
                }
            }
        }
        System.out.println("Thank you for playing!");
    }
}
