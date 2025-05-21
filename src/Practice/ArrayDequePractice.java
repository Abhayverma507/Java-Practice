package Practice;

import java.util.ArrayDeque;

public class ArrayDequePractice {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(42);
        arrayDeque.add(344);
        arrayDeque.add(434);
        System.out.println(arrayDeque.getFirst());
        System.out.println(arrayDeque.offer(10));
        System.out.println(arrayDeque.getLast());
    }
}
