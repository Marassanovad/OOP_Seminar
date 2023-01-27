package Seminar_5.Rational;
import Seminar_5.Excep;
import Seminar_5.Interface;
import Seminar_5.logger;

/** Интерфейс с действиями для рациональных чисел */

public class RationalInter {
    Interface cases = new Interface();
    Excep ex = new Excep();
    RationAction act = new RationAction();
    logger logg = new logger();

    public void Inter() {
        logg.logger("Калькулятор для работы с рациональными числами");
        System.out.println("Калькулятор для работы с рациональными числами");
        cases.inter(3);
        String a = ex.action();
        if (a.equals("+")) {
            logg.logger("Сложение");
            String forlog = ("Результат: " + act.sum(ex.getDouble(), ex.getDouble()));
            logg.logger(forlog);
            System.out.println(forlog);
        }
        if (a.equals("-")) {
            logg.logger("Вычитание");
            String forlog = ("Результат: " + act.sub(ex.getDouble(), ex.getDouble()));
            logg.logger(forlog);
            System.out.println(forlog);
        }
        if (a.equals("*")) {
            logg.logger("Умножение");
            String forlog = ("Результат: " + act.mult(ex.getDouble(), ex.getDouble()));
            logg.logger(forlog);
            System.out.println(forlog);
        }
        if (a.equals("/")) {
            logg.logger("Деление");
            String forlog = ("Результат: " + act.div(ex.getDouble(), act.getNum2withDiv()));
            logg.logger(forlog);
            System.out.println(forlog);
        } else if (a.equals("5")) {
            logg.start(2);
            System.out.println("---------------------------------------------");
            System.out.println("Программа завершила работу");
            System.out.println("---------------------------------------------");
        }
    }
}
