package week06.src;

public class Man {

    public String name;

    public Man() {
    }

    public Man(String name) {
        this.name = name;
    }

    public void tellYourName() {
        System.out.println("name = " + name);
    }

    public void myInfo() {
        System.out.println("MyInfo Parent Class");
        System.out.println("name = " + name);
    }
}
