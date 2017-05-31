package practice5_my;


public class GuitarString implements StringInterface {
    public final static int DEFAULT_TONALITY = 5;
    private String name;
    private int diameter;
    private int tonality; //(min = 1, max = 10)
    private String description;

    public GuitarString(){
        this.tonality = 0;
        this.name = "empty";
        this.diameter = 0;
        this.description = "empty";
    }

    public GuitarString(String name, int diameter, String description) {
        this.tonality = DEFAULT_TONALITY;
        this.name = name;
        this.diameter = diameter;
        this.description = description;
    }

    public GuitarString(String name, int diameter, String description, int tonality) {
        this(name, diameter, description);
        this.tonality = tonality;
    }

    @Override
    public String getNameNote() {
        return name;
    }

    @Override
    public int getDiameter() {
        return diameter;
    }

    @Override
    public int getTonality() {
        return tonality;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setTonality(int tonality) {
        this.tonality = tonality;
    }

    @Override
    public String makeSound() {
        return (getNameNote() + " " +getTonality());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GuitarString that = (GuitarString) o;

        if (diameter != that.diameter) return false;
        if (tonality != that.tonality) return false;
        return name.equals(that.name) && description.equals(that.description);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + diameter;
        result = 31 * result + tonality;
        result = 31 * result + description.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "GuitarString{" +
                "Name = '" + name + '\'' +
                ", Diameter = " + diameter +
                ", Tonality = " + tonality +
                ", Description = '" + description + '\'' +
                '}';
    }
}
