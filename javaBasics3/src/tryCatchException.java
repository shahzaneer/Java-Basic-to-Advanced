import java.util.Scanner;
public class tryCatchException {
    public static void main(String[] args) {
//        try  k forun baad catch block use houta hai
//        try block ko chota rkhna chahiay srff wo statements rkhni chahiayn jo exception throw krsakain!
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 'a' and 'b' separated by space :");
        int a = input.nextInt();
        int b = input.nextInt();

        try {
            int c = a/b;
            System.out.println(c);

//            exception jis line main throw hojaye us line se direct command catch block per shift hojata hai!
            System.out.println("Exception throw nhi hui! ");
        }
        catch (ArithmeticException e){
//            catch(errorName variableThatContainsErrorInfo)
            System.out.println("Division by zero is not possible ");
        }




    }
}
