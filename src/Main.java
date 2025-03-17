public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // Задача 1: Вывести числа от 1 до 10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Задача 2: Вывести числа от 10 до 1
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Задача 3: Вывести четные числа от 0 до 17
        for (int i = 0; i <= 17; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Задача 4: Вывести числа от 10 до -10
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Задача 5: Вывести високосные года от 1904 до 2096
        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год является високосным");
        }
        System.out.println();

        // Задача 6: Вывести последовательность кратных 7 чисел
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Задача 7: Вывести степенную последовательность на 2
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Задача 8: Накопления по 29 000 в месяц
        int savings = 0;
        for (int month = 1; month <= 12; month++) {
            savings += 29000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей");
        }
        System.out.println();

        // Задача 9: Накопления с процентами 12% годовых (1% в месяц)
        double savingsWithInterest = 0;
        for (int month = 1; month <= 12; month++) {
            savingsWithInterest += 29000;
            savingsWithInterest *= 1.01; // Увеличение на 1%
            System.out.println("Месяц " + month + ", сумма накоплений равна " + (int) savingsWithInterest + " рублей");
        }
        System.out.println();

        // Задача 10: Таблица умножения на 2
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (2 * i));
        }
    }
}