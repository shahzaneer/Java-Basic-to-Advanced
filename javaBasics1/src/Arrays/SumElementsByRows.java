package Arrays;

public class SumElementsByRows {
    public static void main(String[] args) {
        int [][] array2D = {{1,2,3}          //1+2+3 = 6
                           ,{4,5,6},         //4+5+6 = 15
                            {1,0,1}};        //1+0+1 = 2
        int sumR1=0,sumR2=0,sumR3=0;

        for(int i = 0; i<array2D.length;i++){
            for(int j = 0; j<array2D[0].length;j++){
                if (i==0) sumR1+=array2D[i][j];
                if (i==1) sumR2+=array2D[i][j];
                if (i==2) sumR3+=array2D[i][j];

            }
        }

        System.out.println("The sum of first row is "+sumR1);
        System.out.println("The sum of second row is "+sumR2);
        System.out.println("The sum of third row  is "+sumR3);

        if (sumR1>sumR2 && sumR1>sumR3) System.out.println("The row with the highest sum is row 1 with sum "+sumR1);
        else if (sumR2>sumR1 && sumR2>sumR3) System.out.println("The row with the highest sum is row 2 with sum "+sumR2);
        else if (sumR3>sumR1 && sumR3>sumR2) System.out.println("The row with the highest sum is row 3 with sum "+sumR3);
    }
}
