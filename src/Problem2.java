import  java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Player 1, enter your name: ");
        String name = scan.nextLine();
        System.out.print("Enter your number: ");
        double number = scan.nextDouble();
        System.out.print("Player 2, enter your name: ");
        String name2 = scan.nextLine();
        System.out.print("Enter your number: ");
        double number2 = scan.nextDouble();
        if (number > number2 ){
            System.out.print(name+"'s number is bigger!");
        } else if (number < number2){
            System.out.print(name2+"'s number is bigger!");
        } else  {
            System.out.print("The numbers are equal!");
        }

    }
}