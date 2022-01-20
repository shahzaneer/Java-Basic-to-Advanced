public class SuperInstanceMethod {
    public static void main(String[] args) {
     SonA obj = new SonA();
     obj.disp();
    }
}

class FatherA{
    int a = 100;
    void put(){
        System.out.println("Varun chakrawarthy to Babar Azam 6 runs!");
    }
}
class SonA extends FatherA{
    void put(){
        System.out.println("M Shami to M Rizwan 6 runs!");
    }
    void disp(){
        put();
        super.put(); // it will call the hidden superclass method that was overridden by sub class.
    }

}
