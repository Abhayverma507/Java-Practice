package Practice;

class T1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 20) {
            System.out.println("GoodMorning");
            i++;
        }
    }
}

class T2 extends Thread {
    public void run() {
        int i = 0;
        while (i<20) {
            System.out.println("Welcome sir");
           i++;
        }
    }
}

public class PracticeSetThread {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(Thread.currentThread().getState());
        t1.start();
       // t2.start();
    }
}
