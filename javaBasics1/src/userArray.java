import java.util.Scanner;
public class userArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
//        scanner class user se input leti hai iska object banaya.
        int num [] = new int [5];
        System.out.println("Enter 5 integers");
        for (int i = 0 ; i < 5; i++){
            num [i] = obj.nextInt();
//            num @ i main obj use hua hai yaani iske use hotay hi user input lia jayega ;
        }

        System.out.println("You entered numbers :");
        for (int i = 0 ; i <5; i++){
//            yeh for loop display k liay use hua hai
            System.out.println(num[i]);
        }

    }
}
