import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList abc = new ArrayList();
        abc.add("Shahzaneer Ahmed");
        abc.add(12);
        abc.add(12.98);
        
        for(int i=0; i<abc.size();i++){
            System.out.println(abc.get(i));
        }

    }
}
