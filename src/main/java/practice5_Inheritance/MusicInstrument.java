package practice5_my;

/**
 * Created by PC on 13.11.2016.
 */
public interface MusicInstrument {
    boolean increaseTonality(int position);
    boolean decreaseTonality(int position);
    String play();
    String play(int number);
    boolean insertString(int position, int typeString);
    boolean insertString(int position, StringInterface g);
    boolean deleteString(int position);
}
