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

        if (operation.equals("sqrt")) {
            System.out.println("√" + x + " = " + Math.sqrt(x));
        } else {
            System.out.println("Enter second value");
            Double y = myObj.nextDouble();
            switch (operation) {
                case "+":
                    System.out.println(x + " + " + y + " = " + (x + y));
                    break;
                case "-":
                    System.out.println(x + " - " + y + " = " + (x - y));
                    break;
                case "*":
                    System.out.println(x + "*" + y + " = " + (x * y));
                    break;
                case "/":
                    System.out.println(x + " / " + y + " = " + (x / y));
                    break;
                case "%":
                    System.out.println(x + "%" + y + " = " + (x % y));
                    break;
                case "^":
                    System.out.println(x + "²" + y + " = " + (Math.pow(x, y)));
                    break;
                default:
                    System.out.println("Wrong operation");


            }

        }

    }
}