import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String p1 = "";
        String p2 = "";
        String yesNo = "";
        Boolean done = false;
        Boolean gameOver = false;

        //Check for Player 1
        do {
            do {
                System.out.println("Player 1 enter Rock(R/r), Paper(P/p), or Scissors(S/s)");
                p1 = in.nextLine();
                if (p1.equalsIgnoreCase("R") ||
                        p1.equalsIgnoreCase("P") ||
                        p1.equalsIgnoreCase("S"))
                {
                    done = true;
                }
                else
                {
                    System.out.println("Incorrect Input: " + p1 + ". Try again");
                }

            } while (!done);

            // Check for Player 2

            done = false;
            do {
                System.out.println("Player 2 enter Rock(R/r), Paper(P/p), or Scissors(S/s)");
                p2 = in.nextLine();
                if (p2.equalsIgnoreCase("R") ||
                        p2.equalsIgnoreCase("P") ||
                        p2.equalsIgnoreCase("S"))
                {
                    done = true;
                } else
                {
                    System.out.println("Incorrect Input: " + p2 + ". Try again");
                }

            } while (!done);

            //Check for Winner

            if (p1.equalsIgnoreCase("R"))
            {
                if (p2.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock vs Rock, Its a Tie!");
                }
                else if (p2.equalsIgnoreCase("P"))
                {
                    System.out.println("Rock vs Paper, Player 2 Wins!");
                }
                else
                {
                    System.out.println("Rock vs Scissors, Player 1 Wins");
                }
            }
            else if (p1.equalsIgnoreCase("P"))
            {
                if (p2.equalsIgnoreCase("R"))
                {
                    System.out.println("Paper vs Rock, Player 1 Wins!");
                }
                else if (p2.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper vs Paper, Its a Tie!");
                }
                else
                {
                    System.out.println("Paper vs Scissors, Player 2 Wins");
                }
            }
            else
            {
                if (p2.equalsIgnoreCase("R"))
                {
                    System.out.println("Scissors vs Rock, Player 2 Wins!");
                }
                else if (p2.equalsIgnoreCase("P"))
                {
                    System.out.println("Scissors vs Paper, Player 1 Wins!");
                }
                else
                {
                    System.out.println("Scissors vs Scissors, Its a Tie!");
                }
            }
            System.out.println("Play Again? (Y/N)");
            yesNo = in.nextLine();
            if (yesNo.equalsIgnoreCase("Y"))
            {
                gameOver = false;
            }
            else
            {
                gameOver = true;
            }
        } while (!gameOver);
    }
}
