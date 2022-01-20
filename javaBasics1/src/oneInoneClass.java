public class oneInoneClass {
    public static void main(String[] args) {
    Alpha obj = new Alpha();
    obj.disp();
    }
}

interface GDG{
   int a = 21;
   int c = 22;
   void disp();
//   methods of interface are public and abstract by default!


}
//ager koi bhi interface ka method class main undefine ho tou error throw hojayega abstract bananay oer hi remove hoga!
class Alpha implements GDG{
    int b = 20;
    public void disp(){
        int sum = a+b+c;
        System.out.println("This is the disp function implement in class Alpha :"+sum);
        System.out.println("a and c were "+GDG.a +" "+ GDG.c);
    }

}
