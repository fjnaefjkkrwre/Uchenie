package For;

import java.util.Scanner;

public class MultiplicationTest {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
          int first = number.nextInt();
          System.out.println("Enter the first number");
          int second = number.nextInt();
          System.out.println("Enter the second number");
          int answer = number.nextInt();
          System.out.println("Enter answer");
              if(answer % second != first){ System.out.println("Answer is not correct");}
              else{ System.out.println("Correct answer");}
          }
}
