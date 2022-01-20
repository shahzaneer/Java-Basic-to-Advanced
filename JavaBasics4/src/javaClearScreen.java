import java.util.*;
public class javaClearScreen {
    public static void main(String[] args) {
        System.out.println("Hello This is ");
        System.out.println("Hello This is SHAHZANEER AHMED ");
        System.out.println("Hello This is  DEEPAK KUMAR KHATRI");
        System.out.println("Hello This is RAMEEZ KASHIF");
//        System.out.println("\\033[H\\033[2J");
//        System.out.flush();

//        System.out.print("\033[H\033[2J");
//        System.out.flush();

        clearScreen();
        System.out.println("Hello This is HARIS RIAZ");
//        clearConsole();

//        System.out.flush();



    }

    public static void clearConsole() {
        try {
            final String os = System.getProperty("OS.name");

            if (os.contains("Windows"))  Runtime.getRuntime().exec("cls");
            else Runtime.getRuntime().exec("clear");

        }
        catch (final Exception e)
        {
            e.printStackTrace();
        }
    }
    //....................Clear screen method ..............
    public static void clearScreen(){
        //Clears Screen in java
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}

//
//}
