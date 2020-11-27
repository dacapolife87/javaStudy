package week03.examplesrc;

public class AssignmentClass {

    public static void main(String[] args) {

        int a = 10;

        System.out.println("a에 10을 할당한다 : " + a);


        a += 5;
        System.out.println("a +=5 는 a = a + 5 와 같다. (a = 10 + 5) :  " + a);
        a -= 3;
        System.out.println("a -=3 는 a = a - 3 와 같다. (a = 15 - 3) :  " + a);
        a /= 3;
        System.out.println("a /=3 는 a = a / 3 와 같다. (a = 12 / 3) :  " + a);
        a *= 5;
        System.out.println("a *=5 는 a = a * 5 와 같다. (a = 4 * 5) :  " + a);
    }
}
