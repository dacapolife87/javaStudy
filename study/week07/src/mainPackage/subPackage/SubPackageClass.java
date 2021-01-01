package week07.src.mainPackage.subPackage;

public class SubPackageClass {

    private String name;


    public SubPackageClass(String name) {
        this.name = name;
    }
    
    public void printName() {
        System.out.println("SubPackage이름은 : " + name + " 입니다.");
    }
}
