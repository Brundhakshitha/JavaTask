package Basics;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNum {
     static Scanner input;
    public static int getInput(){
        int num = input.nextInt();
        input.nextLine();
        return num;
    }
    public static boolean playChoice(){
        System.out.println("If you wanna continue...('yes'/'no'): ");
        String choice = input.nextLine();
        if(choice.equals("yes")){
            System.out.println("Ok guess again...");
            return true;
        }else if(choice.equals("no")){
            System.out.println("Ok this is the end for us..");
            return false;
        }else{
            System.out.println("Invalid input so..");
            return playChoice();
        }
    }
    public static void guessTheNum(int n, int randomNum){
        boolean guessedCorrectly = false;
        boolean play = true;
        while(play){
            if(n > randomNum){
                System.out.println("The Guess is too high...");
                play = playChoice();
            }else if(n<randomNum){
                System.out.println("The guess is too low..");
                play = playChoice();
            }else{
                System.out.println("You guessed it right.. Yayy!!");
                guessedCorrectly = true;
                break;
            }
            if(play){
                n = getInput();
            }
        }
        if(!guessedCorrectly){
            System.out.println("You quit! The correct number was: " + randomNum);
        }

    }
    public static void main(String[] args) {
        input = new Scanner(System.in);
        Random random  = new Random();
        int ran = random.nextInt(100);
        System.out.println("Enter a number(guess) : ");
        int number = input.nextInt();
        input.nextLine();
        guessTheNum(number,ran);
    }
}
