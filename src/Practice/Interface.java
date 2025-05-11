package Practice;

interface Bicycle {
    int a =54;
    void applyBrake(int decrement);

    void speedUP(int increment);
}
interface HornBicycle {

    void blowHOrnLoud();

    void blowHornInterface();
}

class Cycle implements Bicycle,HornBicycle {
    @Override
    public void blowHOrnLoud() {
        System.out.println("tttttttt");
    }

    @Override
    public void blowHornInterface() {

    }


    void blowHorn() {
        System.out.println("Peeeeee");
    }

    @Override
    public void applyBrake(int decrement) {
        System.out.println("Apply brake");
    }

    @Override
    public void speedUP(int increment) {
        System.out.println("Apply speedUP");
    }
}

public class Interface {
    public static void main(String[] args) {
        Cycle cycle = new Cycle();
        cycle.applyBrake(4);
        cycle.speedUP(5);
        System.out.println(Bicycle.a);
        cycle.blowHornInterface();
        cycle.blowHOrnLoud();


    }

}
