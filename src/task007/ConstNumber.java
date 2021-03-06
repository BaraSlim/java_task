package task007;

import java.util.Scanner;

/**
 *      Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число в переменную number.
 *      В программе должны присутствовать константы X, Y, Z.
 *      Программа должна сравнивать введенное значение с клавиатуры со значением констант и вывести на экран сообщение
 *      Данное значение имеется в константах" если number=X или Y или Z.
 *      Если переменная отличается от констант, нужно вывести оповещение "Такой константы нет!"
 * */

public class ConstNumber {
    public static void main(String[] args) {
        final int X_CONST=668;
        final int Y_CONST=233;
        final int Z_CONST=75;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        int userNumber = scanner.nextInt();
        switch (userNumber){
            case X_CONST:
            case Y_CONST:
            case Z_CONST:
                System.out.println("Данное значение имеется в константах");
            break;
            default:
                System.out.println("Такой константы нет!");
        }
    }
}