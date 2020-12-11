package week04.examplesrc;

public class IfElse {
    public static void main(String[] args) {

        if( 1 > 0 ) {
            System.out.println("1은 0보다 크다! 참!");
        } else {
            System.out.println("1은 0보다 크지 않다!");
        }

        int mathScore = 85;
        if( mathScore >= 90 ) {
            System.out.println("수학점수는 90점 이상!");
        } else if (mathScore >= 80) {
            System.out.println("수학점수는 80점 이상!");
        } else if (mathScore >= 70) {
            System.out.println("수학점수는 70점 이상!");
        } else if (mathScore >= 60) {
            System.out.println("수학점수는 60점 이상!");
        } else {
            System.out.println("그 외 점수!");
        }
    }
}
