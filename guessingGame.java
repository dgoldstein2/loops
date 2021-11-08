import java.util.Scanner;
import java.util.Random;
public class guessingGame
{
   public static void main (String [] args)
   {


  //Variables
  Random randomNumber = new Random();
  Scanner kbd = new Scanner(System.in);
  int computerValue = randomNumber.nextInt(100);
  int numberOfTries = 0;
  int success = 0;
  int guess = 0;
  String answer = "y"


  



   while (success == 0 && answer.equals("y"))
     {
        System.out.println("please enter an integer betwen 1 and 100 inclusive: ");
        guess = kbd.nextInt();
        numberOfTries++;

           if (guess < 1 || guess > 100){
              System.out.println("Invalid input");
           }
           

           else if (guess == computerValue){
              success++;
              System.out.println("You got it!");

           }
           else if (guess < computerValue){
              System.out.println("Your guess is too low!");
           }
           else if (guess > computerValue){
              System.out.println("Your guess is too high!");
    }
        System.out.println("Do you want to guess a new number (y/n)");
        answer = kbd.nextString();
    }



   }
}