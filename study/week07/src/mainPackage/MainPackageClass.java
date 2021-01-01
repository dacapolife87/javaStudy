package week07.src.mainPackage;

import week07.src.mainPackage.subPackage.SubPackageClass;

public class MainPackageClass {

    private String name;

    public MainPackageClass(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("MainPackage이름은 : " + name + " 입니다.");
    }

    public void subPackage() {
        SubPackageClass subPackageClass = new SubPackageClass("[SubPackge의 Class]");
        subPackageClass.printName();

        week07.src.mainPackage.otherPackage.SubPackageClass other
                = new week07.src.mainPackage.otherPackage.SubPackageClass("[OtherPackge의 class]");

        other.otherPprintName();

    }
}
