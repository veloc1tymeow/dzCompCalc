public class ComplexCalculator {
    private Operation operation;

    public ComplexCalculator(Operation operation) {
        this.operation = operation;
    }

    public ComplexNumber calculate(ComplexNumber operand1, ComplexNumber operand2) {
        System.out.println("Calculating " + operand1 + " " + operation.getClass().getSimpleName() + " " + operand2);
        return operation.execute(operand1, operand2);
    }
}
