package week08.src;

public interface Weapon extends Item{
    void attack();
    default void repair() {
        System.out.println("무기를 수리하였습니다.");
    };

    default void info() {
        printInfo();
    }

    private void printInfo() {
        System.out.println("무기정보 : "+ weapon() + "를 사용하여 공격을 할수 있습니다.");
    }
}


