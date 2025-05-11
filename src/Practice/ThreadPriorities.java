package Practice;
class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void  run(){
        int i=0;
        while (i<400){
        System.out.println("This is a run method"+getName());
          i++;
        }
}
}
public class ThreadPriorities {
    public static void main(String[] args) {
        MyThr1 myThr1 = new MyThr1("Abhay1 MAX");
        MyThr1 myThr2 = new MyThr1("Abhay2 NORM ");
        MyThr1 myThr3 = new MyThr1("Abhay3 MIN");
        myThr1.start();
        myThr2.start();
        myThr3.start();
        myThr1.setPriority(Thread.MAX_PRIORITY);
         myThr2.setPriority(Thread.NORM_PRIORITY);
         myThr3.setPriority(Thread.MIN_PRIORITY);
    }
}
