package Practice;
class Myth1 implements Runnable{
    @Override
    public void run() {
        System.out.println(" This is the run  method ");
    }
}
public class ThreadConstructor1 {
    public static void main(String[] args) {
        Myth1 myth1 = new Myth1();
         Thread thread1 = new Thread(myth1,"Abhay");
        thread1.start();
        System.out.println("The thread name is "+thread1.getName());
        System.out.println("The thread id is "+thread1.threadId());
    }
}
