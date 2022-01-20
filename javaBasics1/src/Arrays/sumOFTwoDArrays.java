package Arrays;

public class sumOFTwoDArrays {
    public static void main(String[] args) {
    int [][] arr = {{1,2,3,4},{5,6,7,8}};

    int total = 0;
    for (int i = 0; i<arr.length;i++){
        for (int j = 0; j<arr[0].length;j++){
            total+=arr[i][j];
        }
    }

        System.out.println("The sum of 2D array is "+total);
    }
}
