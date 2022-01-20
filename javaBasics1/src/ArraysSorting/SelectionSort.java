package ArraysSorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
   int [] array = {4,5,6,1,2,3,9,0};//   un-sorted array
        System.out.println(Arrays.toString(selectionSort(array)));
//        Selection sort main hum first index per mojud element ko smallest consider krletay hain aur phir baaki
//        elements se compare krte rehtay hain jahan first element se chota koi element mil jaye swap krletay hain
//        yeh hm tamaam elements k liay krte hain yahan tk k hamaray pas aik element reh jata hai!


    }
    static int [] selectionSort(int [] array){

        for(int i = 0; i<array.length; i++){

            int currentMinValue = array[i];
            int currentMinIndex = i;

            for (int j = i+1; j<array.length; j++){
                if (array[currentMinIndex]>array[j]){
                    currentMinValue = array[j];
                    currentMinIndex = j;
                }
                }
            if (currentMinIndex!=i){
             array[currentMinIndex] = array[i];
             array[i] = currentMinValue;

            }
        }
         return array;
    }

}
