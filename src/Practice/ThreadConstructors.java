package Practice;
 class MyThr extends Thread{
     public MyThr(String name){
       super(name);
     }
     public void  run(){
         System.out.println("This is a run method" );
     }
 }
public class ThreadConstructors {
    // Thread using extends Thread class with constructor
    public static void main(String[] args) {
        MyThr myThr = new MyThr("Abhay");
        MyThr myThr1 = new MyThr("Ankit");

        myThr.start();
        System.out.println("The thread name is "+myThr.getName());
        System.out.println("The thread id is "+myThr.threadId());

        myThr1.start();
        System.out.println("The thread name is "+myThr1.getName());
        System.out.println("The thread id is "+myThr1.threadId());
         }

}
