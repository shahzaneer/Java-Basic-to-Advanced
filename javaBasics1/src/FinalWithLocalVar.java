public class FinalWithLocalVar {
    public static void main(String[] args) {
        OA obj = new OA();
        obj.shahzaneer();
        OB obje = new OB();
        obje.sh(9);

    }
}
class OA{
    void shahzaneer(){
        final int a;
        a = 101;
        System.out.println(a);
    }

}
class OB{
    void sh(final int a){
//        a = 10;  //final add hogyi.
        System.out.println(a);
    }
}

