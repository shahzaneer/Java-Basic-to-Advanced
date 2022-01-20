public class staticvar {
    public static void main(String[] args) {
//        static variable ko class var bhi kehtay hain aur yeh share houta hai puri class k saath
//        instance var har aik object k liay alag houta hai jbke static var aik class k liay aik hi houta hai
//        professional practice yehi hai k hum class k name se access kren static/class var ko werna ho tou obj k name k saath bhi hai lekin uska koi logic nhi bnta q k jitne marzi obj banalen value last walay ki hogi cause yeh static hai yai sakin hai
        Tst.marks = 100;
        Tst objw= new Tst();
        objw.marks = 200;

        System.out.println("Marks are :"+Tst.marks);
        System.out.println("Marks are :"+ objw.marks);

    }
}

class Tst{
    static int marks;
}