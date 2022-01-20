
//ArrayList is a resizeable array . It has its own different methods which can be viewed from java docs.

import java.util.*; //wild card import
public class ArrayListClass {
    public static void main(String[] args) {
     ArrayList <Integer> l1 = new ArrayList(); //declaration of an arrayList
        l1.add(100);
        l1.add(200);
        l1.add(300);
        l1.add(400);
        l1.add(500);

        l1.add(0,23); // given index per 23 add hoga.
        l1.add(0,35);  //ab 0 index per 35 aajayega aur 23 1st per shift hojayega.
        System.out.println(l1.get(1));  //23

        ArrayList <String> l2 = new ArrayList<>();
        l2.add("Shahzaneer Ahmed");
        l2.add("Rameez Kahsif");
        l2.add("Haris Riaz");
        l2.add("Fatima Batool");
        l2.add("Fatima Mahsud");

        ArrayList <Integer> l3 = new ArrayList<>();
        l3.add(11);
        l3.add(22);
        l3.add(33);
        l3.add(44);
        l3.add(55);

        l1.addAll(l3); //l1 main l3 k tamaam elements add krdiay gye!

        System.out.println(l1.contains(44)); //44 tou hai
        System.out.println(l1.indexOf(55));
        System.out.println(l1.set(2,3333));
       System.out.println(l1);

//        l1.clear();

        for (int i = 0; i<l1.size();i++){
//            arrayLIst main size houta hai not array.length method.
            System.out.println(l1.get(i)); //l1[i] array main houta hai yahan isko achieve krne k lioay get method
            //use houta hai.
        }

    }
}
