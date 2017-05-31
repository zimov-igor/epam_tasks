package practice5_my;

public class GuitarStringFactory {
    public static StringInterface getGuitarString(int number){
        StringInterface g;

        switch (number){
            case 1:
                g = new GuitarString("Do", 1, "String 1");
            break;
            case 2:
                g = new GuitarString("Re", 2, "String 2");
            break;
            case 3:
                g = new GuitarString("Me", 3, "String 3");
            break;
            case 4:
                g = new GuitarString("Fa", 4, "String 4");
            break;
            case 5:
                g = new GuitarString("So", 5, "String 5");
            break;
            case 6:
                g = new GuitarString("La", 6, "String 6");
            break;
            case 7:
                g = new GuitarString("Si", 7, "String 7");
            break;
            default: g = new GuitarString("empty", 0, "empty", 0);
        }
        return g;
    }
}
