package Seminar_4.HW;

public class Info <T,S,D> {
    private T id;
    private S name;
    private D date;

    public Info(T id, S name, D date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public S getName() {
        return name;
    }

    public void setName(S name) {
        this.name = name;
    }

    public D getDate() {
        return date;
    }

    public void setDate(D date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return  id + ". " + name +
                " " + date + " ";
    }
}
