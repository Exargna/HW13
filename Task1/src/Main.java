import Calculator.ArithmeticCalculator;
import Calculator.Operation;
import Computer.*;
import Computer.Display.Display;
import Computer.Display.DisplayType;
import Computer.HardwareDisk.HardwareDisk;
import Computer.HardwareDisk.HardwareType;
import Computer.Keyboard.Keyboard;
import Computer.Keyboard.KeyboardBacklight;
import Computer.Keyboard.KeyboardType;
import Computer.Processor.Processor;
import Computer.Processor.ProcessorCores;
import Computer.Processor.ProcessorFrequency;
import Computer.Processor.ProcessorMaker;
import Computer.RAM.RAM;
import Computer.RAM.RAMType;

public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator calculator = new ArithmeticCalculator(15, 3);

        //Сложение
        calculator.calculate(Operation.ADD);
        //Вычитание
        calculator.calculate(Operation.SUBTRACT);
        //Умножение
        calculator.calculate(Operation.MULTIPLY);
        //Деление
        calculator.calculate(Operation.DIVIDE);

        Processor processor = new Processor(ProcessorFrequency.HIGH, ProcessorCores.SIX, ProcessorMaker.AMD, 0.1);
        Display display = new Display(DisplayType.IPS, 27, 2);
        RAM ram = new RAM(RAMType.DDR5, 16, 0.2);
        HardwareDisk hardwareDisk = new HardwareDisk(HardwareType.SSD, 1024, 0.2);
        Keyboard keyboard = new Keyboard(KeyboardType.MEHANICAL, KeyboardBacklight.BACKLIT, 0.3);
        Computer computer = new Computer(processor, ram, hardwareDisk, display, keyboard, "ASUS", "ULTRA");
        System.out.println("Вес компьютера: " + computer.calculateTotalWeight() + "кг");
        System.out.println(computer);




    }
}