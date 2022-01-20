//multiThreading k liay aik way by extending Thread class hai.

public class MyThread{
    public static void main(String[] args) {
        FirstThread ft = new FirstThread();
        FirstThread01 ft1 = new FirstThread01();
        ft.start();
        ft1.start();

        for (int i = 0; i<5; i++){
            System.out.println("Shahzaneer Ahmed : main thread");
        }

    }
}

class FirstThread extends Thread{
//    public void run() method Thread class main hai yahan hum isse override kr rhay hain.
    public void run(){
        for(int i = 0; i<5; i++){
            System.out.println("GCU'20 | CUI'24 : child thread 1");
        }
    }
}

class FirstThread01 extends Thread{
    //    public void run() method Thread class main hai yahan hum isse override kr rhay hain.
    public void run(){
        for(int i = 0; i<5; i++){
            System.out.println("GDSC'23 | MLSA'22 : child thread 2 ");
        }
    }
}