package Seminar_5;


import Seminar_5.Rational.RationAction;

import java.util.Scanner;

public class Main {
    static Interface cases = new Interface();
    static Excep ex = new Excep();
    static RationAction act = new RationAction();
    static logger logg = new logger();


    public static void main(String[] args) {
        cases.inter(1);
        logg.start(1);
        while (true) {
            cases.inter(2);
            int i = ex.getInt();
            if (i == 1) {
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
                    break;
                }
            } else if (i == 2) {
                logg.logger("Калькулятор для работы с комплексными числами");
                System.out.println("Калькулятор для работы с комплексными числами");
                System.out.println("Он еще в разработке. Повторите попытку через несколько дней");

            } else if (i == 3) {
                logg.start(2);
                System.out.println("---------------------------------------------");
                System.out.println("Программа завершила работу");
                System.out.println("---------------------------------------------");
                break;
            } else {
                logg.start(3);
                System.out.println("---------------------------------------------");
                System.out.println("Вы сломали систему");
                System.out.println("---------------------------------------------");
            }

        }


    }
}

