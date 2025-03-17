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

        //Новые задачи
        // Задача 1: Накопления с фиксированной суммой
        int totalSavings = 0;
        int monthlyDeposit = 15000;
        int targetAmount = 2459000;
        int months = 0;
        while (totalSavings < targetAmount) {
            totalSavings += monthlyDeposit;
            months++;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + totalSavings + " рублей");
        }

        // Задача 2: Вывод чисел с помощью циклов
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();

        // Задача 3: Население через 10 лет
        int population = 12000000;
        int birthRate = 17;  // на 1000 человек
        int deathRate = 8;   // на 1000 человек
        for (int year = 1; year <= 10; year++) {
            population += (population / 1000) * (birthRate - deathRate);
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        // Задача 4: Накопления с процентами
        double depositAmount = 15000;
        double bankRate = 1.07; // 7% в месяц
        int monthCount = 0;
        while (depositAmount < 12000000) {
            depositAmount *= bankRate;
            monthCount++;
            System.out.println("Месяц " + monthCount + ", сумма накоплений равна " + (int) depositAmount);
        }

        // Задача 5: Вывод накоплений каждые 6 месяцев
        depositAmount = 15000;
        monthCount = 0;
        while (depositAmount < 12000000) {
            depositAmount *= bankRate;
            monthCount++;
            if (monthCount % 6 == 0) {
                System.out.println("Месяц " + monthCount + ", сумма накоплений равна " + (int) depositAmount);
            }
        }

        // Задача 6: Накопления каждые полгода в течение 9 лет
        depositAmount = 15000;
        for (int monthsPassed = 1; monthsPassed <= 9 * 12; monthsPassed++) {
            depositAmount *= bankRate;
            if (monthsPassed % 6 == 0) {
                System.out.println("Прошло " + (monthsPassed / 6) + " полгода, сумма накоплений: " + (int) depositAmount);
            }
        }

        // Задача 7: Определение пятниц
        int firstFriday = 3; // Например, 3-е число - первая пятница месяца
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }

        // Задача 8: Пролет кометы
        int currentYear = 2024;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        for (int year = 0; year <= endYear; year += 79) {
            if (year >= startYear) {
                System.out.println(year);
            }
        }
    }
}