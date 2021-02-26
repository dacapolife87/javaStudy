package week14.src;

import java.util.List;
import java.util.stream.Collectors;

public class Erasure {
    public List<Object> withErasure1(List<Object> list) {
        return list.stream().collect(Collectors.toList());
    }

    public List withErasure2(List list) {
        return (List) list.stream().collect(Collectors.toList());
    }

    public <T extends Animal> void genericMethod(T t) {
        t.print();
    }


}
