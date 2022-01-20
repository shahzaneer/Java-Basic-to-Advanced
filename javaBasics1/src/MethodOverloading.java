public class MethodOverloading {
    public static void main(String[] args) {
        New obj = new New();
//        method overloading in terms of types of parameters
        obj.add(2,2);
        obj.add(2,4);
        obj.add(2,4.5f);

        obj.mul(2,3);
        obj.mul(2,3,4);

    }
}

class New{
    void add(int a, int b){
        int c = a+b;
        System.out.println("The sum is :"+ c);
    }

    void add(int a, float b) {
        float m = a * b;
        System.out.println("The muliplication is :" + m);
    }
    void mul(int a,int b ,int c){
            System.out.println("The mul is abB*c : "+a*b*c);
        }
    void mul(int a,int b){
        System.out.println("The mul is a*b: "+a*b);
    }

    }
