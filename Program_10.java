public class Program_10 {
    public static void main(String[] args) {
        float first = 1.0f, second = 2.45f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        // Value of first is assigned to temporary 
        float temporary = first;

        first = second;
        second = temporary;
        System.out.println(first);
        System.out.println(second);
    }
}
