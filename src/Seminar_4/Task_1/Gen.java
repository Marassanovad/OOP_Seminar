package Seminar_4.Task_1;

class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("тип это - " + ob.getClass().getName());
    }
}
