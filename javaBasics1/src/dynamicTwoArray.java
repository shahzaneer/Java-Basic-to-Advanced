import java.util.Scanner;
public class dynamicTwoArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter no. of rows :");
        int rows = obj.nextInt();
        System.out.println("Enter no. of columns :");
        int columns = obj.nextInt();

        int [] [] matrix = new int[rows][columns];

        System.out.println("Enter a "+rows+"X" + columns+" Matrix ");
        for(int i = 0; i<rows;i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] = obj.nextInt();
            }

        }
        System.out.println("You have Entered");

        for(int i = 0; i<rows; i++){
            for (int j = 0; j<columns;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
