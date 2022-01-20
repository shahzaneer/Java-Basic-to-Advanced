public class hybridInheritance {
    public static void main(String[] args) {
//        hybrid inheritance main do ya do se zyada types ki inheritance use hoti hain . .
//        mazkoora example main mulilevel aur multiple inheritance use ki gyi hain !

        Result obj = new Result();
        obj.disp();

    }
}

class Student{
    int roll = 87;
    String name = "Shahzaneer Ahmed";
    int total_marks = 200;
}

class Exam extends Student{
    int theory = 80;
    int practical = 40;
}

interface Project{
    int project = 45;
    void disp();

}

class Result extends Exam implements Project{
    int obtain_marks = theory + practical + Project.project;

    public void disp(){
        System.out.println("The candidate's name is :"+name);
        System.out.println("The total marks for the subject are :"+total_marks);
        System.out.println("The theory mark are :"+theory);
        System.out.println("The practical marks are :"+practical);
        System.out.println("The  Project marks are :"+Project.project);
        System.out.println("The total obtain marks of the candidate are :"+obtain_marks);
    }

}
