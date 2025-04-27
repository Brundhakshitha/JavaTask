package Basics;

import java.util.Scanner;

public class GradeStudent {
    static Scanner input;
    public static boolean studentChoice(){
        System.out.println("Do you want to check your garde and other info: (yes/no)");
        String choice = input.nextLine();
        if(choice.equals("yes")){
            checkInfo();
            return true;
        }else if (choice.equals("no")){
            System.out.println("Ok byee...");
            return false;
        }else{
            System.out.println("Enter valid choice (yes/no): ");
            return studentChoice();
        }
    }

    public static void checkInfo(){
        System.out.println("Enter your Math marks: ");
        int math = input.nextInt();
        input.nextLine();
        System.out.println("Enter your Science marks: ");
        int sci = input.nextInt();
        input.nextLine();
        System.out.println("Enter your English marks: ");
        int eng = input.nextInt();
        input.nextLine();
        System.out.println("Enter your Social marks: ");
        int soci = input.nextInt();
        input.nextLine();

        int total = math + sci + eng + soci;
        System.out.println("So your total is: "+ total);

        int avg = total/4;
        System.out.println("Your average is: "+ avg);

        int perecntage = total*100 /400;
        System.out.println("And your percentage is: "+ perecntage);

        if(perecntage >90){
            System.out.println("Greade : 'A'");
        }else if(perecntage >80 && perecntage<90){
            System.out.println("Greade : 'B'");
        }else if(perecntage >70 && perecntage<80){
            System.out.println("Greade : 'C'");
        }else if(perecntage >60 && perecntage<70){
            System.out.println("Greade : 'D'");
        }else if(perecntage >60 && perecntage<50){
            System.out.println("Greade : 'E'");
        }else{
            System.out.println("Grade : 'F', you failed");
        }
    }

    public static void main(String[] args) {
        input = new Scanner(System.in);

        boolean studentOpt = true;
        while(studentOpt){
            studentOpt = studentChoice();
        }
    }
}
