import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int counter = 0;
        double result = 0;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (counter == 0) {
                System.out.println("Put value");
                result = scanner.nextDouble();
                counter++;
            }
            System.out.println("Put operation");
            String operation = scanner.next();

            if (operation.equals("=")) {
                break;
            }
            System.out.println("Put value");
            double b = scanner.nextDouble();

            Calculator calculator = new Calculator();
            result = calculator.calculate(result, b, operation);
        }

        System.out.println("Result:" + result);
    }
}
