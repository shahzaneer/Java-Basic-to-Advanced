public class multipleInheritance {
    public static void main(String[] args) {


//        multiple inheritance ko implement krne k liay hamain aik class aur aik interface ko as a parent use krna
//        hoga two classes wali multiple inheritance nhi  hai java main!

//        it was the main thing for which interface was used!
        Sonjee obj = new Sonjee();
        obj.disp();

    }
}

class Fatherjee{
    int a = 10;
    int add(int x){
        int b = x;
        return b;
    }
}

interface Motherjee{
    int c = 20;  //public static final

   void  disp();  // yeh public hota hai abstract k saath saaath
}

class Sonjee extends Fatherjee implements Motherjee{
    int multiplication = a * Motherjee.c;
    int d = add(Motherjee.c);
    int sum = d+a;

    public void disp(){
        System.out.println("The sum is :"+sum);
        System.out.println("The Multiplication is :"+multiplication);

    }
}