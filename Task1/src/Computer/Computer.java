package Computer;

import Computer.Display.Display;
import Computer.HardwareDisk.HardwareDisk;
import Computer.Keyboard.Keyboard;
import Computer.Processor.Processor;
import Computer.RAM.RAM;

public class Computer {
    private Processor processor;
    private RAM ram;
    private HardwareDisk hardwareDisk;
    private Display display;
    private Keyboard keyboard;
    private String vendor;
    private String name;


    public Computer(Processor processor,
                    RAM ram,
                    HardwareDisk hardwareDisk,
                    Display display,
                    Keyboard keyboard,
                    String vendor,
                    String name) {
        this.processor = processor;
        this.ram = ram;
        this.hardwareDisk = hardwareDisk;
        this.display = display;
        this.keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;
    }

    public Computer(Processor processor,
                    Display display,
                    RAM ram, HardwareDisk hardwareDisk,
                    Keyboard keyboard) {
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public HardwareDisk getHardwareDisk() {
        return hardwareDisk;
    }

    public void setHardwareDisk(HardwareDisk hardwareDisk) {
        this.hardwareDisk = hardwareDisk;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Computer.Computer{" +
                "processor=" + processor +
                ", ram=" + ram +
                ", hardwareDisk=" + hardwareDisk +
                ", display=" + display +
                ", keyboard=" + keyboard +
                ", vendor='" + vendor + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    public double calculateTotalWeight() {
        return processor.getWeight() +
                display.getWeight() +
                keyboard.getWeight() +
                hardwareDisk.getWeight() +
                ram.getWeight();
    }
}
