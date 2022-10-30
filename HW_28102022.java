package HW_28102022;

public class HW_28102022 {

    public static void getNumber() {
        int count = 0;
        //Метод FOR
        for (int a =0; a <=163;) {
            a = a + (5-1);  //число этажей
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        getNumber();
        getNumber1();
        getNumber2();

    }
    public static void getNumber1() {
        int count1 = 0;
        int a =0;
        //Метод WHILE
        while (a <=163) {
            a = a + (5-1);  //число этажей
            count1++;
        }
        System.out.println(count1);
    }
    public static void getNumber2() {
        int countD = 0;
        int a =0;
        //Метод DO WHILE
        do {
            a = a + (5 - 1);  //число этажей
            countD++;
        }
        while (a <=163);
        System.out.println(countD);
    }


}
