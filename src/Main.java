public class Main {
    public static void main(String[] args) {

        // Задание 1, Задача 1.
        System.out.println("Задание 1, Задача 1.");

        int income = 15_000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + total / 100;
            total = total + income;
            i = i + 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }

        System.out.println();

        // Задание 1, Задача 2.
        System.out.println("Задание 1, Задача 2.");

        int n = 0;
        while (n < 10) {
            n = n + 1;
            System.out.print(n + " ");
        }
        System.out.println();

        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println();

        // Задание 1, Задача 3.
        System.out.println("Задание 1, Задача 3.");

        int totalPopulationY = 12_000_000; // Численность города Y
        int born = totalPopulationY / 1000 * 17; // Рождаемость 17 человек на 1000 человек
        int died = totalPopulationY / 1000 * 8;  // Смертность 8 человек на 1000 человек
        int grownPopulationY = born - died; // Прирост ежегодный
        int year = 0;
        while (year < 10) {
            totalPopulationY = totalPopulationY + grownPopulationY;
            year = year + 1;
            System.out.println("Год " + year + " численность населения составит " + totalPopulationY + " человек.");
        }
        System.out.println();

        // Задание 2, Задача 1.
        System.out.println("Задание 2, Задача 1.");

        int deposit = 15_000; // Первоначальная сумма
        int startDeposit = 15_000;
        int q = 0;
        while (startDeposit <= 12_000_000) {
            startDeposit = startDeposit + deposit * 7 / 100;
            q = q + 1;
            System.out.println("Месяц " + q + " сумма накоплений " + startDeposit + " рублей.");
        }
        System.out.println();


        // Задание 2, Задача 2.
        System.out.println("Задание 2, Задача 2.");

        int depositV = 15_000; // Первоначальная сумма
        int startDepositV = 15_000;
        int x = 0;
        while (startDepositV <= 12_000_000) {
            startDepositV = startDepositV + depositV * 7 / 100;
            x = x + 1;
            if (x % 6 == 0) {
                System.out.println("Месяц " + x + " сумма накоплений " + startDepositV + " рублей.");
            }
        }
        System.out.println();


        // Задание 2, Задача 3.
        System.out.println("Задание 2, Задача 3.");

        int depositvS = 15_000; // Первоначальная сумма
        int startDepositVS = 15_000;
        int t = 0;
        while (t <= 108) {
            startDepositVS = startDepositVS + depositvS * 7 / 100;
            t = t + 1;
            if (t % 6 == 0) {
                System.out.println("Месяц " + t + " сумма накоплений " + startDepositVS + " рублей.");
            }
        }

        System.out.println();

        // Задание 2, Задача 4.
        System.out.println("Задание 2, Задача 4.");

        int friday = 7;
        int firstFriday = 1;
        for (; firstFriday < 31; firstFriday = firstFriday + friday) {

            System.out.println("Сегодня пятница, " + firstFriday + "-ое число. Необходимо подготовить отчет");
        }
        System.out.println();

        // Задание 3, Задача 1.
        System.out.println("Задание 3, Задача 1.");

        int yearsPast = 2022 - 200;
        int yearComet = 79;
        int yearFinishCalculation = 2022 + 100;
        for (int l = yearsPast; l < yearFinishCalculation; l++) {
            if (l % yearComet == 0) {
                System.out.println("Комета рядом с землей " + l + " году.");
            }
        }

        System.out.println();

            // Задание 3, Задача 2.
        System.out.println("Задание 3, Задача 2.");


            int task = 2;
            int part = 0;
            int w = 0;
            while (w < task * 10) {
                part = part + 1;
                w = w + 2;
                System.out.println(task + " * " + part + " = " + w);
            }
        }
    }