package src.interfaces;

public class Main {
    public static void main(String[] args) {
    // Car car=new Car();

    // car.start();
    // car.acc();car.stop();

        NiceCar car=new NiceCar();
        car.start();
        car.stopMusic();
        car.upgradeEngine();
        car.start();

    }
}
