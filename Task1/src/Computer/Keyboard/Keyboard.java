package Computer.Keyboard;

public class Keyboard {
    private KeyboardType keyboardType;
    private KeyboardBacklight backlight;
    private double weight;

    public Keyboard(KeyboardType keyboardType, KeyboardBacklight backlight, double weight) {
        this.keyboardType = keyboardType;
        this.backlight = backlight;
        this.weight = weight;
    }

    public KeyboardType getKeyboardType() {
        return keyboardType;
    }

    public void setKeyboardType(KeyboardType keyboardType) {
        this.keyboardType = keyboardType;
    }

    public KeyboardBacklight getBacklight() {
        return backlight;
    }

    public void setBacklight(KeyboardBacklight backlight) {
        this.backlight = backlight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Computer.Keyboard.Keyboard{" +
                "keyboardType=" + keyboardType +
                ", backlight=" + backlight +
                ", weight=" + weight +
                '}';
    }
}
