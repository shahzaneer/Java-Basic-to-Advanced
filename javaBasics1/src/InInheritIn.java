public class InInheritIn {

    public static void main(String[] args) {
//        interface ka koi bhi object nhi bn skta!

    }
}

interface ImFather{
    int a = 10;
    int b = 23;

    void ieee();

}

interface ImSon extends ImFather{
    int c  = 27;

    void ieee_cui();

}

//now if we implement only ImSon Interface , we would have no use of implementing ImFather interface