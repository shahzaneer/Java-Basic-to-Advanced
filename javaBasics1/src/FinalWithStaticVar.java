public class FinalWithStaticVar {
    public static void main(String[] args) {
//        static hai tou hum isse class k name se access krskte hain
        System.out.println(ABC.roll_number);
        //ABC.roll_number = 22; //cannot be changed error

    }
}

class ABC{
    //static final int roll_number = 87; //normal way
//    lekin ager srff declare kren tou masla hoga
    static final int roll_number;
  //  roll_number = 87;  //not possible

//    isko static block main likhaingay/declare karengay
    static {
        roll_number = 87;
}

}