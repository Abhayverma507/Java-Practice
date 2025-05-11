package Practice;

class MyThreadClass1 implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (i < 400) {
            System.out.println("I am threadClass1");
            i++;
        }
    }
}

class MyThreadClass2 implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (i < 400) {
            System.out.println("I am threadClass2+++++++");
            i++;
        }
    }
}

public class ThreadPractice2 {
    // Thread using implement Runnable interFace
    public static void main(String[] args) {

        MyThreadClass1 bullet = new MyThreadClass1();
        Thread gun = new Thread(bullet);

        MyThreadClass2 bullet2 = new MyThreadClass2();
        Thread gun2 = new Thread(bullet2);

        gun.start();
        gun2.start();
    }
}
