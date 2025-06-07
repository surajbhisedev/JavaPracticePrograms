import java.util.Scanner;

public class Program_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter firt number ");
        double num1 = sc.nextDouble();

        System.out.println("Enter Second number");
        double num2 = sc.nextDouble();

        System.out.println("Enter Operation (+,-,*,/)");
        char operator = sc.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + num2);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 - num2);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 * num2);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 /num2;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                break;
        }
    }
}
