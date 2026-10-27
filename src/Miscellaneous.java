import java.util.Scanner;

public class Miscellaneous {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Welcome to the Magic 8 Ball!");
      System.out.print("Enter a yes-no question and I will answer it: ");
      scan.nextLine();
      int a = (int) (Math.random() * 7);
      if (a == 1) {
         System.out.println("It is certain!");
      } else if (a == 2) {
         System.out.println("Ask again later");
      } else if (a == 3) {
         System.out.println("Don't count on it");
      } else if (a == 4) {
         System.out.println("Without a doubt");
      } else if (a == 5) {
         System.out.println("Concentrate and ask again");
      } else if (a == 6) {
         System.out.println("Outlook not so good");
      } else {
         System.out.println("Signs point to yes");
      }
   }
}
