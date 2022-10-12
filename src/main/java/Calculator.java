import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        multiply();
        add();
        delete();
    }

    public static void multiply() {
        System.out.println("Please enter your first number to multiply: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter your second number to multiply: ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber * secondNumber;
        System.out.println("The total multiplication is: " + total);
    }

    public static void add() {
        System.out.println("Please enter your first number to add: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter your second number to add: ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber + secondNumber;
        System.out.println("The total add is: " + total);
    }
    public static void delete()
    {
        System.out.println("Please enter your first number to delete: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter your second number to delete: ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber - secondNumber;
        System.out.println("The total answer is: "+ total);
    }
}

