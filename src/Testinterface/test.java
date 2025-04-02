package Testinterface;

public class test {
    public static void main(String[] args) {
        System.out.println("CHim se:");
        Bird chimse=new Bird();
        chimse.fly();
        chimse.keu();
        System.out.println("");

        System.out.println("Ca siu map:");
        Swimmable camap=new Fish();
        camap.swim();
        System.out.println("");

        System.out.println("Ech Tan:");
        Frog echBauThien=new Frog();
        echBauThien.keu();
        echBauThien.swim();
    }
}
