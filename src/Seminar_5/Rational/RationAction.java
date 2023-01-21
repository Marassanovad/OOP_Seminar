package Seminar_5.Rational;

import Seminar_5.Excep;
import Seminar_5.logger;
import java.util.Scanner;


public class RationAction implements I_Ration {
    Scanner in = new Scanner(System.in);
    Excep ex = new Excep();
    logger logg = new logger();

    @Override
    public Double getNum1() {
        System.out.println("Введите 1 число: ");
        double num1 = ex.getDouble();
        return num1;
    }

    @Override
    public Double getNum2() {
        System.out.println("Введите 2 число: ");
        double num2 = ex.getDouble();
        return num2;
    }

    @Override
    public Double getNum2withDiv() {
        double num2 = ex.getDouble();
        if (num2 == 0) {
            logg.logger("Пользователь ввел: 0");
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
//            in.next();//рекурсия
            num2 = getNum2withDiv();
        }
        return num2;
    }

    @Override
    public String sum(double num1, double num2) {
        double res = num1 + num2;
        return (num1 + " + " + num2 + " = " + res);
    }

    @Override
    public String sub(double num1, double num2) {
        double res = num1 - num2;
        return (num1 + " - " + num2 + " = " + res);
    }

    @Override
    public String mult(double num1, double num2) {
        double res = num1 * num2;
        return (num1 + " * " + num2 + " = " + res);
    }

    @Override
    public String div(double num1, double num2) {
        double res = num1 / num2;
        return (num1 + " / " + num2 + " = " + res);
    }
}
