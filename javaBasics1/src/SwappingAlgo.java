public class SwappingAlgo {
    public static void main(String[] args) {
        int a =10, b = 5;
//        before swapping
        System.out.println("a is : "+a);
        System.out.println("b is : "+b);

//        swapping logic
        int temp;
//        temp main a ko pehlay safe krna!

//        temp = a;
//        a = b;
//        b = temp;

//       temp main b ko pehlay safe krna!

        temp = b;
        b = a;
        a = temp;

//        point to ponder over --> z sequence ko yaad rkhtay huay dono main se koi bhi initially temp main deskte
//        hain swapping hojayegi !

//        after swapping
        System.out.println("a is : "+a);
        System.out.println("b is : "+b);
    }
    }

