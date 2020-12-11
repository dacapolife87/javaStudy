package week04.examplesrc;

public class Roop {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("For문의 반복 i : "+i);
        }

        System.out.println("------------------------");
        for (int i = 0; i < 5; i++) {

            if(i == 3) {
                continue;
            }

            System.out.println("For문의 반복 i : "+i);
        }

        int[] intArrays = {1,2,3,4,5};
        for(int target : intArrays) {
            System.out.println("target = " + target);
        }
    }
}
