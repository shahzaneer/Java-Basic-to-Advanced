
//naming threads --> extending the thread class

class sThread extends Thread{
    public void run(){
//        for (int i = 1; i<6;i++)
            System.out.println(Thread.currentThread().getName());
    }
    //    constructor for giving name.
    sThread(String s){
        super(s);
    }
}

public class NamingThreadExtendingThread {
    public static void main(String[] args) {
    sThread sT = new sThread("hunia "); //yahan jo value di jati hai wo is class k constructor ko jati hai. tou
        // string s main hunia value gyi hai hmaray thread ka name hunia hai.

        sT.start();

//        for(int i = 1; i<6; i++)
        System.out.println("main thread!");
    }
}


