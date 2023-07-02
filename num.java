package dz2_1;

/*
Задача 1:
Напишите программу, которая запрашивает у пользователя число и проверяет,
является ли оно положительным. Если число отрицательное или равно нулю,
программа должна выбрасывать исключение InvalidNumberException с сообщением
"Некорректное число". В противном случае, программа должна выводить сообщение
"Число корректно".
 */
//import java.io.file;

import java.util.Scanner;
public class num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное число: ");
        int num = scanner.nextInt();

        try {
            validateNum(num);
            System.out.println("Корректный ввод ");
        } catch (InvalidNumberException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static void validateNum(Integer num) throws InvalidNumberException {
        if (num <= 0) {
            throw new InvalidNumberException("Некорректное число");
        }

    }
    static class InvalidNumberException extends Exception {
        public InvalidNumberException(String message) {
                super(message);
        }
    }
}


