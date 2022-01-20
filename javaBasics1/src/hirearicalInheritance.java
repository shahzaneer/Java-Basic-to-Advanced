//Hirearical Inheritance --> ismain aik father k aik se zyada child classes hotay hain jo aik hierarchy banatay hain .


public class hirearicalInheritance {
    public static void main(String[] args) {
        Son01 obj = new Son01();
        Daughter01 obje = new Daughter01();

        System.out.println(obj.a); //in the beginning a aur b dono hi zero hain.
        System.out.println(obj.b);

        obj.dataInfo(10,20);
        obj.disp(); //by using son class obj
        obje.dataInfo(10,20);
        obje.disp(); // by using daughter class obj

    }
}

class Father01{
    int a,b;   //instance variables of Father class
    void dataInfo(int x ,int y){
         a = x;
         b = y;
    }
}

class Son01 extends Father01{
    int sum(){
         return a+b;

    }
    void disp(){
        System.out.println("A is :"+a);
        System.out.println("B is :"+b);
        System.out.println("SUM is :"+ sum());
    }
}

class Daughter01 extends Father01 {
    int mul() {
        return a * b;

//        redundant use of c variable
    }

    void disp() {
        System.out.println("A is :" + a);
        System.out.println("B is :" + b);
        System.out.println("Multiplication is :" + mul());
    }
}
