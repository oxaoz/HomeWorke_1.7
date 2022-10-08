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
            i = i+1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }
        }
    }