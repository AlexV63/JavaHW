package HW_181022;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //Создайте две переменные "isWeekend" и "isRain", обе имеют тип boolean, значения которых можно получить из командной строки.
        // Создайте переменную "canWalk", значение которой должно быть истинным,
        // если это выходной день (isWeekend=true) и не идет дождь (isRain=false), и ложным (для переменной "canWalk" в любом другом случае.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сегодня выходной? : ");

        Boolean isWeekend = scanner.nextBoolean();

        System.out.println("Дождь идет? : ");

        Boolean isRain = scanner.nextBoolean();

        Boolean canWalk = false;

        if (isWeekend == true) {
            if  (isRain == false){
                canWalk = true;
                System.out.println("We can walk is true");
        }  else {
                canWalk = false;
                System.out.println("We can walk is false");
           }
        }  else {
            canWalk = false;
            System.out.println("We can walk is false");
        }
    }
}