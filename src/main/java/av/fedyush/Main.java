package av.fedyush;



public class Main {
    public static void main(String[] args) {

        // поупражняться с математическими и логическими операторами, добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль)

        int a = 56;
        int b = 10;

        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Умножение: " + (a * b));
        System.out.println("Деление без остатка: " + (a / b));
        System.out.println("Остаток от деления: " + (a % b));

        if (b > a) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }

        // переполнение

        byte aByte = -128;
        int bInt = Integer.MIN_VALUE;
        System.out.println("Переполнение byte: " + (aByte - 1 ));
        System.out.println("Переполнение int: " + (bInt + 1));

        //попробовать вычисления комбинаций типов данных (int и double)

        int d = 123;
        double f = 79.23;
        System.out.println("Сложение int и double: " + (d + f));
        System.out.println("Вычитание int и double: " + (f - d));
        System.out.println("Умножение int и double: " + (d * f));
        System.out.println("Деление int и double: " + (d / f));
    }

    }
