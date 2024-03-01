public class Multiplication implements Operation {
    @Override
    public ComplexNumber execute(ComplexNumber operand1, ComplexNumber operand2) {
        return operand1.multiply(operand2);
    }
}
