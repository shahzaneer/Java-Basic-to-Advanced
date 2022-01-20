public class OverloadingRun {
    public static void main(String[] args) {
        MyTread02 th = new MyTread02();


        th.start(); // yeh run() ko initiate karega yani wo run jismay koi argument nahi hoga!
        //th.run(9); //yeh as a normal method call huay hain
        //th.run("Salahuddin Ayubi RA"); // yeh as a normal method call huay hain

        for (int i = 0 ; i<5;i++)
        System.out.println("Main thread :");
    }
}

class MyTread02 extends Thread{
    public void run(){
        System.out.println("Run with no arguments !");
    }
    public void run(int i){
        System.out.println("Run with integer argument "+i);
    }
    public void run(String i){
        System.out.println("Run with String argument "+i);
    }
}
