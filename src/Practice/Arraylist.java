package Practice;

import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(8);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(4);
        // arrayList.addFirst(9);
        //arrayList.addLast(5);
        //arrayList.add(2,4);

     //arrayList.addLast(7);
        arrayList2.add(44);
        arrayList2.add(44);
        arrayList2.add(44);
        arrayList2.add(44);
        arrayList2.add(44);


       // arrayList2.addFirst(5454);
        arrayList.addAll(0, arrayList2);
        //arrayList.set(3, 56);
        arrayList.ensureCapacity(8);
        System.out.println(arrayList.size());
        // System.out.println(arrayList.contains(4));
       // System.out.println(arrayList.indexOf(8));
       // System.out.println(arrayList.clone());
        //System.out.println(arrayList.lastIndexOf(8));
     //   System.out.println(arrayList.hashCode());

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i));
            System.out.print(", ");
        }
    }
}
