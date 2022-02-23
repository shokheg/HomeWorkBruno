package homeWork5.Task2;

public class Guitar implements MusicInstrument{

    private int numberOfStrings;

    @Override
    public void play() {
        System.out.println("Играет гитара с " + numberOfStrings + " струнами.");
    }
}
