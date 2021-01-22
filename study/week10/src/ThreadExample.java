package week10.src;

public class ThreadExample extends Thread {

    int seq;

    public ThreadExample(int seq) {
        this.seq = seq;
    }

    @Override
    public void run() {
        System.out.println("ThreadExample.run seq : "+seq);
    }

    public static void main(String[] args) {
        for(int i = 0; i<10; i++) {
            ThreadExample example = new ThreadExample(i);

            if( i == 5) {
                example.setPriority(MAX_PRIORITY);
            }else{
                example.setPriority(MIN_PRIORITY);
            }
            example.start();

        }

        System.out.println("ThreadExample.main");

    }
}
