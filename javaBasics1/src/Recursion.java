import java.util.Scanner;
//Recursion --> it is the self calling of a method in itself. it divides the problem in two parts one is the base
// part and the other is the subpart (recursive part)

//kuch cheezain recursion se bht easy hojati hain aur iterative approach se mushkil .
public class Recursion {
    public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
//        System.out.println("Enter the number to find its factorial :");
        System.out.println("Enter the number to find its sums :");
//        int factorial = obj.nextInt();
        int sum = obj.nextInt();

//        System.out.println(recursiveMethod(factorial));
        System.out.println(recursiveSum(sum));

    }

    static int recursiveMethod(int number){

        if (number==0) return 1;
        else
         return number*recursiveMethod(number-1);

    }
    static int recursiveSum(int number){

        if (number == 0) return 0;
        else
            return number + recursiveSum(number-1);

    }


}
