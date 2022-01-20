//Single level inheritance means aik parent class se aik child class derive hona
// father-son relation is the best way to explain this type of inheritance
// father ka child hai son aur father ki saaari properties wo khud bhi use krta hai
//son k object se father k members ko access kia jaskta hai


public class SingleInheritance {
    public static void main(String[] args) {
//        main jo k entry point hai wo hi sequence determine krta hai program ka jo k likha jarha houta hai
        Son obj = new Son();
        System.out.println(obj.x); //x father class ka member hai lekin son k object se call hoskta hai
        System.out.println(obj.y); //y father class ka member hai lekin son k object se call hoskta hai

        obj.dataInfo();   // father class ka method hai lekin son k object se call hoskta hai
        obj.disp();       //apne method ko bhi call krta hai yeh directly..


    }
}

class Father{
    int x , y; //instance variable of father class
    void dataInfo(){
// instance method of father class
        x = 5;
        y = 5;
        System.out.println("x is :"+x);
        System.out.println("y is :"+y);
    }
    void father_method(){
        System.out.println("Im method of father class");
    }

}

class Son extends Father{
//    father super class hai aur usse extend kr rhi hai Son class jo sub class hai
//    father ki tamaam khasoosiaat ki hamil class hai yeh , naiz yeh k apne kuch naye sazo-samaan bhi rkhti hai
    void add(int a, int b){
        x = a;
        y = b;
        int z = x+y;
        System.out.println("The sum is = "+z);
    }
    void disp(){
        System.out.println("This is a display function ");
        add(x,y);
    }

}

