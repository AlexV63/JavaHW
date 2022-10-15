package HW_111022;

import java.util.Scanner;

public class Main {

// First level: 1. введите слово, используя сканер, состоящий из четного количества букв (проверьте количество букв в слове - вывести в консоль количество).
// Получить слово, состоящее из первой половины слова и второй половины слова. Распечатайте их в консоль.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");
        String line = scanner.nextLine();

        int length = line.length( ); // length == четное число
        int x = length / 2;
        int y = length % 2;

        if (y == 0)
            System.out.println(length);
        else System.out.println("Слово с нечетным количеством букв");

        String front = line.substring(0, length / 2);
        String end = line.substring(length / 2);

        System.out.println(front);
        System.out.println(end);

//        Реализовать класс с функционалом, который выводит на экран результаты сложения, вычитания, умножения и деления двух чисел.
//        Каждая из арифметических операций должна быть реализована как отдельный метод.

        System.out.println("Введите число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);


//        Реализовать метод, который конвертирует сумму в евро в эквивалент долларов США (выберите курс, который соответствует дню,
//        в который Вы выполняете это задание)

        System.out.println("Введите сумму");
        Double EUR = scanner.nextDouble();

        System.out.println("Введите курс");
        Double rate = scanner.nextDouble();

        System.out.println("USD " + (EUR*rate));


    }
}
