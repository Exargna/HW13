package Computer.HardwareDisk;

public class HardwareDisk {
    private HardwareType hardwareType;
    private int capacity;
    private double weight;

    public HardwareDisk(HardwareType hardwareType, int capacity, double weight) {
        this.hardwareType = hardwareType;
        this.capacity = capacity;
        this.weight = weight;
    }

    public HardwareType getHardwareType() {
        return hardwareType;
    }

    @Override
    public String toString() {
        return "Computer.HardwareDisk.HardwareDisk{" +
                "hardwareType=" + hardwareType +
                ", capacity=" + capacity +
                ", weight=" + weight +
                '}';
    }

    public void setHardwareType(HardwareType hardwareType) {
        this.hardwareType = hardwareType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
