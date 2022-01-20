public class ExceptionPropagation {
    public static void main(String[] args) {
    ExceptionPropagation obj = new ExceptionPropagation();
    obj.getData2();
    }
/// exception propagation main jis line of code main exception paida hogi handling wo method ki bajaye wo method
// karega jo usse call karega!


    void getData1(){
        int a = 100/0;
        System.out.println(a);
    }
    void getData2(){
        try {
            getData1();
        }
        catch (ArithmeticException e){
            System.out.println("AE found!");
            e.getMessage();
        }
    }
    void disp(){}
}

class abc extends Exception{
    public String getMessage(){
        return "This is overridden getMessage function";
    }
}
