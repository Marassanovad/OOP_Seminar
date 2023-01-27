package Seminar1;

import java.util.List;
import java.util.function.Predicate;
import java.util.Scanner;


public class startProgramm implements programm {
    MyPets pets = new MyPets();

    @Override
    public Human addHuman(Integer id) {
        Predicate<String> isPredicate = x -> x.equals("Yes");
        Scanner in = new Scanner(System.in);

        System.out.println("Если хочешь вести нового члена семьи" + "\n" + "Введите 'Yes', если нет то 'No'");
        if (isPredicate.test(in.nextLine()) == true) {
            System.out.println("Введите имя: ");
            String name = in.nextLine();
            System.out.println("Введите фамилию: ");
            String lastName = in.nextLine();
            System.out.println("Введите пол: ");
            String gender = in.nextLine();
            System.out.println("Введите дату рождения: ");
            String birthDate = in.nextLine();
            return new Human(name, lastName, gender, birthDate, id) {
            };
        } else {
            System.out.println("Как хотите");
            return null;
        }
    }

    @Override
    public MyPets addPet() {
        Predicate<String> isPredicate = x -> x.equals("Yes");
        Scanner in = new Scanner(System.in);
        System.out.println("Если хочешь нового питомца" + "\n" + "Введите 'Yes', если нет то 'No'");
        if (isPredicate.test(in.nextLine()) == true) {
            System.out.println("Введите имя: ");
            String name = in.nextLine();
            System.out.println("Введите вид: ");
            String type = in.nextLine();
            System.out.println("Введите ID хозяина: ");
            Integer id = in.nextInt();
            return new MyPets(name, type, id);
        } else {
            System.out.println("Как хотите");
            return null;
        }
    }

    @Override
    public void actionsForPet(MyPets pet) {
        Scanner in = new Scanner(System.in);
        System.out.println("Твоему питомцу скучно, выбери действие что хочешь с ним сделать" +
                "\n" + "Вводите цифры" + "\n" +
                "1 - покормить" + "\n" +
                "2 - погулять" + "\n" +
                "3 - поиграть");
        String ans = in.nextLine();
        if (ans.equals("1")) {
            pets.feed();
        } else if (ans.equals("2")) {
            pets.walk(pet.getType());
        } else if (ans.equals("3")) {
            pets.play(pet.getType());
        } else {
            System.out.println("Как хотите");
        }
    }

    @Override
    public void printGeoTree(List<Human> geoTree) { // печать геодерева
        for (int i = 0; i < geoTree.size(); i++) {
            System.out.println(geoTree.get(i));
        }
    }

    public void printPetsOwner(List<Human> geoTree, MyPets pet) {
        System.out.println(pet.toString());
        System.out.println("Хозяйн: " + pets.getOwner(geoTree, pet));
    }
}
