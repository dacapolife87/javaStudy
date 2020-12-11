package week04.examplesrc;

public class SwitchCase {
    public static void main(String[] args) {

        int level = 40;

        switch (level){
            case 50:
                System.out.println("비전탄막스킬 사용가능");
            case 40:
                System.out.println("눈보라스킬 사용가능");
            case 30:
                System.out.println("화염구스킬 사용가능");
            case 20:
                System.out.println("얼음불꽃화살스킬 사용가능");
            case 10:
                System.out.println("얼음화살스킬 사용가능");
            default:
                System.out.println("마법봉 발사");
        }

        System.out.println("===========================================");

        String season = "winter";
        switch (season) {
            case "Spring" :
                System.out.println("봄이다");
                break;
            case "Summer" :
                System.out.println("여름이다");
                break;
            case "Autumn":
                System.out.println("가을이다");
                break;
            case "Winter":
                System.out.println("겨울이다");
                break;
            default:
                System.out.println("어느행성사람이냐?");
        }
    }
}
