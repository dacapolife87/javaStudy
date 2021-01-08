package week08.src;

public class Wand implements Weapon, Skill {
    @Override
    public void attack() {
        System.out.println("지팡이로 공격!");
    }

    @Override
    public void cast() {
        System.out.println("파이어볼!");
    }

    @Override
    public String weapon() {
        return "지팡이";
    }
}
