public class Finally {
    public static void main(String[] args) {
        System.exit(0);

        try{
            int a = 100/0;
            System.out.println("a = "+a);


        }
        catch(ArithmeticException e) {
            System.out.println("AE : so not possible");
        }
//        catch (Exception e){
//            System.out.println("Some other exception");
//
//        }
        finally {

            System.out.println("this is finally block !");
        }

//        finally block is the last block that executes in the end , whether excetion is handled or not finally will
//        be executed .
//        finally aik hi block houta hai jbke catch blocks aik se zyada bhi hosktay hain.
//        try k saath ager catch na ho tou finally zarur hona chahiay ager program crash bhi kr jaye tou bhi finally
//        block zarur execute hoga . siwaye aik case main k ager koi System.exit() function ko use kare.
    }
}
