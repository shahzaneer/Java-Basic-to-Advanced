public class DefineInterface {
    public static void main(String[] args) {
//        trying to make an object of IFather , it will throw error
//        IFather obj = new IFather();

    }
}

interface IFather{
//    interface main public static final variables houtay hain aur abstract methods hotay hain interfaces ka object
//    nhi bnta , inko use krne k liay kisi class main inhe implement kia jata hai

    public static final int num1 = 100;
    int num2 = 101;
//    num1 aur num2 ki description aik hi cheez hai q k by default var public static final hotay hain

    void disp();

    abstract void  display();
//    dono methods hi abstract hain , mention krna zaruri nhi

//    inko use krne k liay kisi class main interface ko implement krna houta hai..
}