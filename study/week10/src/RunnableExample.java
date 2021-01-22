package week10.src;

public class RunnableExample implements Runnable {

    int seq;

    public RunnableExample(int seq) {
        this.seq = seq;
    }

    @Override
    public void run() {
        System.out.println("RunnableExample.run seq : "+seq);
    }

    public static void main(String[] args) {
        for(int i = 0; i<10; i++) {
            Thread thread = new Thread(new RunnableExample(i));
            thread.start();
        }

        System.out.println("RunnableExample.main");

    }
}
