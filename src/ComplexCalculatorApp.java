public class ComplexCalculatorApp {
    public static void main(String[] args) {
        ComplexNumber complex1 = new ComplexNumber(1, 2);
        ComplexNumber complex2 = new ComplexNumber(3, 4);

        Operation addition = new Addition();
        ComplexCalculator calculator = new ComplexCalculator(addition);

        ComplexNumber result = calculator.calculate(complex1, complex2);

        System.out.println("Result: " + result);
    }
}
