
import java.util.HashMap;
import java.util.Map;

public class Example1_IfElseCalculator_refactored {
    private final Map<String, CalculationStrategy> strategies = new HashMap<>();

    public Example1_IfElseCalculator() {
        strategies.put("sum", new AdditionStrategy());
        strategies.put("sub", new SubtractionStrategy());
        strategies.put("mul", new MultiplicationStrategy());
        strategies.put("div", new DivisionStrategy());
    }

    public int calculate(String operation, int a, int b) {
        CalculationStrategy strategy = strategies.get(operation);
        if (strategy == null) {
            return 0;
        }
        return strategy.execute(a, b);
    }

    interface CalculationStrategy {
        int execute(int a, int b);
    }

    static class AdditionStrategy implements CalculationStrategy {
        @Override
        public int execute(int a, int b) {
            return a + b;
        }
    }

    static class SubtractionStrategy implements CalculationStrategy {
        @Override
        public int execute(int a, int b) {
            return a - b;
        }
    }

    static class MultiplicationStrategy implements CalculationStrategy {
        @Override
        public int execute(int a, int b) {
            return a * b;
        }
    }

    static class DivisionStrategy implements CalculationStrategy {
        @Override
        public int execute(int a, int b) {
            return a / b;
        }
    }
}
