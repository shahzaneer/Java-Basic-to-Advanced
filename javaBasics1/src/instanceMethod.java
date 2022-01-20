public class instanceMethod {

    public static void main(String[] args) {

        instanceMethod obj = new instanceMethod();
//        main methoid static houta hai jismain hum obj k bagair functionn ko call nhi kersktay!
        obj.Shah(5,4);

    }
    void Shah(int a ,int b){
        int x = a; //x , y ,z local variables hain
        int y = b;
        int z = x + y;
        System.out.println("Sum of numbers "+z);
    }
}
