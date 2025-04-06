package Quanlydoihinh;

public class Rogue implements MeleeFighter,RangedFighter{

    @Override
    public void attackMelee() {
        System.out.println("Danh can chien bang dao.");
    }

    @Override
    public void attackRanged() {
        System.out.println("Danh tam xa bang sung.");
    }
}
