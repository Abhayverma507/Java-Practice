package Practice;
interface GPS{
    void  location( int landitube , int longetube);
}
interface  Camara{
    void    takePhoto() ;
   private void videoQuality(){
        System.out.println(" THE QUALITY OF VIDEO OF 1080");
    }
    default void   takeVideo(){
       videoQuality();
       System.out.println("THE VIDEO OF ABHAY ");
    }
}
interface  mediaPlayer{
    void  PlayMusic();
}
class CallPhone {
    public void call(){
        System.out.println("calling");
    }
}
class SmartPhone extends CallPhone implements GPS,Camara,mediaPlayer{
    public static void turnOn(){
        System.out.println("ON THE PHONE >>>>>");
    }
  // public  void takeVideo(){
      //  System.out.println(" THE VIDEO OF ANKIT ");
    //}
    @Override
    public void takePhoto() {
        System.out.println( "CLICK>>>>");
    }

    @Override
    public void location(int landitube, int longetube) {
        System.out.println( "landitube"+landitube+ "AND longetube "+ longetube + "OF THE USER" );
    }

    @Override
    public void PlayMusic() {
        System.out.println("tere bina lenge ke bhi dam");
    }
}
public class Interface2 {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.location( 3333222 ,332323242);
        smartPhone.PlayMusic();
        smartPhone.takePhoto();
        smartPhone.call();
        SmartPhone.turnOn();
        smartPhone.takeVideo();


    }
}
