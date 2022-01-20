public class methodReturn {
    public static void main(String[] args) {
        Eman obj = new Eman();
        System.out.println(obj.emn());
//        System.out.println(obj.emn("Shahzaneer Ahmed"));
    }
}

class Eman{
    int emn(){
        int sum = z(45);
        return sum;

    }
    int z(int y){
        int a = 10;
        int c = y;
        int g = a  + c;
        return g;
    }
}