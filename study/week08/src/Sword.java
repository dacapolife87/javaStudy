package week08.src;

public class Sword implements Weapon, Skill {
    @Override
    public void attack() {
        System.out.println("검으로 공격!");
    }

    @Override
    public void cast() {
        System.out.println("강타시전!");
    }

    @Override
    public String weapon() {
        return "단검";
    }
    
}
