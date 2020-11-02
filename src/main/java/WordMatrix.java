import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class WordMatrix {
    static boolean isPlaying = false;
    static String playerAnswer = ""; // The player's input
    static String answer = ""; // The hidden word in the matrix
    static Timer timer;
    static Level level; 
    // Executes the program with timer
   public static void run() {
       long start = System.currentTimeMillis();
        long end = start + 30*1000; // 30 seconds * 1000 ms/sec
        System.out.println("\nTimer has Started");
        
        level = new Level();
        level.determineMatrixSize();
        level.createMatrix();
        
        // As long as player is playing, new matrices will keep generatating after receiving
        // player's input
        while (isPlaying = true && System.currentTimeMillis() < end) {
            answer = level.retrieveWord();
            Scanner scr = new Scanner(System.in);
            System.out.println("answer: " + answer); 
            System.out.println("Enter the word");
            playerAnswer = scr.nextLine();
        
            // If player's input is correct, a larger matrix will generate
            if (playerAnswer.equals(answer)) {
                System.out.println();
                System.out.println("*------------------------------------------------------------------------------------*");
                System.out.println();
                System.out.println("Correct! Next Level.");
                System.out.println();
                System.out.println("*------------------------------------------------------------------------------------*");
                System.out.println();
                level.increaseLevel();
                level.determineMatrixSize();
                level.createMatrix();
               
            }
            // If player's input is incorrect, a new matrix of same size will generate
            else {
                System.out.println();
                System.out.println("*------------------------------------------------------------------------------------*");
                System.out.println();
                System.out.println("Incorrect. Try Again with A New Matrix.");
                System.out.println();
                System.out.println("*------------------------------------------------------------------------------------*");
                System.out.println();
                level.createMatrix();
            }
        }
        System.out.println("\nTime's Up!");
        level.setHighestLevel();
       String[] args={};
        main(args);
        /* ADD END "PAGE" HERE*/
            
    }
    
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
        System.out.println("2. Enter the word.");
        System.out.println("3. Complete as many matrices as you can in 30 seconds.");
        System.out.println();
        System.out.println("If your input is correct, you'll advance to the next level "
                + "and the matrix will increase in size.\nIf it's incorrect, a new matrix of the same"
                + "size will continue generate until you've successfully entered the correct information.");
        if(level!=null){
             System.out.println("Highest Level: "+level.getHighestLevel());
        }else{
            System.out.println("Highest Level: 0");
        }
       
        System.out.println();
        System.out.println("                            Got it? Enter \"Y\" to Play!                            ");
        System.out.println("------------------------------------------------------------------------------------");
        Scanner scnr = new Scanner(System.in);
        char input = scnr.next().charAt(0);
        
        // If input equals "N" or "n", the program will stop executing
        if (input == 'N' || input == 'n') {
            isPlaying = false;
           System.out.println("Goodbye!");
                System.exit(0); 
        }
        // If input is invalid, program will continue to ask for correct input
        else while (input != 'Y' && input != 'y') {
            System.out.println("Invalid Option. Enter \"Y\" to play, else enter \"N\" to exit.");
            input = scnr.next().charAt(0);
            if (input == 'N' || input == 'n') {
                isPlaying = false;
                System.out.println("Gone so soon? Goodbye!");
                System.exit(0);
            }
        } 
        // If input is "Y" or "y", the game will start
        if (input == 'Y' || input == 'y') {
           isPlaying = true;
           run();
          
        }

    }
}
