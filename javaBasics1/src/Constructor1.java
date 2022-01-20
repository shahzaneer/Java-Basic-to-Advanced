//        constructor aik method hi houta hai , isko call krne ki zarurat nhi perti hai , yeh objects ko initialize krne k liay use houta hai .
//        yeh koi value return nhi krta , even void bhi return nhi kerta yeh
//        iska name wohi houta hai jo class ka houta hai
//        yeh bazaat e khud inherited houtay hain , members inhertied nhi houtay

//        Default constructor --> jismain parameters na hon , ager kisi class main koi default constructor na ho tou bhi compiler usse bana deta hai apne app hi
public class Constructor1 {
    public static void main(String[] args) {
        Test1 obj = new Test1();
//        object banatay hi yeh auto call hojayega


    }
}

    class Test1{
        int a; //instance Variable
        Test1(){
//                defualt construtor
            a = 10; //we have initialized instance var in Constructor
            System.out.println("a :"+a);
            System.out.println("I'm default Construtor");
        }

    }

