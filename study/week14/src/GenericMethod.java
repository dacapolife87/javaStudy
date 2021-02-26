package week14.src;

class AAA {
    public String toString() {
        return "ClassAAA";
    }
}

class BBB {
    public String toString() {
        return "ClassBBB";
    }
}

class ShowType {
    public <T> void showType(T typeclass) {
        System.out.println(typeclass);
    }
}

public class GenericMethod {
    public static void main(String[] args) {
        AAA aaa = new AAA();
        BBB bbb = new BBB();

        ShowType showType = new ShowType();
        showType.showType(aaa);
        showType.showType(bbb);

        showType.<AAA>showType(aaa);
        showType.<BBB>showType(bbb);
    }
}
