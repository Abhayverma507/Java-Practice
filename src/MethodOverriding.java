
class OverridingOne{
       public int meth1(){
         return 4;
       }
       public void meth2( ){
           System.out.println("I am a meth2 of class OverridingOne ");
       }
}
class OverridingTwo extends OverridingOne{
    @Override
      public void meth2(){
          System.out.println("I am a meth2 of class OverridingTwo ");
      }



}
public class MethodOverriding {
    public static void main(String[] args) {
          OverridingOne overridingOne = new OverridingOne();
           OverridingTwo overridingTwo = new OverridingTwo();
        overridingOne.meth2();

        overridingTwo.meth2();

    }
}
