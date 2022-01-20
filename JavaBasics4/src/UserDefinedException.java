import java.util.Scanner;
public class UserDefinedException {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter positive Numbers ");
        while(true){
            int num = obj.nextInt();

            if(num<0) try {
                throw new ExceptionShah(); //is se programmer explicit exception throw krta hai

            }
            catch (ExceptionShah exceptionShah) {
                exceptionShah.printStackTrace(); //is exception ko handle krne ka code likhna zaruri hai jo yahan
                // likha gya hai
                break;

            }
        }
    }
}
//in order to make user defined exception we have to extend the Exception class

class ExceptionShah extends Exception{
    @Override //we have to override the method public String toString() and return our own exception Statement
    public String toString(){
        return "You have input negative number! ";
    }
}