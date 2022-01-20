public class copyArray {
    public static void main(String[] args) {
        int num [] = {1,2,3,4,5,6};
        int marks [] ;
        marks = num; //num main jo kuch bhi hai wo aajaye marks main!

        for(int i = 0; i<6; i++){
            System.out.println(marks[i]);
        }

    }
}
