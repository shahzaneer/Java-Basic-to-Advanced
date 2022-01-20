public class Break {
//    unlabelled break --> inner loop ko break krta hai outer chalta rehta hai .
//    labelled loop main yeh houta hai k outer k saath saath inner loop bhi ruk jata hai
public static void main(String[] args) {

    //unlabelled break.
    System.out.println("Unlabelled break");
    for (int i = 0; i<5;i++){
        for (int j = 0;j<5;j++){
            if(i==3){
                break;
            }
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println("labelled break");
    shah: //is trh pehle label dena hai .
    for (int i = 0; i<5;i++) {
        for (int j = 0; j < 5; j++) {
            if (i == 3) {
                break shah;
            }
            System.out.print("* ");
        }
        System.out.println();
    }
}
}
