package Practice;

interface GPS1 {
    void location(int landitube, int longetube);
}

interface Camara1 {
    void takePhoto();

    private void videoQuality() {
        System.out.println(" THE QUALITY OF VIDEO OF 1080");
    }

    default void takeVideo() {
        videoQuality();
        System.out.println("THE VIDEO OF ABHAY ");
    }
}

interface mediaPlayer1 {
    void PlayMusic();
}

class CallPhone1 {
    public void call() {
        System.out.println("calling");
    }
}

class SmartPhone1 extends CallPhone1 implements GPS1, Camara1, mediaPlayer1 {
    public static void turnOn() {
        System.out.println("ON THE PHONE >>>>>");
    }

    // public  void takeVideo(){
    //  System.out.println(" THE VIDEO OF ANKIT ");
    //}
    @Override
    public void takePhoto() {
        System.out.println("CLICK>>>>");
    }

    @Override
    public void location(int landitube, int longetube) {
        System.out.println("landitube" + landitube + "AND longetube " + longetube + "OF THE USER");
    }

    @Override
    public void PlayMusic() {
        System.out.println("tere bina lenge ke bhi dam");
    }
}

public class PolymorphismInInterfaces {
    public static void main(String[] args) {

        GPS1 gps1 = new  SmartPhone1();  //this is a  object of Polymorphism in Interfaces
        gps1.location(322,322);
         Camara1 camara1 = new SmartPhone1();//this is a  object of Polymorphism in Interfaces
        camara1.takePhoto();
          camara1.takeVideo();
          mediaPlayer1 mediaPlayer1 = new SmartPhone1();//this is a  object of Polymorphism in Interfaces
        mediaPlayer1.PlayMusic();

    }
}
