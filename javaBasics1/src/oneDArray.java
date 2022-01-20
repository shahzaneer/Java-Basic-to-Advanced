public class oneDArray {
    public static void main(String[] args) {
//        int num [];  //initialization
//        num = new int[5];    //memory allocation
        int num [] = new int [5];  // initialization + memory allocation in a single step
        num[0] = 11;  //assigning values to variables
        num[1] = 22;
        num[2] = 33;
        num[3] = 44;
        num[4] = 55;

        int [] num1 = {1,2,3,4,5,6};   //array main curly braces use hotay hain java main

        System.out.println(num1[1]);


        System.out.println(num);
        //khali num print krne se inki memory location print hogi yani inka address print hoga
        for (int i= 0; i< num.length;i++) {
            System.out.println(num[i]);
        }



    }
}
