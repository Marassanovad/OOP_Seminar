package Seminar_5;

import java.lang.reflect.Array;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Excep {
    Scanner in = new Scanner(System.in);
    logger logg = new logger();


    String action() { // проверка на знак
        List<String> ls = new ArrayList<>(Arrays.asList("+", "-", "*", "/", "5"));
//        System.out.println("Введи действие: ");
        String i;
        while (true) {
            System.out.println("Введи действие: ");
            i = in.next();
//            if (in.hasNext()) {
//                i = in.nextLine();
            if (ls.contains(i)) {
                logg.logger("Пользователь ввел: " + i);
                return i;

            } else {
                logg.logger("Пользователь ввел неправильные данные: " + i);
                System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            }
        }
//        }
    }

    public int getInt() { //проверка на число
        System.out.println("Введите число:");
        int num;
        if (in.hasNextInt()) {
            num = in.nextInt();
            logg.logger("Пользователь ввел: " + num);
        } else {
            String i = in.next();
            logg.logger("Пользователь ввел неправильные данные: " + i);
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
//            in.next();//рекурсия
            num = getInt();
        }
        return num;
    }

    public double getDouble() { //проверка на число
        System.out.println("Введите число:");
        double num;
        if (in.hasNextDouble()) {
            num = in.nextDouble();
            logg.logger("Пользователь ввел: " + num);
        } else {
            String i = in.next();
            logg.logger("Пользователь ввел неправильные данные: " + i);
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
//            in.next();//рекурсия
            num = getDouble();
        }
        return num;
    }

}
