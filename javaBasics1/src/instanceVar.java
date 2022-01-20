public class instanceVar {
    public static void main(String[] args) {
        Test obj = new Test();

        obj.j = 200;

        System.out.println("ROLL NO "+ obj.i);
        System.out.println("MARKS "+ obj.j);





    }
}
class Test{
    int i = 10;  //instance variable classes k ander banaye janay walay variables hotay hain! aur object se cal houtay hain
    int j;
}
