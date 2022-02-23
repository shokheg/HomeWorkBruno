package homeWork5.Task2;

public class Drum implements MusicInstrument{

   private int drumSize;

    @Override
    public void play() {
        System.out.println("Играет барабан размером " + drumSize + " дюймов.");
    }
}
