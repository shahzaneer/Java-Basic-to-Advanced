public class SuperParameterizedConstructor {
    public static void main(String[] args) {
        SonC obj = new SonC();


    }
}

class FatherC{
    FatherC(int x){
        int a = 10;
        System.out.println("This is parameterize father constructor :"+a);
        System.out.println(x);
    }

//  parameterized constructor is not optional ! yeh ager istemaal kia jaye tou super(parameter); likhna zaruri houta
//  hai ! sublass main jahan isko as a first statement likhte hain wo constructor default bhi hoskta hai aur
//  parameterized bhi hoskta hai.

}
class SonC extends FatherC{
    SonC(){
    super(1);
    int f = 10;
        System.out.println("This is constructor of subclass ! "+f);
    }

}
