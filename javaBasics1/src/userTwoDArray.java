import java.util.Scanner;
public class userTwoDArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
//        System.out.println("Enter a 3X3 Matrix :");
        System.out.println("Enter the no of rows of matrix :");
        int rows = obj.nextInt();
        System.out.println("Enter the no of columns of matrix :");
        int columns = obj.nextInt();

//        int [][] matrix = new int[3][3];
        int [][] matrix = new int[rows][columns];
//        int row = matrix.length;
//        int columns = matrix[0].length;

        System.out.println("Rows = "+rows+ " Columns = "+columns);

//        declaration of a two 2D array

        for (int i = 0; i<rows;i++){
//            first loop controls the rows (3)
            for(int j=0; j<columns;j++){
//                second loop controls the columns (3)
                System.out.println("Enter element at i = "+i+" j = "+j); //just to specify the place where we are adding numbers
                matrix[i][j] = obj.nextInt(); //getting user input in our array
            }
        }

        System.out.println("You have Entered :");

        for(int i = 0; i<rows; i++){
//            for printing of rows
            for (int j = 0; j<columns;j++){
//                for printing of Columns
                System.out.print(matrix[i][j]+" ");
//                column's formatting
            }
            System.out.println("");
//            this will add a new line after each row



        }
    }
}
