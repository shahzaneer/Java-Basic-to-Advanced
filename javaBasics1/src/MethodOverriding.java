//method overriding -- > yeh mehiz inheritance k case main possible hai .
// aik parent class ka method jisko aik ya aik se zaid sub classes main inherit kia jaye aur unka name same ho lekin
// definition change krdi jaye tou yeh amal e khas method overriding kehlayega!!

public class MethodOverriding {
    public static void main(String[] args) {
        Fatherx F = new Fatherx();
        Sonx S = new Sonx();
        Daugtherx D = new Daugtherx();

//        jis class k object ko use karengay uski hudood main likhay gya disp evaluate hoga .

        F.disp();
        S.disp();
        D.disp();

    }
}

class Fatherx{
    int a = 20;
    void disp(){
//        method overriding name is same definition is different
        System.out.println("Father class' method");
    }
}

class Sonx extends Fatherx{
    int b = 30;
    void disp(){
        int c = a+b;
        System.out.println("Son class Method");
        System.out.println("THe sum is :"+c);

    }
}

class Daugtherx extends Fatherx{
    int b = 30;
    void disp(){
        int c = a*b;
        System.out.println("Daughter class Method ");
        System.out.println("The mutiplication is :"+c);
    }
}
