public class Card {
    private String colour;
    private String figure;
    private int value;

    public Card(String figure, String colour, int value){
        this.figure = figure;
        this.colour = colour;
        this.value = value;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getFigure() {
        return figure;
    }

    public void setFigure(String figure) {
        this.figure = figure;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "colour='" + colour + '\'' +
                ", figure='" + figure + '\'' +
                ", value=" + value +
                '}';
    }
}
