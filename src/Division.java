public class Division implements Operation {
    @Override
    public ComplexNumber execute(ComplexNumber operand1, ComplexNumber operand2) {
        return operand1.divide(operand2);
    }
}
