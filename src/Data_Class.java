import java.util.List;

public class Data_Class {
    @Override
    public String toString() {
        return "Data_Class{" +
                "liste=" + liste +
                ", index=" + index +
                '}';
    }

    public List<Integer> getListe() {
        return liste;
    }

    public void setListe(List<Integer> liste) {
        this.liste = liste;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Data_Class(List<Integer> liste, int index, int range) {
        this.liste = liste;
        this.index = index;
        this.range = range;
    }

    public int getRange() {
        return range;
    }

    public List<Integer> liste;
    public int index;
    public int range = 1;
}
