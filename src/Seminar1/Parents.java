

package Seminar1;

import java.util.ArrayList;
import java.util.List;

public class Parents extends Human {
    private List<Human> child = new ArrayList<>();
    public Parents(String firstName, String lastName, String gender, String birthDate, List<Human> child) {
        super(firstName, lastName, gender, birthDate);
        this.child = child;
    }
    public Parents(String firstName, String lastName, String gender, String birthDate) {
        super(firstName, lastName, gender, birthDate);
    }

    public Parents(List<Human> child) {
        super();
        this.child = child;
    }

    public List<Human> getChild() {
        return child;
    }

    public void setChild(List<Human> child) {
        this.child = child;
    }
    
    public void addChild(Human human){
        child.add(human);
    }
    
    public void addChild(String firstName, String lastName, String gender, String birthDate) {
        addChild(new Human(firstName, lastName, gender, birthDate));
    }

    @Override
    public String toString() {
        if (getGender().equals("W")){
            return "Mother:" + super.toString()+ "\n"+
                    "her children: " + child;
        }else{
            return "Father:" + super.toString()+ "\n"+
                    "his children: " + child;
        }
    }

    public int countChild(){
        int count = child.size();
        return count;
    }
    
    
}
