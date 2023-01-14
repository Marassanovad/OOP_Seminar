package Seminar_5.Complex;

public interface Compl<T extends Number>{
    T getNum1Part1();
    T getNum1Part2();
    T getNum2Part1();
    T getNum2Part2();
    T sum();
    T sub();
    T mult();
    T div();
}

