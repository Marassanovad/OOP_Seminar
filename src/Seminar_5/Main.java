package Seminar_5;


import Seminar_5.Rational.RationAction;
import Seminar_5.Rational.RationalInter;

public class Main {
    static Interface cases = new Interface();
    static Excep ex = new Excep();
    static RationAction act = new RationAction();
    static logger logg = new logger();
    static RationalInter rint = new RationalInter();


    public static void main(String[] args) {
        cases.inter(1); // старт
        logg.start(1); // логгер для старта
        while (true) {
            cases.inter(2);
            int i = ex.getInt();
            if (i == 1) {
                rint.Inter();
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

