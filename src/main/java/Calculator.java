import java.util.Scanner;

public class Calculator {
    public static void main(String[] args)
    {
        multiply();
    }
    public static void multiply()
    {
        System.out.println("Please enter your first number to multiply: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter your second number to multiply: ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber * secondNumber;
        System.out.println("The total multiplication is: "+ total);
    }
}
