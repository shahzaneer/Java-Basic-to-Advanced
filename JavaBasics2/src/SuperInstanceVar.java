public class SuperInstanceVar {
    public static void main(String[] args) {
    Son obj = new Son();
    obj.disp();
    }
}

class Father{
    int a = 100;

//    when we simply try to print it the a of father class is hidden and the a of son class is shown but if we want
//    to use  the father class instance variable we use the keyword "super";
}
class Son extends Father{
    int a = 200;
    void disp(){
        System.out.println("the value of a is :"+a); // subclass a
        System.out.println("the value of a is :"+super.a); //superclass a
    }
}
