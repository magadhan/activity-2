import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber{
    public static void main(String[] args){

        System.out.println("Welcome to 'Guess the Number'!\nI'm thinking of a number between 1 and 10.");

        int min = 1;
        int max = 10;

        Random random = new Random();
        int randomNum = random.nextInt(max - min + 1) + min;

        Scanner scnr = new Scanner(System.in);
        int userGuess;

        try {
            do { 
                System.out.print("Enter your guess: ");
                
                userGuess = scnr.nextInt();
                if (userGuess < 1 || userGuess > 10) {
                    throw new IllegalArgumentException("Error: Please guess a number between 1 and 10.");
                }
                
                if (userGuess!=randomNum) {
                    System.out.println("Try Again!");
                }
                
            } while (userGuess!=randomNum);

            if(userGuess == randomNum){
                System.out.println("Congratulations! You guessed the right number!");
            }
            
        } catch (InputMismatchException e) {
            System.err.println("Error: That's not a valid number. Please enter an integer.");
            scnr.close();
        } catch(IllegalArgumentException e) {
            System.err.println(e.getMessage());
            scnr.close();
        }

    }
}
