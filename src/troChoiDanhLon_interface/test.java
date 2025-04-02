package troChoiDanhLon_interface;

public class test {
    public static void main(String[] args) {
        MeleeFighter BauThien=new Warior();
        BauThien.attackMelee();
        System.out.println("");

        RangedFighter SonNui=new Archer();
        SonNui.attackRanged();
        System.out.println("");

        MagicUser minh=new Mage();
        minh.castSpell();
        System.out.println("");

        Paladin phatChung=new Paladin();
        phatChung.attackMelee();
        phatChung.castSpell();
    }
}
