package Practice;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkListPractice {
    public static void main(String[] args) {


        LinkedList<Integer> linkList = new LinkedList<>();
        LinkedList<Integer> linkList2 = new LinkedList<>();
        linkList.add(2);
        linkList.add(8);
        linkList.add(5);
        linkList.add(7);
        linkList.add(8);
        linkList.add(4);
        // linkList.addFirst(9);
        //linkList.addLast(5);
        //linkList.add(2,4);

        linkList2.add(44);
        linkList2.add(44);
        linkList2.addLast(3);
        linkList2.add(44);
        linkList2.add(44);
        linkList2.add(44);
        linkList2.addFirst(878);
        linkList.addAll( linkList2);
        System.out.println(Arrays.toString(linkList.toArray()));

        //System.out.println(linkList2.descendingIterator());
    //   linkList.set(3, 56);
        // System.out.println(linkList.contains(4));
       // System.out.println(linkList.indexOf(8));
      //  System.out.println(linkList.clone());
       // System.out.println(linkList.lastIndexOf(8));
        //System.out.println(linkList.hashCode());

        for (int i = 0; i < linkList.size(); i++) {
            System.out.print(linkList.get(i));
            System.out.print(", ");
        }
    }
}