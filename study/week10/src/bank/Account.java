package week10.src.bank;

public class Account {

    private int balance = 1000;

    Object temp = new Object();
    public synchronized void before() {
        System.out.println(Thread.currentThread() +"Before");
    }
    public synchronized void after() {
        System.out.println(Thread.currentThread() +"After");
    }
//    public void getBalance(int money) {
//        System.out.println("get Balance!");
//
//        try {
//            Thread.sleep(1000);
//        } catch(InterruptedException e) {}
//        balance -= money;
//
//    }

//    public synchronized void getBalance(int money) {
//        System.out.println(Thread.currentThread() +"get Balance!");
//
//        try {
//            Thread.sleep(1000);
//        } catch(InterruptedException e) {}
//        balance -= money;
//        System.out.println(Thread.currentThread() + " : get : " + money +" - Balance : "+showMoney());
//    }

//    public void getBalance(int money) {
//        System.out.println("get Balance!");
//        synchronized (this) {
//            try {
//                Thread.sleep(1000);
//            } catch(InterruptedException e) {}
//            balance -= money;
//            System.out.println(Thread.currentThread() + " : get : " + money +" - Balance : "+showMoney());
//        }
//    }

    public void getBalance(int money) {
        System.out.println("get Balance!");
        synchronized (temp) {
//            try {
//                Thread.sleep(1000);
//            } catch(InterruptedException e) {}
            balance -= money;
            System.out.println(Thread.currentThread() + " : get : " + money +" - Balance : "+showMoney());
        }
    }

    public synchronized void addBalance() {
        balance += 100;
    }
    public int showMoney() {
        return balance;
    }
}
