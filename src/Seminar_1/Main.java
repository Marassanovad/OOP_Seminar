package Seminar1;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Human> family = new ArrayList<>();
        Actions actions = new Actions(family);
        startProgramm start = new startProgramm();
        int id = 0;
//        Human human1 = start.addHuman(++id); // создание члена семьи через терминал
//        Human human2 = start.addHuman(++id); // создание члена семьи через терминал
        Human human1 = new Human("Liza", "Adams", "W", "20/01/1987", ++id);
        Human human2 = new Human("Sherlock", "Adams", "M", "03/10/1986", ++id);
        Human human3 = new Parents("Alex", "Adams", "M", "21/02/2000", ++id, human1.getId(), human2.getId());
        Human human4 = new Parents("Vanya", "Adams", "M", "21/02/2000", ++id, human1.getId(), human2.getId());
        actions.addGeoTree(human1);
        actions.addGeoTree(human2);
        actions.addGeoTree(human3);
        actions.addGeoTree(human4);
//        MyPets pet1 = start.addPet(); // создание животного через терминал
        MyPets pet1 = new MyPets("Хатико", "Собака", human3.getId());
        MyPets pet2 = new MyPets("Мурка", "Кошка", human4.getId());

//        System.out.println(human3.toString(family)); // вывод ребенка и его родителей
        System.out.println("Вывод семьи");
        start.printGeoTree(family);
        System.out.println();

        System.out.println("Вывод людей по гендеру ");
        actions.getHumanByGender("M");
        System.out.println();


        System.out.println("Вывод хозяйнов животных");
        System.out.println("Хозяйн 1: ");
        start.printPetsOwner(family, pet1);
        System.out.println("Хозяйн 2: ");
        start.printPetsOwner(family, pet2);
        System.out.println();

        System.out.println("Действия с животными");
        start.actionsForPet(pet1);
        start.actionsForPet(pet2);
        System.out.println();
    }
}