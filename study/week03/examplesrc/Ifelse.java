package week03.examplesrc;

public class Ifelse {

    public static void main(String[] args) {
        int a;

        if ( 20 > 10 ) {
            a = 20;
        } else {
            a = 100;
        }

        System.out.println("20은 10보다 크기때문에 참인 20! : " + a);

        int b = (20 > 10) ? 50 : 100;
//               조건문  참일때 거짓일떄
        System.out.println("20은 10보다 크기때문에 참인 50! : " + b);
    }
}
