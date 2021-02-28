package week14.src.generic;

public class Banana implements Entity<Integer> {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public static Banana of(Integer id) {
        Banana banana = new Banana();
        banana.id = id;

        return banana;
    }
}
