package Seminar1;

public class MyPets implements AnimalActions {


    @Override
    public String name(String name) {
        return name;
    }

    @Override
    public String type(String type) {
        return type;
    }

    @Override
    public void feed() {
        System.out.println("очень плотно покушал");

    }


    @Override
    public void walk(String type) {
        if (type.equals("Собака")) {
            System.out.println("30 минутная прогулка");
        } else if (type.equals("Кошка")) {
            System.out.println("Вы ее не поймали,для прогулки");

        } else {
            System.out.println("Их не выгуливают");
        }

    }

    @Override
    public void play(String type) {
        if (type.equals("Собака")) {
            System.out.println("съел диван ");
            ;
        } else if (type.equals("Кошка")) {
            System.out.println("Ей на вас пофиг, она спит");

        } else {
            System.out.println("С ним не играют");
        }


    }
}
