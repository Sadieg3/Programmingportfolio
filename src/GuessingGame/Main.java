import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // Print Statement (Welcome, guess a number 0-100)
    System.out.println("Welcome, guess a number 0-100!");

    // set boundaries 0-100

    // generate random number
    Random rand = new Random();
    int computerNum = rand.nextInt(100);
    //System.out.println(computerNum); // delete later

    // input guess
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter a number between 0-100");
    int guess = scan.nextInt();

    // compare random number and guess
    if (guess == computerNum) {
      System.out.println("You win!");
    }

    while (guess != computerNum) {
      // if guess > number print to high
      if (guess > computerNum) {
        System.out.println("Whoops you guessed too high, guess again");
        guess = scan.nextInt();

      } else if (guess < computerNum) {
        System.out.println("Whoops you guessed too low, guess again");
        guess = scan.nextInt();

      } else {
      }

    }
    // compare random number and guess
    if (guess == computerNum) {
      System.out.println("You win!");
    }
    // if guess = number print you win press p to play again

    // `if guess entered 10 times print you lose press P to play again

  }
}


   