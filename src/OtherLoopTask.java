import java.util.Random;
import java.util.Scanner;

public class OtherLoopTask {
    public static void main(String[] args) {

        /** System.out.println("Task 1");
        for (int count = 1; count <= 5; count++){
            System.out.println(count);
            if(count == 5){
                System.out.println("Blastoff!");
            }
        }

        System.out.println("Task 2");
        for (int num = 15; num >=15 && num <= 20; num++){
            if(num % 2 == 1){
                System.out.println(num);
            }
        }

        System.out.println("Task 3");
        int sum = 0;
        for(int number = 1; number >= 1 && number <= 10; number++){
            System.out.println(number);
            sum += number;
        }System.out.println(sum);
        System.out.println("Your average is " + sum/10);

        System.out.println("Task 4");
        String yes = "yes";
        String no = "no";
        String input = "input";
        do{
            System.out.println("Game goes here");
            System.out.println("Do you want to play a game? yes or no");
            Scanner user = new Scanner(System.in);
            input = user.nextLine();
        } while(input.equals(yes));{
        }
**/
        System.out.println("Task 5");
        System.out.println("do you want to play a game yes or no");
        Scanner game = new Scanner(System.in);
        String play = game.nextLine();
        do {
           System.out.println("Enter a minimum value:");
           int min = game.nextInt();
           System.out.println("Enter a maximun value:");
           int max = game.nextInt();
           Random value = new Random();
           int random = value.nextInt(max + 1 - min) + min;
           System.out.println("Guess a number between " + min + " and " + max);
           int userGuess = game.nextInt();
           int guess = 1;
           while (guess < 3 && userGuess != random) {
               System.out.println("Try again!");
               userGuess = game.nextInt();
               guess++;
           }
           if (userGuess == random) {
               System.out.println("You won!");
           } else {
               System.out.println("You lost :(");
           }
       }while (game.equals("yes"));
    }
}
