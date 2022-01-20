//import java.util.Scanner;
public class MultipleTryCatch1 {
    public static void main(String[] args) {
//        Scanner obj = new Scanner(System.in);

//        try catch block main aik waqt main aik hi exception throw hogi aur aik hi catch block execute hoga!

        try{
            int a = 100/2;
            System.out.println("a = "+a);

            int arr[] = new int[5];
            arr[4] = 8;
            System.out.println("The arr[4] is  "+arr[4]);

//            String s = "Shahzaneer";
            String s = null;
//            point to ponder --> null =! "" as ""'s length is 0 but null's length doesn't exists
            System.out.println(s.length());
        }
//        we have to mention catch block with the approach of most specific to general
        catch(ArithmeticException e){
            System.out.println("AE : so not possible");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("outOfbond : so not possible");

        }
        catch (NullPointerException e){
            System.out.println("NUll pointer Exception ");
        }
        catch (Exception e){
            System.out.println("Some other exception");

        }


    }
}
