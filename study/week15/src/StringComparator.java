package week15.src;

import java.util.Arrays;
import java.util.Comparator;

public class StringComparator {

    public static void main(String[] args) {
        String[] names = {"hjjang", "daddy", "young"};

        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        Arrays.sort(names, (o1, o2) -> o1.compareTo(o2));


        Arrays.sort(names, String::compareToIgnoreCase);
    }

}
