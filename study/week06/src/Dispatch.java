package week06.src;

abstract class Dynamic {
    abstract void run();
}
class Dynamic1 extends Dynamic {
    void run(){
        System.out.println("Dynamic1.run");
    }
}

class Dynamic2 extends Dynamic {
    void run(){
        System.out.println("Dynamic2.run");
    }
}

public class Dispatch {

    public static void main(String[] args) {
        Dynamic dynamic = new Dynamic1();
        dynamic.run();
    }
}
