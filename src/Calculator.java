public class Calculator {
    double calculate(double a, double b, String operation_temp) {
        double result_temp = 0;

        switch (operation_temp) {
            case "+" -> result_temp = add(a, b);
            case "-" -> result_temp = a - b;
            case "*" -> result_temp = a * b;
            case "/" -> result_temp = a / b;
            case "%" -> result_temp = a % b;
            case "^" -> result_temp = Math.pow(a, b);
            default -> System.out.println("Wrong parametr");
        }
        return result_temp;
    }

    double add(double a, double b) {
        return a + b;
    }
}