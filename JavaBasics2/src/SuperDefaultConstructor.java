public class SuperDefaultConstructor {
    public static void main(String[] args) {
        SonB obj = new SonB();

    }
}

class FatherB{
    FatherB(){
        int a = 100;
        System.out.println("Constructor of father class "+a);
    }
}

//obj banaanay per dono classes k construtor call horhay hain iska yeh mtlb nhi hai k constructor inherit hogya ,
// construtor kbhi inherit nhi houta . yahan by default super(); use houta hai jo first statement houti hai subclass
// constructor ki aur yehi Father class constructor ko initiate krwati hai .
//yaad dhayani k tor per super(); likh dia gya hai jo wese hai tou optional.

class SonB extends FatherB{
    SonB(){
        super(); // optional as yeh by-default mojud houta hai.
        int b = 20;
        System.out.println("Constructor of son class "+b);
    }
}
