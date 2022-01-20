public class FinalKeyWord {
    public static void main(String[] args) {
        Shahz obj = new Shahz();
       // obj.roll=102;  //it will throw error that final var cannot be changed!
        System.out.println(obj.roll);

    }
}
class Shahz{
    final int roll; //declaring final int roll (instance variable)

    Shahz(){
        roll = 101;  // now initializing it , it will be final
    }
}
