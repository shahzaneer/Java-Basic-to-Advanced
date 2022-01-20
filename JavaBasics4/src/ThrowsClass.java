public class ThrowsClass {
    public static void main(String[] args) {
        try{
            divide(2,0);
        }
        catch(ArithmeticException e){
            System.out.println("Zero se divide krna hamaqat hai !");
            e.printStackTrace();
        }
    }

    public static int divide(int a , int b) throws ArithmeticException{
//        method jo exception throw kr skta hai usse throws keyword k baad likhna hai
//        is trhh yahan isse arguments diay jayengay wahan exception ko handle kia jasakay ga!
//        throws keyword  optional hai q k wese bhi exception propagation k mutabiq function jahan call houta hai
//        exception wahan hi handle ki jaati hai.


//  compile time errors ko check krne k liay krte hain hum yeh throws use
//        we can also handle multiple exceptions by the use of a comma in between them.

        int division = a/b;
        return division;

    }
}
