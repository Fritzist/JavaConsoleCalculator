import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number1, number2;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        number1 = input.nextInt();
        number2 = input.nextInt();

        System.out.println("The sum of " + number1 + " and " + number2 + " is " + (number1 + number2));
        System.out.println();
        System.out.println("The difference of " + number1 + " and " + number2 + " is " + (number1 - number2));
        System.out.println();
        System.out.println("The product of " + number1 + " and " + number2 + " is " + (number1 * number2));
        System.out.println();
        System.out.println("The quotient of " + number1 + " and " + number2 + " is " + (number1 / number2));
        System.out.println();
        System.out.println("The remainder of " + number1 + " and " + number2 + " is " + (number1 % number2));
    }
}
