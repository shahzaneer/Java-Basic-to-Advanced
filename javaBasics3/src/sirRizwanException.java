public class sirRizwanException {
    public static void main(String[] args) {
        int [] a = new int[5];
//        System.out.println(a[5]);

        try{
            System.out.println(a[4]);
//            jahan jese hi exception throw hojayegi wahan se hi control transfer hojayega!

            System.out.println("Shahzaneer Ahmed ");
        }
        catch(Exception e){
            System.out.println("Error Array out of bound ");
        }
        finally {
            System.out.println("Shahzaneer Ahmed ");
        }
//        System.out.println("This is Shahzaneer ahmed ");
    }
}
