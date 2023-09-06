import java.util.Random; //library for generating random.
import java.util.Scanner; //library for the user input

public class CoinFlipGame { //class name 
    public static void main(String[] args) { // start of the program
        Scanner scanner = new Scanner(System.in); // create the scanner object to read input 
        Random random = new Random(); // creates the random object 

        System.out.println("Welcome to the Coin Flip Game!");// display in the console
        System.out.print("Guess the coin toss! Enter 'heads' or 'tails': ");// prompt of question
        String userGuess = scanner.next(); // reads the guess from the console and store it as a guess variable

        //  this is used to Generate a random 0 or 1 for heads or tails
        int coinToss = random.nextInt(2); // 0 represents heads, 1 represents tails

        String result = (coinToss == 0) ? "heads" : "tails"; //this is checking the result if its = to 0 then its heads or 1 its tails 

        if (userGuess.equalsIgnoreCase(result)) { // This is to check if the user guess in userGuess is matches the result 
            System.out.println("Congratulations! It's " + result + ". You win!");
        } else {
            System.out.println("Sorry, it's " + result + ". You lose.");// Doesent Match you get this 
        }
        scanner.close();
    }
}

// Units Used
//  Unit 1: Primitive Data Types 
// Unit 2 Using Objects 
// unit 3: boolean expressions
