import java.util.*;
public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       Random random = new Random();
       int numberToGuess = random.nextInt(100) + 1;
       int attempts = 0;
       int guess = 0;
        System.out.println("Welcome to Number Guessing Game");
        System.out.println("Guess a number between 1 and 100");
        while(guess != numberToGuess){
            System.out.print("Enter your guess: ");
            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                sc.next(); 
                continue;
            }
            guess = sc.nextInt();
            attempts++;
            if(guess < numberToGuess){
                System.out.println("too low! try again!");
            }else if (guess > numberToGuess){
                System.out.println("too high! try again!");
            }else {
                System.out.println("Correct you guessed it in " + attempts + "attempts");
            }
        }
        sc.close();
    }
}
