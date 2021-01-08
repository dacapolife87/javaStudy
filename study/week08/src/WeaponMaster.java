package week08.src;

public class WeaponMaster {
    public static void main(String[] args) {
        Weapon sword = new Sword();
        Weapon wand = new Wand();

        sword.attack();
        sword.repair();
        sword.info();
        wand.attack();
        wand.repair();
        wand.info();
    }
}
