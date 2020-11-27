package week03.examplesrc;

class A {

}
class B extends A {

}

public class InstanceOfExample {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        if(a instanceof A) {
            System.out.println("a instanceof A : "+ (a instanceof A));
            System.out.println("a는 자기 자신이기 때문에 true");
        }

        if(b instanceof A) {
            System.out.println("b instanceof A : "+ (b instanceof A));
            System.out.println("b는 A의 자식 클래스이기 때문에 형변환 가능 : true");
        }

        if(a instanceof B) {
            System.out.println("불가능!");
        } else {
            System.out.println("a instanceof B : "+ (a instanceof B));
            System.out.println("a는 B의 붐 클래스이기 때문에 형변환 불가능 : false");
        }
    }
}
