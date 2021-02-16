package week10.src.bank;

public class Banker {

    public static void main(String[] args) throws InterruptedException {
        Account acc = new Account();
        User hjjang = new User(acc);
        User jwjang = new User(acc);
        hjjang.start();
        jwjang.start();
        hjjang.join();
        jwjang.join();

        System.out.println(hjjang.hashCode());
        System.out.println(jwjang.hashCode());


        System.out.println("결과 : "+acc.showMoney());

    }
}
