public class staticMethod {
    public static void main(String[] args) {
        Shah();
        Ahmed obj = new Ahmed();

        obj.Cui();
        staticMethod obj1 = new staticMethod();
        obj1.great();

//        isko call krte huay hum object per inhehsaar nhi krte hain.
    }
    static void Shah(){
//        static method --> static keyword , it is related to class and not to the object.
        System.out.println("CUI Islamabad ");
    }
    void great(){
        System.out.println("This is static method");
        Shah();

    }
}

class Ahmed{
    static void Cui(){
        System.out.println("Ammar Ibne yasir RA");
    }
}
