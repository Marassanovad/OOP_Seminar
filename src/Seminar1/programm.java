package Seminar1;

import java.util.List;

public interface programm {
    Human addHuman(Integer id);

    MyPets addPet();

    void actionsForPet(MyPets pet);

    void printGeoTree(List<Human> geoTree);

    void printPetsOwner(List<Human> geoTree, MyPets pets);
}
