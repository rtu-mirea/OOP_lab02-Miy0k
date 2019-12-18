package com.company;
import org.w3c.dom.Text;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int b = 1;
        Scanner in = new Scanner(System.in);
        while(b != 0){
            System.out.println("1 Вариант на String");
            System.out.println("2 Вариант на StringBuffer");
            System.out.println("3 Вариант на Регулярные выражения");
            System.out.println("Для завершения программы нажмите цифру 0");
            System.out.print("Выберите вариант: ");
            b = in.nextInt();
            switch (b){
                case 0:
                    System.out.print("End of working");
                    break;
                case 1:
                    testStringClass(in);
                    break;
                case 2:
                    testStringBuilderClass(in);
                    break;
                case 3:
                    testRegularExpressionsClass(in);
                    break;
                default:
                    System.out.println("Вы ввели недопустимую конструкцию!");
                    break;
            }
        }
    }
    static void testStringClass(Scanner in) {
        com.company.FirstTask object = new com.company.FirstTask();
        int OK = 8;
        while (OK != 0){
            System.out.println("Введите цифру 0 если хотите вернуться в предидущее меню");
            System.out.println("1 Ввод строки");
            System.out.println("2 Вывод строки");
            System.out.println("3 Задание");
            System.out.println("4 Задание");
            System.out.println("5 Задание");
            System.out.println("6 Задание");
            System.out.print("Выберете задание: ");
            OK = in.nextInt();
            switch(OK){
                case 0:
                    System.out.println("Возвращение к предыдущему меню...");
                    break;
                case 1:
                    System.out.println("Введите текст: ");
                    in.nextLine();
                    String str = in.nextLine();
                    object.input(str);
                    break;
                case 2:
                    System.out.println(object.get());
                    break;
                case 3:
                    object.paragraphDivision();
                    System.out.println("Текст разделенный на параграфы:\n" + object.get());
                    break;
                case 4:
                    object.toUpperWords();
                    System.out.println("Текст с прописными буквами:\n" + object.get());
                    break;
                case 5:
                    System.out.print("Введите номер абзаца: ");
                    int i = in.nextInt();
                    System.out.println("Количество слов в абзаце №" + i + " с содержанием \"ам\" равно " + object.findAmIn(i));
                    break;
                case 6:
                    System.out.println("Новая строка с включенным количеством слов:\n" + object.wordNum());
                    break;
                default:
                    System.out.println("Вы ввели недопустимую конструкцию!");
                    break;
            }
        }
    }
    static void testStringBuilderClass(Scanner in) {
        com.company.SecondTask object = new com.company.SecondTask();
        int OK = 8;
        while (OK != 0){
            System.out.println("Введите цифру 0 если хотите вернуться в предидущее меню");
            System.out.println("1 Ввод строки");
            System.out.println("2 Вывод строки");
            System.out.println("3 Задание");
            System.out.println("4 Задание");
            System.out.println("5 Задание");
            System.out.println("6 Задание");
            System.out.print("Выберете задание: ");
            OK = in.nextInt();
            switch(OK){
                case 0:
                    System.out.println("Возвращение к предыдущему меню...");
                    break;
                case 1:
                    System.out.println("Введите текст: ");
                    in.nextLine();
                    String str = in.nextLine();
                    object.input(new StringBuilder(str));
                    break;
                case 2:
                    System.out.println(object.get());
                    break;
                case 3:
                    object.paragDivision();
                    System.out.println("Текст разделенный на параграфы:\n" + object.get());
                    break;
                case 4:
                    object.toUpperWords();
                    System.out.println("Текст с прописными буквами:\n" + object.get());
                    break;
                case 5:
                    //ривет мир. я иван люблю делать ам! ам ам ам 3 раза сказал ам всего 4? ам было в 3 абзаце, вот!
                    object.paragCount();
                    System.out.println("Текст с добавленным предложением:\n" + object.get());
                    break;
                default:
                    System.out.println("Вы ввели недопустимую конструкцию!");
                    break;
            }
        }
    }
    static void testRegularExpressionsClass(Scanner in) {
        com.company.ThirdTask object = new com.company.ThirdTask();
        int OK = 8;
        while (OK != 0){
            System.out.println("Введите цифру 0 если хотите вернуться в предидущее меню");
            System.out.println("1 Ввод строки");
            System.out.println("2 Вывод строки" );
            System.out.println("3 Задание 1");
            System.out.println("Выберите задание: ");
            OK = in.nextInt();
            switch (OK){
                case 0:
                    System.out.println("Возвращение к предыдущему меню...");
                    break;
                case 1:
                    System.out.println("Введите текст: ");
                    in.nextLine();
                    String str = in.nextLine();
                    object.inputText(str);
                    break;
                case 2:
                    System.out.println("Ваш текст:\n" + object.ghetText());
                    break;
                case 3:
                    object.changeNum();
                    System.out.println("Измененный текст:\n" + object.ghetText());
                    break;
                default:
                    System.out.println("Вы ввели недопустимую конструкцию!");
                    break;
            }
        }
    }
}

