package Seminar_4.Task_2;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> twOb =  new TwoGen<>(88, "Обобщение");
        twOb.showTypes();
        int v = twOb.getOb1();
        System.out.println("Значение: " + v);
        String str = twOb.getOb2();
        System.out.println("Значение: " + str);
    }
}
