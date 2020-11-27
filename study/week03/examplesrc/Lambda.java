package week03.examplesrc;

@FunctionalInterface
interface Calc {
    public int min(int x, int y);
}

public class Lambda {

    public static void main(String[] args) {

        // 람다식 사용전
        Calc calc = new Calc() {
            @Override
            public int min(int x, int y) {
                return x < y ? x : y;
            }
        };

        System.out.println(calc.min(5,6));

        // 람다식 사용
        Calc minNum = (x , y) -> x < y ? x : y;
        System.out.println(minNum.min(3,4));

    }
}
