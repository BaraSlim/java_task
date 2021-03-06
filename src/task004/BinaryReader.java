package task004;
import java.util.Scanner;

/**
 *      Ввести с консоли число в бинарном формате.
 *      Перевести его в десятичный формат, записать в переменную int и вывести на экран.
 * */

public class BinaryReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                        //Инициировать объект класса Scanner
        System.out.println("Введите число в бинарном формате: ");   //Предложение к действию
        String bin = sc.nextLine();                                 //Получаем введенное число из консоли
        int binNum = Integer.parseInt(bin, 2);                //Перевод bin в десят. формат
        System.out.println("Ваше число = " + binNum);                                 //Вывод результата на экран
        System.out.println("Спасибо, что воспользовались нашим конвертером!");
    }
}