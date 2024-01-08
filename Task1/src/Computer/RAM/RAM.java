package Computer.RAM;

public class RAM {
    private RAMType memoryType;
    private int capacity;
    private double weight;

    public RAM(RAMType memoryType, int capacity, double weight) {
        this.memoryType = memoryType;
        this.capacity = capacity;
        this.weight = weight;
    }

    public RAMType getMemoryType() {
        return memoryType;
    }

    @Override
    public String toString() {
        return "Computer.RAM.RAM{" +
                "memoryType=" + memoryType +
                ", capacity=" + capacity +
                ", weight=" + weight +
                '}';
    }

    public void setMemoryType(RAMType memoryType) {
        this.memoryType = memoryType;
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
