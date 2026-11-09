import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number do you want to factorial? ");
        System.out.print("Enter a number between 0 and 170: ");
        int userNumber = scanner.nextInt();
        int num = userNumber;
        while(userNumber < 0 || userNumber > 170) {
            System.out.print("No! Between 0 and 170: ");
            userNumber = scanner.nextInt();
        }
        double factorial = 1;
        while(userNumber > 1) {
            factorial *= userNumber;
            userNumber--;
        }
        System.out.println(num + "! is " + factorial);
    }
}