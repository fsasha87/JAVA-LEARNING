package collections.comporator.ex;

import java.util.Comparator;

public class NameComporator implements Comparator<Woman> {
    @Override
    public int compare(Woman o1, Woman o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
