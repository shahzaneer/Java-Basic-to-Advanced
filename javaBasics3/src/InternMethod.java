public class InternMethod {
    public static void main(String[] args) {
        String abc = new String("Shahzaneer Ahmed");
        String bcd = abc.intern();
//        intern method will change the reference to SPC object instead of heap object
        System.out.println(abc == bcd); //it will check the if the objects are equals or not?
    }
}
