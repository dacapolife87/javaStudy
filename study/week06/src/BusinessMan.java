package week06.src;

public class BusinessMan extends Man {

    public String company;
    public String position;

    public BusinessMan(String name, String company, String position) {
        super(name);
        this.company = company;
        this.position = position;
    }

    public void tellYourInfo() {
        System.out.println("company = " + company);
        System.out.println("position = " + position);
        tellYourName();
    }

    @Override
    public void myInfo() {
        System.out.println("MyInfo Child Class");
        System.out.println("name = " + name);
        System.out.println("company = " + company);
        System.out.println("position = " + position);
    }

    public static void main(String[] args) {
        BusinessMan businessMan = new BusinessMan("ManName", "ManCompany", "Boss");
        businessMan.myInfo();

    }
}
