package homeWork4.Task2;

public class Task2 {
    public static void main(String[] args) {

        Cat cat1 = new Cat(12,10);
        Cat catBig = new Cat(6,25);
        Mouse mouse1 = new Mouse(11);
        Mouse mouseSlow = new Mouse(5);
        cat1.catchTheMouse(mouse1);
        cat1.catchTheMouse(mouse1);
        catBig.catchTheMouse(mouse1);
        catBig.catchTheMouse(mouseSlow);
        cat1.catchTheMouse(mouseSlow);
        cat1.catchTheMouse(mouseSlow);
        cat1.catchTheMouse(mouseSlow);
        cat1.catchTheMouse(mouseSlow);
        System.out.println(catBig);
        System.out.println(cat1);
        catBig.catAttack(cat1);
        System.out.println(catBig);
        System.out.println(cat1);


    }

}
