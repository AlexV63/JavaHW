package Consult_211022;

import java.util.Scanner;

public class HW_211022 {
//    public static void main(String[] args) {

//       int a = 1; // эспрессо
//        int b = 2; // американо
//        int a = 3; // капуччино
//        int a = 4; // чай

    void getCoffee(int button) {
        switch (button) {
            case 1 -> System.out.println("Приготовление эспрессо");
            case 2 -> System.out.println("Приготовление американо - эспрессо + добавление воды.");
            case 3 -> System.out.println("Приготовление капучино - эспрессо + добавление вспененного молока.");
            case 4 -> System.out.println("Приготовление чая - выбор чайного пакетика + добавление воды.");
            default -> System.out.println("Ошибка выбора напитка.");
        }
    }
    public static void main(String[] args) {
        HW_211022 hw211022 = new HW_211022();

        hw211022.getCoffee(new Scanner(System.in).nextInt());

    }

}
