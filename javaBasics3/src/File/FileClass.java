package File;

import java.io.File;
import java.io.FileWriter; //FileWriter ko bhi import krna hai use krne k liay!
import java.io.IOException; //IOException ko bhi import krwana perta hai.
import java.util.Scanner;

public class FileClass {
    public static void main(String[] args) throws IOException {
//       ---------------------- how to create a file--------------------------
//        we have to import java.io.file to use file.
//        now file object should be created and exception should be handled as in some cases exception is raised.
//        File myFile = new File("E:\\file folder\\shahism.txt");
//        File myPyFile = new File("E:\\file folder\\shahism.py");
//        File myJavaFile = new File("E:\\file folder\\shahism.java");

//        path main path dena hai aur last main jo app file ka name aur extention rkhna chahtay hain wo dena hai.
        //har new file k liay aik object create rkan hoga!

//        try {
//            myFile.createNewFile();
//            myPyFile.createNewFile();
//            myJavaFile.createNewFile();
//        }
//        catch (IOException e){
////            IO-Exception is raised if the file is not created.
//            System.out.println("unfortunately file was not created Try Again!");
//
//        }



//  -----------------------------how to write a file----------------------------------------------
// file ko write krne k liay hamain aik file jo bnni hui hai usko use krna hoga.
//        FileWriter class ka object banana hoga.
//        try {
//            FileWriter writeTxt = new FileWriter("E:\\file folder\\shahism.txt");
//            writeTxt.write("Pakistan noor hai aur noor ko zawaaal nhi!! ~ Wasif Ali Wasif RA");
//            writeTxt.append("Pakistan qayim rehne k liay bana hai aur In shaa Allah ta qayamat qayim rahega! ");//it
//
//            // will append the text written above.
//
//            writeTxt.close(); //file writer ko close krna zaruri hai as its a good practice.
//
////            har baar jb kuch likhna hoga tou aik new fileWriter object banana hoga.
//            FileWriter writeJava = new FileWriter("E:\\file folder\\shahism.java");
//            writeJava.write("public class shahism{ public static void main(String [] args){ System.out.println(9); }}");
//            writeJava.close();
//        }
//        catch(IOException e){
//            System.out.println("Sorry it wasn't possible for us to write in the file ");
//        }


//---------------------------------------------how to read a file-------------------------------------
//        File myFile = new File("E:\\file folder\\shahism.txt");
//
//        try {
//            Scanner sc = new Scanner(myFile); //System.in ki jagah jo file read krni hai uska object dedia!
//
//            while (sc.hasNextLine()) {
//                String line = sc.nextLine();
//                System.out.println(line);
//            }
//            sc.close();
//        }
//
//        catch(IOException e){
//            System.out.println("It was not possible for us to read the file !");
//        }


// ----------------------how to delete a file -----------------------------------
        File myFile = new File("E:\\file folder\\shahism.java");
        if (myFile.delete()) System.out.println("The file has been deleted "+ myFile.getName());

        else System.out.println("Some error occurred!");


    }
}
