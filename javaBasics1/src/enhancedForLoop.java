import java.util.Scanner;
public class enhancedForLoop {
    public static void main(String[] args) {
//        for each loop ki trh hai yeh
    Scanner obj = new Scanner(System.in);
//    for 1D-Array
        int num [] = new int[5];
        System.out.println("Enter 5 elements of array");
        for (int i = 0;i<5;i++){
            num [i] = obj.nextInt();
        }

//        yeh hai for each loop --> enhanced for loop
//        for (dataType variable : nameArray){ statements; }

        for(int i:num){
//            i main aik aik kr k ayengi num ki values.
            System.out.println(i);
        }

//        for 2D-Array

        int number [][] = {{11,22},{33,44},{55,66}};

        for (int [] i : number){
//            int [] i main numbers aajayen
            for (int j: i){
//                i array main jo bhi elements hain aik aik kr k ayen j main.

                System.out.print(j+" ");
            }
            System.out.println();
        }



    }
}
