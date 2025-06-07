import java.util.Scanner;
public class Program_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Distance in KM ");
        double Kilometers = sc.nextDouble();
        double miles = Kilometers / 1.6;
        System.out.println(miles);

        sc.close();
    }
}