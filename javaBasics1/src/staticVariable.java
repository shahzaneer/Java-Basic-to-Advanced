public class staticVariable {
    int a = 10; //instance variable
    static int  b = 20; //static variable

//    static aur instance srff class main likhay jatay hain!


    public static void main(String[] args) {
//      static method local aur static data members ko hi use kr skta hai instance method ko approach nhi kia jaskta hai
        int c = 200;
        System.out.println("static "+b);
        System.out.println("local  "+c);
//        System.out.println("instance"+a);
//        java: non-static variable a cannot be referenced from a static context
    }
}
