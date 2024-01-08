package Calculator;

public class ArithmeticCalculator {
    private final double number1;
    private final double number2;
    double result;

    public ArithmeticCalculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void calculate(Operation operation) {
        if (operation == Operation.ADD) {
           result = number1 + number2;
           System.out.println("Результат сложения: " + result);
        } else if (operation == Operation.SUBTRACT) {
            result = number1 - number2;
            System.out.println("Результат вычитания: " + result);
        } else if (operation == Operation.MULTIPLY) {
            result = number1 * number2;
            System.out.println("Результат умножения: " + result);
        } else if (operation == Operation.DIVIDE) {
            result = number1 / number2;
            System.out.println("Результат деления: " + result);
        } else {
            System.out.println("Неверная команда!");
        }
    }
}
