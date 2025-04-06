package Quanlydoihinh;

public class Paladin implements MeleeFighter,MagicUser{

    @Override
    public void castSpell() {
        System.out.println("Dung phep bang");
    }

    @Override
    public void attackMelee() {
        System.out.println("Danh can chien riu.");
    }
}
