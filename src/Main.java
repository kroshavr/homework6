public class Main {
    public static void main(String[] args) {
//Блок 1
    //Задание
        for (int i = 1; i <= 10; i++)
        System.out.println(i);
    //Задание 2
        for (int a = 10; a >= 1; a--)
            System.out.println(a);
    //Задание 3
        for (int b = 0; b <= 17; b = b + 2)
            System.out.println(b);
    //Задание 4
        for (int c = 10; c >= -10; c--)
            System.out.println(c);
//Блок 2
    //Задание 1
        for (int year = 1904; year <= 2096; year = year + 4)
            System.out.println(year + " год является високосным");
    //Задание 2
        for (int d = 7; d <= 98; d = d + 7)
            System.out.println(d);
    //Задание 3
        for (int e = 1; e <= 512; e = e * 2)
            System.out.println(e);
//Блок 3
    //Задание 1
        int salary = 29000;
        int total = 0;
        for (int f = 1; f <= 12; f++) {
            total = total + salary;
            System.out.println("Месяц " + f + ", сумма накоплений равна " + total + " рублей");
        }
    //Задание 2
        int salary2 = 29000;
        int total2 = 0;
        for (int s = 1; s <= 12; s++) {
            total2 = total2 + total2 / 100;
            total2 = total2 + salary2;
            System.out.println("Месяц " + s + ", сумма накоплений равна " + total2 + " рублей");
        }
    }
}