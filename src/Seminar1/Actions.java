package Seminar1;

import java.util.ArrayList;
import java.util.List;

public class Actions {
    private List<Human> geoTree = new ArrayList<>();
    public Actions(List<Human> geoTree){
        this.geoTree = geoTree;
    }

    public List<Human> getGeoTree() {
        return geoTree;
    }

    public void setGeoTree(List<Human> geoTree) {
        this.geoTree = geoTree;
    }

    public void addGeoTree(Human human) {
        geoTree.add(human);
    }

    public void addGeoTree(String firstName, String lastName, String gender, String birthDate){
        addGeoTree(new Human(firstName,lastName,gender,birthDate));
    }

    public List<Human> getHumanByGender(String gender){
        List<Human> gen = new ArrayList<>();
        for (Human human: geoTree) {
            if (human.getGender().equals(gender)){
                gen.add(human);
            }
        }
        return gen;
    }
}
