import java.util.Scanner;
public class Exceptions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 'a' and 'b' separated by space :");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = a/b;
        System.out.println(c);
        System.out.println("Rest of the code! ");
//        ager hum zero put karain tou answer undefine hoga tou error throw hojayega! yehi exception hai
//        exceptional result exception hai

//        Exception in thread "main" java.lang.ArithmeticException: / by zero

//        yeh unchecked exception hai as compiler ne hamay check kiay bagair hi program ko compile krlia
//        runtime exceptions aur iski types + errors aur uski types unchecked exceptions hain


    }
}
