import java.util.Scanner;

public class Program_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int number = scanner.nextInt();

        System.out.println("You entered: " + number);
        scanner.close();
    }
}
