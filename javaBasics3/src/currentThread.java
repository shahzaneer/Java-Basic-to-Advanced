public class currentThread {
    public static void main(String[] args) {
        currentThread1 cT = new currentThread1();
        cT.start();

        System.out.println(Thread.currentThread()); //Thread[main,5,main]
//        firstly show krta hai k thread ka name kia hai , secondly uski priority aur third per uska group.
    }
}

class currentThread1 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread()); //Thread[Thread-0,5,main]

    }
}
