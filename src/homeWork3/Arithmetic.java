package homeWork3;

public class Arithmetic {
     int x;
     int y;

    public void setX(int x) {
        if (this.x<=0) {
            System.out.println("Вы должны ввести значение больше 0");

        } else {
            this.x = x;
        }
    }

    public void setY(int y) {
        if (this.y<=0) {
            System.out.println("Вы должны ввести значение больше 0");

        } else {
            this.y = y;
        }
    }
}
