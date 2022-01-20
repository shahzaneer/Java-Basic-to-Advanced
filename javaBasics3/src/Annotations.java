//annotations extra information deti hain programs k baray main k next line main kia hona chahiay. yeh aik optional
// but bht hi useful cheez hai.
public class Annotations {
    public static void main(String[] args) {
        ABC a = new ABC();
        a.college(); // yeh college ABC wala hi hoga.
        ABCD ab = new ABCD();
        ab.college(); // Shah wala

    }
}

class ABC {
    public void college(){
        System.out.println("This is ABC's College ");
    }
}

class ABCD extends ABC {
    @Override //yeh hamain paband banata hai k next line main hmain kisi function ko override krna hi krna hai nhi
    // karengay tou error dega. is trhh ager hun se koi ghalti horhi ho tou debugging main asaani hojati hai.

    public void college(){
        System.out.println("This is Shahzaneer Ahmed!");
    }

}

@FunctionalInterface
//yeh dekhay ga k aik aisa interface ho jismay aik hi function ho. aik se zyada function hongay tou error show karega
interface abcc{
    void abc();
//    void shah(); //dusra function bananay per eoor throw hojayega!
}
