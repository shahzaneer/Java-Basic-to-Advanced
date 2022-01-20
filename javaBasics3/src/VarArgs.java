public class VarArgs {
    public static void main(String[] args) {
//        varArgs means variable arguments --> zero ya apni merzi k arguments enter krne per aik function amal karayga
//        ismay parameters in an array save hojatay hain. ager koi parameter na bhi den tou empty  array consider
//        houti hai!

        System.out.println(sum()); // empty array consider hogi tou koi masla na hoga!
        System.out.println(sum(1,2,3,4,56,7,7,7));
        System.out.println(sum(2,2,5,6));


//        System.out.println(average(1,2,3,4,5,6,7,8,9,10)); //yun [] k signs k saath use karengay tou error generate
//        hoga!
//        var args ... k symbol k saath hi generate houtay hain..


    }

    static int sum(int ...arr){
        int sum = 0;
        for(int e: arr){
            sum+=e;
        }

        return sum;
    }

    static int average(int [] arr){
        int sum = 0;
        for (int e:arr){
            sum+=e;
        }
        int noOfElements = arr.length;
        int average = sum/noOfElements;
        return average;
    }
}
