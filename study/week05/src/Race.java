package week05.src;


class Car {

    int speed;
    String name;


    public Car(String name) {
        this(0, name);
    }

    public Car(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    public void speedUp() {
        speed++;
        System.out.println("SpeedUp!!");
    }

    public void speedDown() {

        if(speed < 1) {
            speed = 0;
            System.out.println("Stop!!");
            return;
        }
        speed--;
        System.out.println("SpeedDown!!");
    }

    public void nowSpeed() {
        System.out.println("현재속도는 : "+speed);
    }
}

public class Race {

    public static void main(String[] args) {
        Car car = new Car("MyCar");

        car.speedUp();
        car.nowSpeed();
        car.speedDown();
    }
}
