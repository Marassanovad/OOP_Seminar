package Seminar_4.Task_3;

public class Demo {
    public static void main(String[] args) {
        Numeric<Integer>  intOb =  new Numeric<>(6);
        Numeric<Double> dOb = new Numeric<>(-6.0);
        Numeric<Long> lOb = new Numeric<>(5L);
        System.out.println("Сравнение intOb и dOb: ");
        if(intOb.absEqual(dOb)){
            System.out.println("Абсолютные значения совпадают");
        }
        else {
            System.out.println("Абсолютные значения различаются");
        }

        System.out.println("Сравнение intOb и lOb: ");
        if(intOb.absEqual(lOb)){
            System.out.println("Абсолютные значения совпадают");
        }
        else {
            System.out.println("Абсолютные значения различаются");
        }
//        System.out.println("Обратная величина intOb: " + intOb.recNum());
//        System.out.println("Дробная часть intOb: " + intOb.fract());
//        System.out.println();
//
//        Numeric<Double>  dOb =  new Numeric<>(5.25);
//        System.out.println("Обратная величина dOb: " + dOb.recNum());
//        System.out.println("Дробная часть dOb: " + dOb.fract());




    }
}
