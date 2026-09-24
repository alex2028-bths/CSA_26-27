import  java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.print("Please enter a 3-digit integer: ");
       int number = scan.nextInt();
       int firstDigit = number/100;
       int secondDigit = (number / 10) % 10;
       int thirdDigit = (number - firstDigit*100) % 10;
       System.out.println("The reverse of "+number+" is: " + thirdDigit + secondDigit + firstDigit);
    }
}