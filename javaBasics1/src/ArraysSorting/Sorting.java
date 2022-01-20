package ArraysSorting;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int [] array = {4,5,6,1,2,200,3,9,0};//   un-sorted array
        System.out.println(Arrays.toString(SortedArray(array)));


    }

    static int [] SortedArray(int [] array){
        int temp;
        for (int i = 0; i<array.length;i++){
            for (int j = i+1; j<array.length;j++){

                if (array[i]>array[j]){
//
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;

                }
            }
        }
        return array;
    }

}

