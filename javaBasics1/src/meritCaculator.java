import java.util.Scanner;
public class meritCaculator {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Merit calculator CUI Islamabad");
        System.out.println("Enter your Matriculation Marks");
        float matric = obj.nextFloat();
        System.out.println("Enter your Intermediate Marks");
        float inter = obj.nextFloat();
        System.out.println("Enter your NTS Marks");
        float nts = obj.nextFloat();

        float matric_percentage = (matric/1100)*100;
        float inter_percentage = (inter/1100)*100;
        float nts_percentage = (nts/100)*100;

        double merit_cui = ((matric_percentage*0.1)+(inter_percentage*0.4)+(nts_percentage*0.5));

        System.out.println("Dear Candidate your Aggregate for CUI Islamabad is :"+merit_cui);


    }
}
