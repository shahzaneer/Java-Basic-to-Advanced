package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class raggedArray {
    public static void main(String[] args) {
// ragged array is an irregular array in which each row has different columns.
        int [][] raggedArray = new int[5][];
//        note that it didn't throw an error. but we have to now specify the length of columns in each row.
        raggedArray[0] = new int [5]; //pehli row main 5 columns
        raggedArray[1] = new int [4]; //dusri row main 4 columns
        raggedArray[2] = new int[3];  //teesri main 3
        raggedArray[3] = new int[2]; //4th main 2
        raggedArray[4] = new int[1]; //5th main mehiz aik

        System.out.println(Arrays.deepToString(raggedArray)); //deepTOString replacing toString method for ragged
        // arrays

//        how to loop through them!
        for (int i = 0; i<raggedArray.length;i++){
            for (int j = 0; j<raggedArray[i].length;j++){
                System.out.print(raggedArray[i][j]+" ");
            }
            System.out.println();
        }

//        now getting the ragged arrays' elements from the keyboard (input from user)
        int [][] harisRiaz = new int[5][];
        harisRiaz[0] = new int [5];
        harisRiaz[1] = new int [4];
        harisRiaz[2] = new int [3];
        harisRiaz[3] = new int [2];
        harisRiaz[4] = new int [1];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter elements of ragged array :");
        for(int i = 0; i<harisRiaz.length;i++){
            for(int j =0; j<harisRiaz[i].length;j++){
                System.out.printf("Enter element for row %d and column %d ",i,j);
                harisRiaz[i][j] = input.nextInt();
            }
        }

        for(int i = 0; i<harisRiaz.length;i++){
            for(int j =0; j<harisRiaz[i].length;j++){
                System.out.print(harisRiaz[i][j]+" ");
            }
            System.out.println();
        }

    }
}
