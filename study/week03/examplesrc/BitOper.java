package week03.examplesrc;

public class BitOper {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 3;
        int num3 = -1;

        System.out.println(" "+num1 + " (num1)의 비트 : "+transbit(Integer.toBinaryString(num1)));
        System.out.println(" "+num2 + " (num2)의 비트 : "+transbit(Integer.toBinaryString(num2)));
        System.out.println(num3 + " (num3)의 비트 : "+transbit(Integer.toBinaryString(num3)));

        System.out.println("num1 & num2 : "+ (num1 & num2) );
        System.out.println(" "+num1 + " (num1)의 비트 : "+transbit(Integer.toBinaryString(num1)));
        System.out.println(" "+num2 + " (num2)의 비트 : "+transbit(Integer.toBinaryString(num2)));
        System.out.println("===================================================");
        System.out.println("        연산결과 : "+ transbit(Integer.toBinaryString(num1 & num2)));
        System.out.println();
        System.out.println("num1 | num2 : "+ (num1 | num2) );
        System.out.println(" "+num1 + " (num1)의 비트 : "+transbit(Integer.toBinaryString(num1)));
        System.out.println(" "+num2 + " (num2)의 비트 : "+transbit(Integer.toBinaryString(num2)));
        System.out.println("===================================================");
        System.out.println("        연산결과 : "+ transbit(Integer.toBinaryString(num1 | num2)));
        System.out.println();
        System.out.println("num1 ^ num2 : "+ (num1 ^ num2) );
        System.out.println(" "+num1 + " (num1)의 비트 : "+transbit(Integer.toBinaryString(num1)));
        System.out.println(" "+num2 + " (num2)의 비트 : "+transbit(Integer.toBinaryString(num2)));
        System.out.println("===================================================");
        System.out.println("        연산결과 : "+ transbit(Integer.toBinaryString(num1 ^ num2)));
        System.out.println();
        System.out.println("~num3 : "+ (~num3) );
        System.out.println(num3 + " (num3)의 비트 : "+transbit(Integer.toBinaryString(num3)));
        System.out.println("===================================================");
        System.out.println("        연산결과 : "+ transbit(Integer.toBinaryString(~num3)));


        int num4 = 2;
        System.out.println("2 << 1 : "+ (num4 << 1) );
        System.out.println(num4 + " (num4)의 비트 : "+transbit(Integer.toBinaryString(num4)));
        System.out.println("==================================================");
        System.out.println("       연산결과 : "+ transbit(Integer.toBinaryString(num4 << 1)));

        System.out.println();
        int num5 = 7;
        System.out.println("7 >> 1 : "+ (num5 >> 1) );
        System.out.println(num5 + " (num5)의 비트 : "+transbit(Integer.toBinaryString(num5)));
        System.out.println("==================================================");
        System.out.println("       연산결과 : "+ transbit(Integer.toBinaryString(num5 >> 1)));

        System.out.println();
        int num6 = -8;
        System.out.println("-8 >> 1 : "+ (num6 >> 1) );
        System.out.println(num6 + " (num6)의 비트 : "+transbit(Integer.toBinaryString(num6)));
        System.out.println("===================================================");
        System.out.println("        연산결과 : "+ transbit(Integer.toBinaryString(num6 >> 1)));

        System.out.println();
        int num7 = -8;
        System.out.println("-8 >>> 1 : "+ (num7 >>> 1) );
        System.out.println(num7 + " (num7)의 비트 : "+transbit(Integer.toBinaryString(num7)));
        System.out.println("===================================================");
        System.out.println("        연산결과 : "+ transbit(Integer.toBinaryString(num7 >>> 1)));
    }

    public static String transbit(String bit) {
        String base = "00000000000000000000000000000000";
        int bitLeng = bit.length();

        String substring = base.substring(bitLeng);

        return substring+bit;
    }
}
