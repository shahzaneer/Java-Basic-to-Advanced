public class FinalMethod {
    public static void main(String[] args) {
//        any final method cannot be override!
        Q1 obj1 = new Q1();
        Q2 obj2 = new Q2();
        Q3 obj3 = new Q3();

        obj1.disp();
        obj2.disp();
        obj3.disp();
    }
}

class Q1{
     void disp(){
//         make this method final anmd see the error!
        System.out.println("I'm method disp");
    }
}
class Q2 extends Q1{
    void disp(){
        System.out.println("This is Shahzaneer Ahmed");
    }
}
class Q3 extends Q1{
    void disp(){
        System.out.println("Qureshite from Adii Clan");
    }
}