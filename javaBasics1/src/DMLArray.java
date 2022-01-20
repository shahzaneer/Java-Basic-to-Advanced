import java.util.Scanner;
public class DMLArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the no of items you want to enter");
        int n = obj.nextInt();
        int num [] = new int [n];
        System.out.println("Enter "+n+" Numbers");

        for(int i = 0; i<n;i++){
            num[i]= obj.nextInt();
        }

        System.out.println("You entered");

        for(int i = 0; i<n;i++){
            System.out.println(num[i]);
        }
    }
}
