//priority determine krti hai k konsa thread pehle execute karega priority 1 se 10 k darmiyaan hoti hai aur 10
// highest 5 normal aur 1 lowest priority hai.


public class getSetPriorityThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority()); //main thread ki priority return karega. by default
        // 5 hoti hai
        priority pt = new priority();
        pt.setPriority(6);
        pt.start();
        System.out.println(pt.getPriority());

    }
}

class priority extends Thread{
    public void run(){

    }
}
