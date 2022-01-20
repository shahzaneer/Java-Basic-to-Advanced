//naming thread --> implementing Runnable interface in java

public class NamingThread {
    public static void main(String[] args) {
        MythreadA myt = new MythreadA();
        Thread t = new Thread(myt,"Shahzaneer"); //naming thread

        t.start();

        for (int i = 0; i<5; i++){
            System.out.println("main thread ");
        }
    }
}

class MythreadA implements Runnable{
    public void run(){
        for (int i = 0; i<5; i++)
      System.out.println(Thread.currentThread().getName());
    }
//    MythreadA(String a){
//        super();
//    }

}
