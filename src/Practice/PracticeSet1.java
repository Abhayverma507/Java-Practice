package Practice;
abstract class Telephone{
    abstract public void ring();
    abstract public void lift();
    abstract public void disconnect();
}
class  SmartTelephone extends Telephone{

    @Override
    public void ring() {
        System.out.println("ring");
    }

    @Override
    public void lift() {
        System.out.println("lift");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnect");
    }
}
public class PracticeSet1 {
    public static void main(String[] args) {
        Telephone telephone =new SmartTelephone();
        telephone.disconnect();
    }
}
