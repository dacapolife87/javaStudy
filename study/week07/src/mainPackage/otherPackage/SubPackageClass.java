package week07.src.mainPackage.otherPackage;

public class SubPackageClass {

    private String name;


    public SubPackageClass(String name) {
        this.name = name;
    }

    public void otherPprintName() {
        System.out.println("OtherPackage이름은 : " + name + " 입니다.");
    }
}
