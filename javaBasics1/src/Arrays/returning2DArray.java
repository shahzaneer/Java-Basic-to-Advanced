package Arrays;

import java.util.Arrays;

public class returning2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2},
                       {3, 4}};

        System.out.println(Arrays.deepToString(arr));
        multiplyBYTwo(arr);
        System.out.println(Arrays.deepToString(arr));



//        System.out.println(Arrays.toString(arr[0]));  //this will return the part of array as it is in String form.
//        System.out.println(arr[0]); // jo array k index per 1 main rkha hai uska address return karega .
//
//        System.out.println(Arrays.toString(arr[1]));
//        System.out.println(arr[1]);
//
//        System.out.println(arr[0][0]); // 1
//        System.out.println(arr[0][1]); // 2
//        System.out.println(arr[1][0]); // 5
//        System.out.println(arr[1][1]); // 6


    }

    public static void multiplyBYTwo(int [][] array){

        for (int i = 0; i< array.length;i++){
            for (int j = 0; j<array[i].length;j++){
                array[i][j] = 2*array[i][j];
            }
        }
    }

}
