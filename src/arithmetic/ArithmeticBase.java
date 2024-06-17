/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

public class ArithmeticBase {
    public enum Operation {
        PLUS, MINUS, TIMES, DIVIDE
    }

    public double x, y;

    double calculate(double x, double y, Operation op) {
        switch (op) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                if (y == 0) {
                    throw new IllegalArgumentException("Cannot divide by zero.");
                }
                return x / y;
            default:
                throw new AssertionError("Unknown operation " + op);
        }
    }
}