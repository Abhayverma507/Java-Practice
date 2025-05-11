package Practice;
class Thread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<400) {
            System.out.println("this is a thread one function");
            i++;
    }
}
}
class Thread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i<400) {
            System.out.println("this is a thread Two  function");
          i++;
        }

    }
}
public class ThreadPractice {
    // Thread using extends Thread class
    public static void main(String[] args) {
     Thread1 thread1 = new Thread1();
     Thread2 thread2 = new Thread2();
     thread1.start();
     thread2.start();
    }
}
