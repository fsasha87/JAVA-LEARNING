package collections.comporator.ex;

import java.util.Comparator;

public class Woman {
    private String name;
    private int id;

    public Woman(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public static class IdComparator implements Comparator<Woman> {
        @Override
        public int compare(Woman o1, Woman o2) {
            return o2.getId()-o1.getId();
        }
    }
}
