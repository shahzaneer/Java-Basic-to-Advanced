package ArraysSorting;

import java.util.Arrays;

public class selectionSort2 {
    public static void main(String[] args) {
        int [] arr = {1,5,7,8,0,6};
        insertionSort(arr);

        System.out.println(Arrays.toString(arr));

    }
    public static void insertionSort(int [] array){
     for(int i = 0; i<array.length;i++){
         int currentMinValue = array[i];
         int currentMinIndex = i;
         for(int j = i+1;j<array.length;j++){
             if(array[currentMinIndex]>array[j]){
                 int temp = array[j];
                 array[j] = array[i];
                 array[i] = temp;
             }
         }
     }
    }
}
