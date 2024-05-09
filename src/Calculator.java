public class Calculator {
    double calculate(double a, double b, String operation_temp) {
        double result_temp = 0;

        switch (operation_temp) {
            case "+" -> result_temp = add(a, b);
            case "-" -> result_temp = subtract(a, b);
            case "*" -> result_temp = multiply(a, b);
            case "/" -> result_temp = divide(a, b);
            case "%" -> result_temp = module(a, b);
            case "^" -> result_temp = pow(a, b);
            default -> System.out.println("Wrong parametr");
        }
        return result_temp;
    }

    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }

    double module(double a, double b) {
        return a % b;
    }

    double pow(double a, double b) {
        return Math.pow(a, b);
    }

}