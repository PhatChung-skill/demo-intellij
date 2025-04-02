package Testinterface;

public class Frog implements Swimmable,Keu{

    @Override
    public void keu() {
        System.out.println("Ech op");
    }

    @Override
    public void swim() {
        System.out.println("Boi nhu cac");
    }
}
