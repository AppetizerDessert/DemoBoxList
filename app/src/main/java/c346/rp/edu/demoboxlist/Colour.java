package c346.rp.edu.demoboxlist;

public class Colour {

    private String colour;

    public Colour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Colour{" +
                "colour='" + colour + '\'' +
                '}';
    }
}
