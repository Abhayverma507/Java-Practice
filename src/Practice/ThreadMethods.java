package Practice;
class ThrMeth1 extends Thread{
    public void  run(){
        int i=0;
        while (i<400){
            System.out.println("This is a run method+++++++");
            i++;
        }
    }
}
    class ThrMeth extends Thread{
        public void  run(){
            int i=0;

            while (i<400){
                System.out.println("This is a run method");
            /* This thread is stop a method for that you given time
                try{
                    Thread.sleep(455);

                }
                catch (Exception e){
                    System.out.println(e);
                }
                */

                i++;
            }
        }
    }


public class ThreadMethods {
    public static void main(String[] args) {
        ThrMeth thrMeth = new ThrMeth();
        thrMeth.start();
       /* This is a join method it used to finish the one thread first  then execute sec one
         try {
            thrMeth.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        */

            ThrMeth1 thrMeth1 = new ThrMeth1();
            thrMeth1.start();

    }
}