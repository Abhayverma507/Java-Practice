public class Practice1 {

      int logic(int x , int y){
        int z ;
          if(x<y){
            z=x+y;
        }else{
            z=x*y;
        }
          return z;
      }
      static int logic2(int x, int y){
          int z1;
          z1 = x-y;
          return z1;
      }

    public static void main(String[] args) {

        int a = 4;
        int b = 7;
        Practice1 obj1  = new Practice1();
        int c = obj1.logic(a,b) ;
        System.out.println(c);
        int a1 = 5;
        int b1 = 5;
        int c1 = logic2(a1,b1) ;
        System.out.println(c1);
    }
}
