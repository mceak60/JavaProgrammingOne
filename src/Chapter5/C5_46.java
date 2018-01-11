package Chapter5;

import java.util.Scanner;

/**
 * Program to play Rock Paper Scissors
 *
 * @author Nick Gonzalez
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ComputerGuess, PlayerGuess;
        int CompCount = 0;
        int PlayerCount = 0;
        do {
            System.out.println("Enter 0 for rock, 1 for paper, or 2 for scissors");
            PlayerGuess = input.nextInt();
            ComputerGuess = (int) (Math.random() * 3);

            switch (PlayerGuess) {
                case 0:
                    if (ComputerGuess == 0) {
                        System.out.println("It's a tie");
                    } else if (ComputerGuess == 1) {
                        System.out.println("You lose");
                        CompCount++;
                    } else if (ComputerGuess == 2) {
                        System.out.println("You win");
                        PlayerCount++;
                    }
                    break;
                case 1:
                    if (ComputerGuess == 0) {
                        System.out.println("You win");
                        PlayerCount++;
                    } else if (ComputerGuess == 1) {
                        System.out.println("It's a tie");
                    } else if (ComputerGuess == 2) {
                        System.out.println("You lose");
                        CompCount++;
                    }
                    break;
                case 2:
                    if (ComputerGuess == 0) {
                        System.out.println("You lose");
                        CompCount++;
                    } else if (ComputerGuess == 1) {
                        System.out.println("You win");
                        PlayerCount++;
                    } else if (ComputerGuess == 2) {
                        System.out.println("It's a tie");
                    }
                    break;
            }
        } while (PlayerCount < 2 && CompCount < 2);
    }
}
