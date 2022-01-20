public class setGetNameThread {
    public static void main(String[] args) {
        name t = new name();
        System.out.println(t.getName());
        t.setName("Child Thread : rameez");
        System.out.println(t.getName());

        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Main thread : Kashif");
        System.out.println(Thread.currentThread().getName());

    }
}

class name extends Thread{
    public void run(){}

}
