package HW_251022;

import java.util.Scanner;

public class hw_251022 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите целое положительное число");

        int a = scanner.nextInt();

        int s = 0;

        for (int i=0; i<=a; i++) {
            s= s +i;
        }

        System.out.println("Сумма всех чисел по введенное число равна " +s);



    }





}
