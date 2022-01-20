//    constructor overloading -
//    aik se zyada constructor bhi bn skte hain lekin lekin unme hamain farq krna houta hai yani types of parameters ya no of parameters ki bunyad per farq paida krna hoga

public class ConstructorOverloadi {
    public static void main(String[] args) {
        T o = new T();
        T ob = new T(9);
        T obj = new T(9,10);
        T obje = new T(9 , 2.3f);
        T objec = new T(2.3f , 5);


    }
}
class T{
    int x,y,z,n,m;
    float f;

    T(){
        System.out.println("This is a default constructor ! ");


    }
    T(int a){
        System.out.println("This is a para const. with one int ");
        x = a;
        System.out.println(a);

    }
    T(int a , int b){
        System.out.println(" This is a para const. with two int ");
        x =a;
        y = b;
        System.out.println(a +" "+ b);

    }
    T(float a , int b){
        System.out.println("This is a para const. with one int and one float ");
        f = a;
        n = b;
        System.out.println(f +" "+ n);


    }
    T(int b ,float a ){
        System.out.println("This is a para const. with one int and one float  with changed sequence ");
        f = a;
        y= b;
        System.out.println(f+" "+ y);

    }

}