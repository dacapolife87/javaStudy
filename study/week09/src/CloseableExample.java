package week09.src;

class Temp implements AutoCloseable {

    @Override
    public void close() throws Exception {

    }
}

public class CloseableExample {
    public static void main(String[] args) {

        try (Temp tempCloseable = new Temp()) {
            System.out.println("Try in!");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Catch in!");
            e.printStackTrace();
        }

        System.out.println("Finish!!");
    }
}
