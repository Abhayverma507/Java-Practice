package Practice;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

//import static sun.awt.util.PerformanceLogger.setTime;

public class hashSet {
    public static void main(String[] args) {
        HashSet<String> hashMap = new HashSet<>();
        hashMap.add("Abhay");
        hashMap.add("Visual");
        hashMap.add("Ronit");
        hashMap.add("akash");
        //System.out.println(hashMap);
      //System.out.println(System.currentTimeMillis());
        //System.out.println(Long.MAX_VALUE);
        
        Date d = new Date();
        d.setTime(888888888);

        System.out.println(d.toInstant());
       // System.out.println(d.getTime());
        //System.out.println(d.getDate());
       // System.out.println(d.getSeconds());
       // System.out.println(d.getYear());
      }
}
