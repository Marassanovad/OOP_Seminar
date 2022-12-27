package Seminar_4.HW;

public class Note <T,S> {
    private T signific;
    private S text;

    public Note(T signific, S text) {
        this.signific = signific;
        this.text = text;
    }

    public T getSignific() {
        return signific;
    }

    public void setSignific(T signific) {
        this.signific = signific;
    }

    public S getText() {
        return text;
    }

    public void setText(S text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return signific + " " + text;
    }
}
