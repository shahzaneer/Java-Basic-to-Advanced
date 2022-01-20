public class AbstractClass {
    public static void main(String[] args) {
//        father class jo yahan mahsud hain unka object create nhi hoskta

        Fatima obj = new Fatima();
        obj.disp();
    }
}


abstract class Mahsud{
//    abstract class
    abstract void disp(); //abstract method jisko define nhi krte

    abstract void shah();

}
class Fatima extends Mahsud{
    void disp(){
        System.out.println("Abstract method defined in sub class");

    }

    void shah() {
        System.out.println("SHAH");
    }
}