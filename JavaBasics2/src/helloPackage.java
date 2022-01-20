import javaPackageTutorial.Package1; //have imported a class from another package in this package!
// ager pkg import nhi krna tou pura reference dekar bhi use krskte hain but in a single directory! see #$
//import java.lang.Package;

public class helloPackage {
    public static void main(String[] args) {
    Package1 obj = new Package1();
//    javaPackageTutorial.Package1 obj = new javaPackageTutorial.Package1();  //#$
    obj.disp();

    }
}
