import java.util.Scanner;
public class WordMatrix {

    public static void main(String args[]) {
        
        System.out.println("----------------------------------- WORD MATRIX -----------------------------------");
        System.out.println();
        
        System.out.println("Word Matrix is a fun and stimulating game that generates a matrix of\n"
                + "random characters and a pattern hidden with the matrix. It's your job to find\n"
                + "the pattern and determine its orientation (whether it occurs vertically or\n"
                + "horizontally) in the least amount of time possible. Upon each increasing level,\n"
                + "the matrix increases in size making the pattern more and more difficult to find.");
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("                                    How to Play:                                    ");
        System.out.println("\n1. Find the hidden word within the matrix");
        System.out.println("2. Enter the starting position of the word. Example: (3,2)");
        System.out.println("3. Enter the word's orientation:");
        System.out.println();
        System.out.println("If your input is correct, you'll advance to the next level "
                + "and the matrix will increase in size.\nIf it's incorrect, a new matrix of the same"
                + "size will continue generate until you've successfully entered the correct information.");
        System.out.println();
        System.out.println("                                  Got it? Enter \"Y\" to Play!                                    ");
        System.out.println("------------------------------------------------------------------------------------");
        Scanner scnr = new Scanner(System.in);
        char input = scnr.next().charAt(0);
        if (input == 'N' || input == 'n') {
           System.out.println("Goodbye!");
                System.exit(0); 
        }
        else while (input != 'Y' || input != 'y') {
            System.out.println("Invalid Option. Enter \"Y\" to play, else enter \"N\" to exit.");
            input = scnr.next().charAt(0);
            if (input == 'N' || input == 'n') {
                System.out.println("Gone so soon? Goodbye!");
                System.exit(0);
            }
            Level level = new Level();
            
        }
    }
}
