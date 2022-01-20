// multilevel inheritance level wise hoti hai yani father --> son --> grandson  .
//grandson k obj se hum father aur son class dono k elements ko access krskte hain
public class MultiLevelInheritance {
    public static void main(String[] args) {

        Grandson obj = new Grandson();
        obj.getData(4,5);  //father's element
        obj.displayData();      //own
        System.out.println(obj.z);  //son's element


    }

}

class Father1{    //father class (Parent class)
    int x,y;
    void getData(int a , int b){
        x = a;
        y = b;
    }
}
class Son1 extends Father1{   //son class (intermediate sub class)
    int z = 30;
//    ismay x , y use kia hai jo father class kaa hai aur yeh inheritance se possible hua hai.
    int add(){
        int sum = x+y+z;
        return z;
    }
}

class Grandson extends Son1{   //grandson class (sub class)
    void displayData(){
        System.out.println(" x is :" +x);
        System.out.println(" y is :" +y);
        System.out.println(" z is :" +z);
        System.out.println("The sum is : "+add());
    }
}
