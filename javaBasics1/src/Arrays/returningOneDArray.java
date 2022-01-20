package Arrays;

public class returningOneDArray {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6};
        System.out.println(reverse(arr1)[1]); //it will call the reverseMethod and then print the value at 1 index
        // that is 5.


        for (int i :reverse(arr1)){
//            calling main argument bhi reference variable dena hai bs.
            System.out.println(i);
        }

    }

    public static int [] reverse(int [] array){
//        data type array wali hi deni hai without any reference variable jo name dia hai wo method ka name hai na k
//        array ka apna.
        int [] reversedArray = new int [array.length];
     for (int i = 0,j = array.length-1; i<array.length; i++,j--){

//         we can iterate two variables in a single loop for common purpose.
//            (int i = 0,j = array.length-1; i<array.length,j<=0; i++,j--)
//            the loop working in my mind is the given above one but it isn't the proper syntax we can give only one
//            terminating condition in for loop here till when i<array.length j will be automatically restricted to
//            j>=0. so our work will be done by this.

         reversedArray[i] = array[j];
     }

     return reversedArray;
//     return krwatay huay reference variable dena hai bs.
    }
}
