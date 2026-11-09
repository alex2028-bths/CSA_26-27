import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer greater than 5: ");
        int num = myScanner.nextInt();

        while (num <= 5) {
            System.out.print("Try again: ");
            num = myScanner.nextInt();
        }
        int count = 0;
        while(count < num) {
            System.out.println(count);
            count++;
        }

        System.out.println("and finally " + num);
        myScanner.close();
    }
}
