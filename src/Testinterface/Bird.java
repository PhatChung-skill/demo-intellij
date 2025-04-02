package Testinterface;

public class Bird implements Flyable,Keu{

    @Override
    public void fly() {
        System.out.println("Bay Dang cap.");
    }

    @Override
    public void keu() {
        System.out.println("chit chit");
    }
}
