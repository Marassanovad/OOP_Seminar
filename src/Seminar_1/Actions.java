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
        if (human == null){
            return;
        }else {
            geoTree.add(human);
        }
    }

    public void addGeoTree(String firstName, String lastName, String gender, String birthDate, Integer id){
        addGeoTree(new Human(firstName,lastName,gender,birthDate, id));
    }

    public void getHumanByGender(String gender){
        for (Human human: geoTree) {
            if (human.getGender().equals(gender)){
                System.out.println(human);
            }
        }
    }
}
