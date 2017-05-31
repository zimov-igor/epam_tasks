package practice5_my;

/**
 * Created by PC on 13.11.2016.
 */
public class Loader {
    public static void main(String[] args) {
       MusicInstrument guitar = new Guitar(7);
       MusicInstrument guitar1 = new Guitar(7);

        System.out.println(guitar.play());
        System.out.println(guitar.play(1));
        System.out.println();

        System.out.println(guitar.hashCode());
        System.out.println(guitar1.hashCode());
        System.out.println(guitar.equals(guitar1));

        guitar.increaseTonality(1);

        System.out.println(guitar.hashCode());
        System.out.println(guitar1.hashCode());
        System.out.println(guitar.equals(guitar1));
    }
}
