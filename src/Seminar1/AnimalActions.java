package Seminar1;

public interface AnimalActions extends Animal {
    void feed();

    default String feedClassic() {
        return "накормили кормом ";
    }

    static String walkUniversal() {
        return "выгуляли в парке ";
    }

    void walk(String type);


    void play(String type);
}
