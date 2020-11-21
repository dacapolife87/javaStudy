package week02.examplesrc;

public class ArrayExample {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
//        arrayExample.arrayExample();
        arrayExample.secondArray();
    }

    public void arrayExample() {
        int[] intValueArray1 = new int[5];
        int []intValueArray2 = new int[10];
        int intValueArray3[] = new int[15];

        System.out.println("intValueArray1 Length = " + intValueArray1.length);
        System.out.println("intValueArray2 Length = " + intValueArray2.length);
        System.out.println("intValueArray3 Length = " + intValueArray3.length);

        intValueArray1[0] = 7;
        intValueArray1[1] = 6;
        intValueArray1[2] = 10;
        intValueArray1[3] = 2;
        intValueArray1[4] = 5;
        System.out.println("intValueArray1[0] = " + intValueArray1[0]);
        System.out.println("intValueArray1[1] = " + intValueArray1[1]);
        System.out.println("intValueArray1[2] = " + intValueArray1[2]);
        System.out.println("intValueArray1[3] = " + intValueArray1[3]);
        System.out.println("intValueArray1[4] = " + intValueArray1[4]);

        System.out.println();


        try {
            System.out.println("intValueArray1 Length = " + intValueArray1.length);
            intValueArray1[5] = 8;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 크기 초과!");
            e.printStackTrace();
        }

        int[] anotherArray = {1,2,3,4,5};

        System.out.println("anotherArrayLength = " + anotherArray.length);

    }


    public void secondArray() {
        int[][] array2By2_1 = new int[2][2];
        int[][] array2By2_2 = {{1,2},{3,4}};

        System.out.println("2By2 - 1 배열의 크기 : "+array2By2_1.length);
        System.out.println("2By2 - 1 배열의 0번방의 크기 : "+array2By2_1[0].length);
        System.out.println("2By2 - 1 배열의 1번방의 크기 : "+array2By2_1[1].length);


        System.out.println("");

        System.out.println("2차원 배열 접근 0번 배열의 첫번째값 : "+array2By2_2[0][0]);
        System.out.println("2차원 배열 접근 1번 배열의 두번째값 : "+array2By2_2[1][1]);

        System.out.println("배열의 값 변경");
        array2By2_2[1][1] = 10;


        System.out.println("2차원 배열 접근 1번 배열의 두번째값 : "+array2By2_2[1][1]);
    }
}
