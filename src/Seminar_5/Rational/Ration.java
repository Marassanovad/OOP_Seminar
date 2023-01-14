package Seminar_5.Rational;

public interface Ration<T extends Number> {
    T getNum1();

    T getNum2();

    T getNum2withDiv();

    String sum(double num1, double num2);

    String sub(double num1, double num2);

    String mult(double num1, double num2);

    String div(double num1, double num2);


}
