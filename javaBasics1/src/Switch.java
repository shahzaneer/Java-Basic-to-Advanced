public class Switch {
    public static void main(String[] args) {
        switch (3){
            case 1:
            {
                System.out.println("Monday");
                break;
//                break statement is liay lagaatau hain k ager beech main kahein program satisfy hojaye tou khtm hojaye
            }
            case 2:
            {
                System.out.println("Sunday");
                break;
            }
            default:
            {
                System.out.println("No-day!");
            }
        }

//        enhanced switch in java which can be used without break statement..
        switch (3) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Sunday");
            default -> System.out.println("No-day!");

        }
    }
}
