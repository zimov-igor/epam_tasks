package practice5_my;

import java.util.Arrays;

public class Guitar implements MusicInstrument {
    private StringInterface[] strings;

    public Guitar(int quantity) {
        strings = new StringInterface[quantity];
        for (int i = 0; i < quantity; i++){
          strings[i]= GuitarStringFactory.getGuitarString(i + 1);

        }
    }

    @Override
    public boolean increaseTonality(int position) {
        position -= 1;
        if (strings[position].getTonality() < 9 && (strings[position].getTonality() !=0)) {
            int temp = strings[position].getTonality();
            strings[position].setTonality(++temp);
            return true;
        }
        else if (strings[position].getTonality() == 9){
            strings[position].setTonality(10);
            System.out.println("Maximum tonality" + "\n" + "not to increase the longer");
            return true;
        }
        else if (strings[position].getTonality() == 10){
            deleteString(position + 1);
            return false;
        }
        else{
            System.out.println("You must insert string");
            return false;
        }
    }

    @Override
    public boolean decreaseTonality(int position) {
        position -= 1;
        if (strings[position].getTonality() == 1){
            System.out.println("Tonality is minimum");
            return false;
        }
        else {
            int temp = strings[position].getTonality();
            strings[position].setTonality(--temp);
            return true;
        }
    }

    @Override
    public String play() {
        StringBuilder b = new StringBuilder();
        for (StringInterface g: strings) {
            b.append(g.makeSound() + " ");
            //System.out.print(g.makeSound() + " ");
        }
        b.append("\n");
        //System.out.println();
        return b.toString();
    }

    @Override
    public String play(int position) {
        position -= 1;
        //System.out.println(strings[position].makeSound());
        return strings[position].makeSound();
    }

    @Override
    public boolean deleteString(int position) {
        position -= 1;
        if((strings[position] != null) || (strings[position].getDiameter() != 0)) {
            strings[position] = GuitarStringFactory.getGuitarString(0);
            System.out.println("You have deleted string on the place " + (position + 1));
            return true;
        }
        else{
            System.out.println("empty");
            return false;

        }
    }

    @Override
    public boolean insertString(int position, int typeString) {
        position -= 1;
        if ((strings[position] == null) || (strings[position].getDiameter() == 0)){
            strings[position] = GuitarStringFactory.getGuitarString(typeString);
            return true;
        }
        else{
            System.out.println("This place is not empty");
            return false;
        }
    }

    @Override
    public boolean insertString(int position, StringInterface g) {
        position -= 1;
        if ((strings[position] == null) || (strings[position].getDiameter() == 0)){
            strings[position] = g;
            return true;
        }
        else{
            System.out.println("This place is not empty");
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Guitar guitar = (Guitar) o;

        return Arrays.equals(strings, guitar.strings);

    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(strings);
    }

    @Override
    public String toString(){
        StringBuilder b = new StringBuilder();
        b.append("Guitar { \n");
        for (StringInterface g: strings) {
            b.append(g.toString() + "\n");
        }
        b.append("};");
        return b.toString();
    }
}
