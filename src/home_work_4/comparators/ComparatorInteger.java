package home_work_4.comparators;

import java.util.Comparator;

public class ComparatorInteger implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 == null && o2 == null) {
            return 0;
        }
        if(o1 == null) {
            return 1;
        }
        if(o2 == null) {
            return -1;
        }
        return o1.compareTo(o2);
    }
}
