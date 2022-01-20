public class calArray {
    public static void main(String[] args) {
        int num [] = new int [5];

        num [0] = 11;
        num[1] = 22;
        num[2] = num[0] + num[1];
        num [3] = num[0];
        num [4] = num[1];

        for(int i = 0; i<5;i++){
            System.out.println(num[i]);
        }

    }
}
