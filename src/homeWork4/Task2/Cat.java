package homeWork4.Task2;

import java.util.Arrays;

public class Cat {

    private String name;
    private String color;
    private int speed;
    private int weight;
    private Mouse[] mouses;

    public Cat(int speed, int weight) {
        setSpeed(speed);
        setWeight(weight);
        this.mouses = new Mouse[20];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().length() < 2) {
            throw new IllegalArgumentException("Слишком короткое имя");
        }
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed <= 0)
            throw new IllegalArgumentException("Кот не должен стоять на месте, он ловит мышей. Установите скорость больше чем 0");
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight <= 0)
            throw new IllegalArgumentException("Кот слишком легкий. Сделайте его потяжелее, иначе его унесут мыши");
        this.weight = weight;
    }

    public Mouse[] getMouses() {
        return mouses;
    }

    public void setMouses(Mouse[] mouses) {
        this.mouses = mouses;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                ", mouses=" + Arrays.toString(mouses) +
                '}';
    }

    public void catchTheMouse(Mouse mouse) {
        boolean isEmpty = false;
        int indexOfFirstEmptySlot = 0;
        if (mouse.getSpeed() <= this.speed) {
            for (int i = 0; i < mouses.length; i++) {
                if (mouses[i] == null) {
                    isEmpty = true;
                    indexOfFirstEmptySlot = i;
                    break;
                }
            }
            if (isEmpty) {
                mouses[indexOfFirstEmptySlot] = mouse;
                System.out.println("Мышь поймана и уложена в слот № " + indexOfFirstEmptySlot);
            }

        } else {
            System.out.println("Мышь убежала");
        }


    }


    public void catAttack(Cat cat) {


        if (cat.getWeight() < this.weight) {

            Mouse[] temp = cat.getMouses();
            Mouse[] catchedMouses = new Mouse[20];

            for (int i = 0; i < temp.length; i++) {
                if (temp[i] != null && temp[i].getSpeed() < this.speed) {
                    catchedMouses[i] = temp[i];
                    temp[i] = null;
                    System.out.println("Атака удалась!");

                }
            }

            cat.setMouses(temp);

            Mouse[] both = Arrays.copyOf(this.getMouses(), this.getMouses().length + catchedMouses.length);
            System.arraycopy(catchedMouses, 0, both, this.getMouses().length, catchedMouses.length);

            for (int i = 0; i < both.length; i++) {
                System.out.print(both[i] + " both ");
            }

            this.setMouses(both);

        }

    }


}