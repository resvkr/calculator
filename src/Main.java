import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Lets begin");
        System.out.println("Enter first value");
        double x = myObj.nextDouble();
        myObj.nextLine();
        System.out.println("Enter operation");
        String operation = myObj.nextLine();
        System.out.println("Enter second value");
        double y = myObj.nextDouble();

        Calculator calculator = new Calculator();

        double result = calculator.calculate(x, y, operation);

        System.out.println("Result:" + result);

    }
}