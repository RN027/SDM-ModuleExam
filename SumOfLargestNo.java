
import java.util.Scanner;

public class SumOfLargestNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        int sum = 0;

        if (num1 >= num2 && num1 >= num3) {
            sum = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            sum = num2;
        } else {
            sum = num3;
        }

        System.out.println("The sum of the largest number is: " + sum);
    }
}