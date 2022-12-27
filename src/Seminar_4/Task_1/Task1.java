package Seminar_4.Task_1;


public class Task1 {
    public static void main(String[] args) {

        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("Значение " + v);

        Gen < String> strOb = new Gen<>("Test message");
        strOb.showType();
        String temp = strOb.getOb();
        System.out.println("Значение: " + temp);
    }
}



