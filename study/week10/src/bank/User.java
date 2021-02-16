package week10.src.bank;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class User extends Thread {

    Account acc;
    public User(Account acc) {
        this.acc = acc;
    }

    @Override
    public void run() {
        for(int i = 0;  i<5; i++) {
            int money = 100;
            acc.before();

            acc.getBalance(money);
            acc.addBalance();
            acc.after();
        }

    }
}
