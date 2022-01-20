public class RunnableInterfaceMultiThreading {
    public static void main(String[] args) {
        Mythreadd myt = new Mythreadd(); //apni mojuda class ka obj.
        Thread t = new Thread(myt);   //lekin start method tou Thread class main hai so Thread ka aik banalete hain
        // object jismay apni class ka object pass krdengay..
        t.start(); //ab thread k obj t ki help se threading_start krskte hain.

        for (int i = 0; i<5; i++){
            System.out.println("main thread ");
        }
    }
}

class Mythreadd implements Runnable{
    public void run(){
   for (int i = 0; i < 5; i++){
       System.out.println("Child thread ");
   }
    }
}

