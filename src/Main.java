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

        // Задание 1, Задача 2.
        System.out.println("Задание 1, Задача 2.");

        int n = 0;
        while (n < 10){
            n = n+1;
            System.out.print(n + " ");
        }
        System.out.println();

        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
    }
}