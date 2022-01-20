package Arrays;

import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(binarySearch(array,2));
        System.out.println(binarySearch(array,10));
        System.out.println(binarySearch(array,12));
//        Binary search --> firstly jo array use horhi hoti hai usse ascending order main sort hua hona chahiay .
//        then middle element find houta hai ager key bari hai middle se tou right side walay elements maon find hoga
//        element werna left walay main aur hoga kese dubara se middle element find kia jayega until hum required
//        answer tk na pohanch jayen.

//        why binary search?
//        we know an easy algorithm of linear search but it isn't efficient (time complexity).
//        Binary search is more efficient than linear search;
//        it has a time complexity of O(log n).
//       The list of data must be in a sorted order for it to work.

//        we also have a built in method to implement this logic
        System.out.println(Arrays.binarySearch(array,2));

    }
    static int binarySearch(int [] arr,int key){
        int high = arr.length-1; // intial index of highest value in array
        int low = 0;           // intial index of lowest value in array
        while(high>=low){
            int mid = (high+low)/2;
            if (key==arr[mid]) return mid;
            //ager key aur array@mid match hojayen tou return krdo mid ko jo index hai
                // hamari key ka
            else if (key < arr[mid]) high = mid-1;
            //ger key initially choti ho tou high ko mid ae aik kam krdo
//            else if (key > arr[mid]) low = mid+1;   //ger key bari ho tou low main aik mid aur 1 add krdo
            else  low = mid+1;
//            ab dubara lia jayega mid aur baar baar
//            check kia jayega.
        }

        return (-1-low);
//        it will return the -insertionPoint -1;
//        minus sign represents that the element doesn't exists in the array while the number represents its index-1
//        where it maybe inserted .
    }
}
