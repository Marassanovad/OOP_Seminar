package Seminar1;

import java.util.List;

public class Parents extends Human {
    private Integer motherId;
    private Integer fatherId;
//    private List<Human> geoTree;


    public Parents(String firstName, String lastName, String gender, String birthDate, Integer id, Integer motherId, Integer fatherId) {
        super(firstName, lastName, gender, birthDate, id);
        this.motherId = motherId;
        this.fatherId = fatherId;
    }

    public Parents(String firstName, String lastName, String gender, String birthDate, Integer id) {
        super(firstName, lastName, gender, birthDate, id);
    }

    public Parents(Integer motherId, Integer fatherId) {
        super();
        this.motherId = motherId;
        this.fatherId = fatherId;

    }

    public Integer getMotherId() {
        return motherId;
    }

    public void setMotherId(Integer motherId) {
        this.motherId = motherId;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }


    public String toString(List<Human> geoTree) {
        return super.toString() + "\n" +
                "Mother: " + geoTree.get(motherId) + "\n" +
                "Father: " + geoTree.get(fatherId);
    }


}
