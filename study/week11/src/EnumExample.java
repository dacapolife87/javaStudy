package week11.src;

import java.lang.Enum;
import java.util.EnumSet;

public class EnumExample {

    public static void main(String[] args) {
        Season[] seasons = Season.values();
        for (Season season : seasons) {
            System.out.println("season = " + season);
        }


        String one = String.valueOf(1);

        String pi = String.valueOf(3.14);
        System.out.println(pi);

        Season season = Season.valueOf("SPRING");
        System.out.println("2달뒤면..." + season);



        System.out.println(Season.WINTER + "은 역시 추워요..");

        EnumSet<Season> allSaeson = EnumSet.allOf(Season.class);
        EnumSet<Season> likeSeason = EnumSet.of(Season.SPRING, Season.WINTER);
        EnumSet<Season> range = EnumSet.range(Season.SPRING, Season.FALL);
        System.out.println("대한민국은 "+allSaeson + "의 계절이 있어요");
        System.out.println("제가 좋아하는 계절은 "+likeSeason + "이에요");
        System.out.println(range +"에 열심히 농사를 지어요");


        System.out.println(allSaeson.toArray());

    }
}
