public class throwException {
    public static void main(String[] args) {
//        throw keyword is used to throw user defined exceptions..
        try {
            throw new ArithmeticException("This is Arithmetic Exception thrown by Shahzaneer Ahmed ");
        }
        catch (ArithmeticException saa){
            System.out.println("catched the exception thrown by shahzaneer ahmed ");
        }
    }
}
