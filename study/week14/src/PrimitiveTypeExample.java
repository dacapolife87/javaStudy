package week14.src;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveTypeExample {

    public static void main(String[] args) {

        // 기본타입이 불가능한 이유를 생각해보면
        // 제네릭은 컴파일시에 Object로 변경을 하는데 ReferType은 Object를 상속받아서 컴파일시점에 Object로 변경이 되어도 문제가 없지만
        // PrimitiveType은 그렇지가 않다.
//        List<int> list = new ArrayList<>();
//        list.add(17);

        List<Integer> list = new ArrayList<>();
        list.add(17);
        // java/lang/Integer.valueOf (I)Ljava/lang/Integer;
        int number = list.get(0);
        // ReferType -> PrimitiveType으로 언받싱이 자동화되서 이부분은 바로 사용가능

    }
}
