import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scan.nextLine();
        System.out.println("Welcome " + name + "!");
        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter the first integer: ");
        int firstInt = input2.nextInt();
        Scanner input3 = new Scanner(System.in);
        System.out.println("Please enter the second integer: ");
        int secondInt = input3.nextInt();
        Scanner input4 = new Scanner(System.in);
        System.out.println("Please enter the third integer: ");
        int thirdInt = input4.nextInt();
        double average = (firstInt + secondInt + thirdInt) / 3.0;
        System.out.println("The average of " + firstInt + ", " + secondInt + ", and " + thirdInt + " is " + average);
    }
}
