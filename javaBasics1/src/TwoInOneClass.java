public class TwoInOneClass {
    public static void main(String[] args) {
        JHG obj = new JHG();
        obj.deep();
        obj.deeper();

    }
}

interface ABCD{
    int a = 10;
    void deep();
}
interface  XYZ{
    int b = 20;
    void deeper();
}
//interface var ko access without the name of interface bhi kia jaskta hai lekin ager aik hi variable name do alag
// interfaces main dya gya ho tou usko differentiate krne k liay we use interface's name takay compiler confuse ho
// kar error throw na karay !

class JHG implements ABCD ,XYZ{
    public void deep(){
        System.out.println("Im deep function !");
    }
    public void deeper(){
        System.out.println("Im deeper function !");
        System.out.println("The ABCD a was :"+ABCD.a);
        System.out.println("The XYZ b was :"+XYZ.b);
    }
}