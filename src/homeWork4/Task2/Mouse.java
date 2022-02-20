package homeWork4.Task2;

public class Mouse {

    private int speed;

    public Mouse(int speed) {
        setSpeed(speed);
    }
    public Mouse() {

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed <= 0)
            throw new IllegalArgumentException("Мышь не двигается. Замените её или установите скорость больше чем 0") ;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "speed=" + speed +
                '}';
    }
}
