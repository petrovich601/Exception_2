package dz2_2;

import java.util.Scanner;
public class division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите делимое а: ");
        double a = scanner.nextDouble();
        System.out.println("Введите делитель b: ");
        double b = scanner.nextDouble();
        try {
            validateB(b);
            System.out.println("a / b = " + a / b);
        } catch (DivisionByZeroException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static void validateB(Double b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }

    }
    static class DivisionByZeroException extends Exception {
        public DivisionByZeroException(String message) {
            super(message);
        }
    }

}
