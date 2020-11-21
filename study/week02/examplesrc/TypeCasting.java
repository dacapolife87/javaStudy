package week02.examplesrc;

public class TypeCasting {

    public static void main(String[] args) {
        TypeCasting typeCasting = new TypeCasting();
//        typeCasting.casting();
        typeCasting.forceCasting();
    }

    public void casting() {

        int intValue = 10;
        System.out.println("intValue = " + intValue);

        double castingIntValue = intValue;
        System.out.println("castingIntValue = " + castingIntValue);
    }

    public void forceCasting() {
        double doubleValue = 100.5;
        System.out.println("doubleValue = " + doubleValue);
        int intValue = (int) doubleValue;
        System.out.println("intValue = " + intValue);

    }
}
