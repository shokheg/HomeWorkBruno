package homeWork5.Task2;

public class Trumpet implements MusicInstrument{

   private int trumpetDiam;

    @Override
    public void play() {
        System.out.println("Играет труба диаметром " + trumpetDiam + " см.");
    }
}
