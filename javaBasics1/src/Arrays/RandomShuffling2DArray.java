package Arrays;

public class RandomShuffling2DArray {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        randomShuffling(arr); // as we have called this method so the array is now shuffled.

        for (int i = 0; i<arr.length;i++){
            for (int j = 0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
    static void randomShuffling(int [][] arr){

        for (int i = 0;i< arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                int  i1 =(int) (Math.random() * i);
                int j1 = (int) (Math.random() * j);

//                swapping logic
                int temp = arr[i][j];
                arr[i][j] = arr[i1][j1];
                arr[i1][j1] = temp;


            }
        }
    }

}
