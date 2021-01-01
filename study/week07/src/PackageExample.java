package week07.src;

import week07.src.mainPackage.MainPackageClass;

public class PackageExample {

    public static void main(String[] args) {
        MainPackageClass mainPackageClass = new MainPackageClass("MainPackage");
        mainPackageClass.printName();
        mainPackageClass.subPackage();
    }

}


