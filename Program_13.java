public class Program_13 {
    public static void main(String[] args) {
        int num1 = 18;
        int num2 = 19;
        int num3 = 14;

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is greater");
        }else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is greater");
        }else {
            System.out.println(num3 + " is greater");
        }
    }
}
