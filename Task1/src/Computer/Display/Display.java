package Computer.Display;

public class Display {
    private DisplayType displayType;
    private double diagonal;
    private double weight;

    @Override
    public String toString() {
        return "Computer.Display.Display{" +
                "displayType=" + displayType +
                ", diagonal=" + diagonal +
                ", weight=" + weight +
                '}';
    }

    public Display(DisplayType displayType, double diagonal, double weight) {
        this.displayType = displayType;
        this.diagonal = diagonal;
        this.weight = weight;
    }

    public DisplayType getDisplayType() {
        return displayType;
    }

    public void setDisplayType(DisplayType displayType) {
        this.displayType = displayType;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
