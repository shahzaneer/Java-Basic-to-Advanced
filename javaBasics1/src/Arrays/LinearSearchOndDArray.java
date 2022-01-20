package Arrays;

public class LinearSearchOndDArray {
    public static void main(String[] args) {
        int [] array = {1,2,3,5,7,8,9,6,7,1,2,3,4};
//        linear search --> A search in which we have to go through each element separately that is linear search!
//        yeh normal search hai jo hum usually apne logic main use krte hain.
//        it is best if we are supposed to search for a few elements but isse behtar search aik mojud hai jisse hum
//        binary search kehtay hain.

        System.out.println(linearSearch(120,array));


    }
    static int linearSearch(int key,int [] arr){
        for(int i = 0; i<arr.length;i++){
            if (arr[i]==key){
                return i; //return hotay hi loop exit krjata hai we don't need to add any break or System.exit type
                // statement here.
            }
        }

        return -1; //else returning -1 which means k koi index mojud hi nhi hai aisa jo hum search kar rhahay hain !
    }
}
