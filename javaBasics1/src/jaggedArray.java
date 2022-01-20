import java.util.Scanner;
public class jaggedArray {
    public static void main(String[] args) {
//        int num [][] = new int[3][];

//        num[0] = new int [3];
//        num[1] = new int [2];
//        num[2] = new int [1];
//
//        num [0][0] = 1;
//        num [0][1] = 2;
//        num [0][2] = 3;
//        num [1][0] = 4;
//        num [1][1] = 5;
//        num [2][0] = 6;
//
//        for(int i = 0; i< num.length;i++){
//            for(int j = 0; j<num[i].length;j++){
//                System.out.print(num[i][j]+" ");
//            }
//            System.out.println();

//        }

        Scanner obj = new Scanner(System.in);
        int [] [] num = new int[3][];
//        initialization of jagged array
        num[0] = new int[3];  //ab jo rows hain unki alag alag memoray allocation k unme kitne columns/elements aanay chahiayn
        num[1] = new int[2];
        num[2] = new int[1];

        System.out.println("Enter elements in the jagged array of 3-2-1 :");
        for (int i = 0; i< num.length;i++){
            for(int j = 0; j< num[i].length;j++){
                num[i][j] = obj.nextInt();
            }
        }

        for (int i = 0; i< num.length;i++){
            for(int j = 0; j< num[i].length;j++){
                System.out.print(num[i][j] +" ");
            }
            System.out.println();
        }



    }
}
