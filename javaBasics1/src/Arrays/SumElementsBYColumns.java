package Arrays;

public class SumElementsBYColumns {
    public static void main(String[] args) {
        int [][] array2D = {{1,2,3}          //1+4+1 = 6
                           ,{4,5,6},         //2+5+0 = 7
                            {1,0,1}};        //3+6+1 = 10
        int sumC1=0,sumC2=0,sumC3=0;

        for(int i = 0; i<array2D.length;i++){
            for(int j = 0; j<array2D[i].length;j++){
                if (j==0) sumC1+=array2D[i][j];
                if (j==1) sumC2+=array2D[i][j];
                if (j==2) sumC3+=array2D[i][j];

                }
            }

        System.out.println("The sum of first column is "+sumC1);
        System.out.println("The sum of second column is "+sumC2);
        System.out.println("The sum of third column is "+sumC3);
        }
    }

