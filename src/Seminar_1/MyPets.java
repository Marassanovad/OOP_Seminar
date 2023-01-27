package Seminar1;

import java.util.List;

public class MyPets implements AnimalActions {
    private String name;
    private String type;
    private Integer id;

    public MyPets(String name, String type, Integer id) {
        this.name = name;
        this.type = type;
        this.id = id;
    }

    public MyPets() {

    }

    public Human getOwner(List<Human> geoTree, MyPets pets) {
        return geoTree.get(pets.getId() - 1);
    }

    ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String name(String name) {
        return name;
    }

    @Override
    public String type(String type) {
        return type;
    }

    @Override
    public String toString() {
        return "Имя: " + name +
                ", Вид: " + type;
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
