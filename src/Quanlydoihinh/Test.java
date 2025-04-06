package Quanlydoihinh;

import troChoiDanhLon_interface.Warior;

public class Test {
    public static void main(String[] args) {
        Army siu=new Army();

        siu.addUnit(new Marrior());
        siu.addUnit(new Archer());
        siu.addUnit(new Mage());
        siu.addUnit(new Paladin());
        siu.addUnit(new Rogue());

        System.out.println("Tan cong!");
        siu.executeAttack();
    }
}
