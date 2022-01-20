public class Continue {
//    unlabelled -- > inner loop ko skip krta hai outer ko nhi krta.
//    labelled -- > yeh inner aur outer dono ko skip krdeta hai.

    public static void main(String[] args) {
        System.out.println("Unlabelled Continue");
        for (int i = 0; i<5;i++){
            for (int j = 0; j<5;j++){
                if (i==3){
                    continue;
//                    srff inner loop ko skip kia..
                }
                System.out.print("* ");

            }
            System.out.println();

        }

        System.out.println("labelled Continue");
        shah:
        for (int i = 0; i<5;i++){
            for (int j = 0; j<5;j++){
                if (i==3){
                    continue shah;
//                    jb i ==3 hua tou inner k saath saath outer loop bhi skip hogya aur koi new line bhi print nhi hui..

                }
                System.out.print("* ");

            }
            System.out.println();

        }










    }
}
