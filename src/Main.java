import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(100)+1;
        int guess =0;
        System.out.println("Welcome to the Guessing Game! You have to guess a number from 1 to 100. When you want to quit the game type quit! Enjoy!");
        while(true){
            if(scan.hasNextInt()){
                guess = scan.nextInt();
                if(guess>randomNumber){
                    System.out.println("Incorrect! Guess a lower number!");
                } else if (guess<randomNumber) {
                    System.out.println("Incorrect! Guess a higher number!");
                }else{
                    System.out.println("Congratulations! You guessed it!");
                }
            }else{
                System.out.println("You quit the game!");
                break;
            }
        }
    }
}