package troChoiDanhLon_interface;

public class Paladin implements MeleeFighter,MagicUser{
    @Override
    public void castSpell() {
        System.out.println("He Bang");
    }

    @Override
    public void attackMelee() {
        System.out.println("Danh kiem.");
    }
}
