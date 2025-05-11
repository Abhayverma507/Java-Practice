  class Phone {
    public void calling(){
        System.out.println("calling..");
    }
      public void on(){
          System.out.println("on the phone..");
      }

  }
  class SmartPhone extends Phone{
      public void on(){
          System.out.println("on the SmartPhone ");
      }
      public void Music(){
          System.out.println("Play in Music");
      }


  }

 public class DynamicDispatch {
    public static void main(String[] args) {
             Phone obj = new SmartPhone();
              obj.on();

    }
}
