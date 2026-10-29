
package org.example;

import java.util.Scanner;

public class Main {

    public static double parseNumber(String text) {
        return Double.parseDouble(text.trim().replace(',', '.'));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {

            System.out.println("\n=== CALCULATOR ===");
            System.out.println("1. Додавання");
            System.out.println("2. Віднімання");
            System.out.println("3. Множення");
            System.out.println("4. Ділення");
            System.out.println("0. Вихід");

            System.out.print("Оберіть операцію: ");
            String choice = scanner.nextLine().trim();

            if (choice.equals("0")) {
                break;
            }

            try {
                System.out.print("Введіть перше число: ");
                double a = parseNumber(scanner.nextLine());

                System.out.print("Введіть друге число: ");
                double b = parseNumber(scanner.nextLine());

                double result;

                switch (choice) {
                    case "1":
                        result = calculator.add(a, b);
                        break;

                    case "2":
                        result = calculator.subtract(a, b);
                        break;

                    case "3":
                        result = calculator.multiply(a, b);
                        break;

                    case "4":
                        result = calculator.divide(a, b);
                        break;

                    default:
                        throw new InvalidInputException(
                                "Невідома операція!");
                }

                System.out.println("Результат: " + result);

            } catch (NumberFormatException e) {
                System.out.println("Помилка: введіть число!");

            } catch (ArithmeticException e) {
                System.out.println("Помилка: " + e.getMessage());

            } catch (InvalidInputException e) {
                System.out.println("Помилка: " + e.getMessage());

            } finally {
                System.out.println("Обробку запиту завершено.");
            }
        }

        scanner.close();
        System.out.println("Програму завершено.");
    }
}
