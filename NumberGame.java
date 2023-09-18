
import java.util.*;
public class NumberGame {
public static void main(String[] args) 
{
    int randomNumber = (int)(Math.random()* 100) + 1;
    System.out.println("There is a random number between 1 - 100");
    System.out.println("Try to guess it");
    boolean hasWon = false;

    try (//Reads user input
    Scanner scanner = new Scanner(System.in)) {
        for(int i = 10; i > 0; i --){
            System.out.println("You have " + i + " guesses left, choose again");
            int guess = scanner.nextInt();
            System.out.println("Your guess is " + guess);

            if(randomNumber < guess)
            {
                System.out.println("It is smaller then " + guess + " guess");
            }
            else if (randomNumber > guess){
                System.out.println("It is greater than your guess ");
            }
            else{
                hasWon = true;
                break;
            }
        }
    }

    if (hasWon == true){
        System.out.println("YOU WIN!");
    } else{
        System.out.println("YOU LOST");
        System.out.println("Correct number was" + randomNumber);
    }
} 
}
