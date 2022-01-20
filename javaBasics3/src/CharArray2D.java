import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class CharArray2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char [][] Characters = new char[3][4];
        char [] dynamites = new char[5];

//        for (int i = 0; i<5; i++){
//            System.out.println("Enter char at index "+(i+1));
//            dynamites[i] = input.next().charAt(0); //method to take input from user as a character  :-)
//        }
//        for (char e : dynamites){
//            System.out.println(e);
//        }

        for (int i = 0; i<3;i++){
            for (int j = 0; j<4;j++){
                System.out.println("Enter character at "+i+j);
                Characters[i][j] = input.next().charAt(0); //2D array of characters !
            }
        }

        for(int i = 0; i<3;i++){
            for(int j = 0; j<4; j++){
                System.out.print(Characters[i][j]+" ");
            }
            System.out.println();
        }

    }
}
