public class ParentToChildExceptionHandling {
    public static void main(String[] args) {
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
//        catch (ArrayIndexOutOfBoundsException  | NullPointerException | Exception e){
//            System.out.println("not possible");
//
//        }

        catch (Exception e){
            System.out.println("Some other exception");

        }


    }
}
