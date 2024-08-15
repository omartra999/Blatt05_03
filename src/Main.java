import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> values = new ArrayList<>();
        while (true){
            System.out.println("enter a value");
            String userInput = scanner.nextLine().trim();

            switch (userInput){
                case "show":
                    System.out.println(values);

                case "prod":
                   double product = 1;
                    for (double value: values) {
                        product *= value;
                    }
                    System.out.println("product is: " + product);
                    values.clear();

                case "sum":
                    double sum = 0;
                    for (double value: values) {
                        sum += value;
                    }
                    System.out.println("sum is: " + sum);
                    values.clear();

                case "quit":
                    break;

                default:
                    double number = Double.parseDouble(userInput);
                    values.add(number);
            }

        }
}
}
