import java.util.Scanner;



class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Lets begin");
        System.out.println("Enter first value");
        Double x = myObj.nextDouble();
        myObj.nextLine();
        System.out.println("Enter operation");
        String operation = myObj.nextLine();
        System.out.println("Enter second value");
        Double y = myObj.nextDouble();

        double result = Calculate(x, y, operation);

        System.out.println("Result:" + result);

    }

    public static double Calculate(double a, double b, String operation_temp) {
        double result_temp = 0;

        switch (operation_temp) {
            case "+" -> result_temp = a + b;
            case "-" -> result_temp = a - b;
            case "*" -> result_temp = a * b;
            case "/" -> result_temp = a / b;
            case "%" -> result_temp = a % b;
            case "^" -> result_temp = Math.pow(a, b);
            default -> System.out.println("Wrong parametr");
        }
        return result_temp;
    }
}