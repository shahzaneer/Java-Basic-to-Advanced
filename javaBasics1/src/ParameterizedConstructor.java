//jis constructor main parameters mojud hon usse parameterized constructor kaheingay ..

public class ParameterizedConstructor {
    public static void main(String[] args) {
//        parameterzide main object banatay huay parameters dedetay hain
//        default constructor ki trh yeh bhi autocall hi hoga
        Testz obj = new Testz(9,7);

    }
}

class Testz{
    int x,y;  //instance variable
// parameterized constructor
        Testz(int a , int b){
            x = a;
            y = b;
            System.out.println(" x is :"+x);
            System.out.println(" y is :"+y);
            System.out.println("Parameterized constructor is provoked");

        }
    }
