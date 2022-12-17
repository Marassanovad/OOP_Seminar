package Seminar1;

import java.util.ArrayList;
import java.util.List;



public class Main {

    public static void main(String[] args) {
        List<Human> family = new ArrayList<>();
        List<Human> child = new ArrayList<>();
        Actions actions = new Actions(family);
        Parents parents = new Parents(child);

        Human human1 = new Human("Alex","Adams", "M","21/02/2000");
        Human human2 = new Human("Vanya","Adams", "M","21/02/2000");
        parents.addChild(human1);
        parents.addChild(human2);
        Human human3 = new Parents("Liza", "Adams","W","20/01/1987",child);
        Human human4 = new Parents("Sherloc", "Adams","M","03/10/1986",child);
        actions.addGeoTree(human1);
        actions.addGeoTree(human2);
        actions.addGeoTree(human3);
        actions.addGeoTree(human4);


        System.out.println("Семья ");
        System.out.println(actions.getGeoTree());
        System.out.println();
        System.out.println("Вывод людей по гендеру ");
        System.out.println(actions.getHumanByGender("M"));
        System.out.println();
        System.out.println("Сколько детей в семье ");
        System.out.println(parents.countChild());

    }
}