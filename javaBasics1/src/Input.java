import java.util.Scanner;
//scanner java pkg k sub pkg util ki aik class hai!

public class Input{
    public static void main(String []argsKijagahkuchbhiaasktahai){
        Scanner obj = new Scanner(System.in);
//        chunkay scanner aik class hai tou hamain aik object banana hoga!

        System.out.println("Enter any integer");
        int n = obj.nextInt();
//        nextInt,next,nextLine,nextFloat etc scanner class k methods hain to read the input from keyboard.
        System.out.println("The integer is "+n);
//        yahan + concatenation operator hai!

        System.out.println("Enter any float");
        float f = obj.nextFloat();
        System.out.println("The float is "+f);

        System.out.println("Enter any String");

        String s = obj.next();

        System.out.println("The String is "+s);




    }
}