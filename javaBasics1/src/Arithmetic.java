import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
     Scanner obj = new Scanner(System.in);
        System.out.println("Enter 1st no");
        int a = obj.nextInt();
        System.out.println("Enter 2nd no");
        int b = obj.nextInt();

        int c = a + b;
        System.out.println("the sum of the two number is :"+c);
    }
}
