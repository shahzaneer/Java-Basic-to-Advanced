public class InInheritTwoIn {
    public static void main(String[] args) {

    }
}

interface ImFather1{
    int a = 10;
    int b = 23;

    void ieee();

}
interface ImMother1{
    int f = 22;

    void ieee_ras();
}

interface ImSon1 extends ImFather1 , ImMother1{
    int c  = 27;

    void ieee_cui();

}

//now you can only implement ImSon1 to implement the members of Both the interfaces


