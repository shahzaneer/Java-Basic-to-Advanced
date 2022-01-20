//Linkedlist main har aik element dusre element ka reference apne pas mehfooz rkhta hai. is trh insertion and
// deletion of a particular indexed element can be done easily and code complications in case of shuffling can be
// minimized!


import java.util.LinkedList;
public class LinkedListClass {
    public static void main(String[] args ) {
        LinkedList<Integer> l1 = new LinkedList<>(); //declaration of an arrayList
        l1.add(100);
        l1.add(200);
        l1.add(300);
        l1.add(400);
        l1.add(500);

        l1.add(0,23); // given index per 23 add hoga.
        l1.add(0,35);  //ab 0 index per 35 aajayega aur 23 1st per shift hojayega.
        System.out.println(l1.get(1));  //23

        LinkedList <String> l2 = new LinkedList<>();
        l2.add("Shahzaneer Ahmed");
        l2.add("Rameez Kahsif");
        l2.add("Haris Riaz");
        l2.add("Fatima Batool");
        l2.add("Fatima Mahsud");

        LinkedList <Integer> l3 = new LinkedList<>();
        l3.add(11);
        l3.add(22);
        l3.add(33);
        l3.add(44);
        l3.add(55);

        l1.addAll(l3);

        System.out.println(l1.contains(44));
        System.out.println(l1.indexOf(55));
        System.out.println(l1.set(2,3333));



        for (int i = 0; i<l1.size();i++){
            System.out.println(l1.get(i));
        }

    }
}
