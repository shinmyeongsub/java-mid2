package collection.compare;

import java.util.Comparator;

public class NameComparator  implements Comparator<MyUser> {

    @Override
    public int compare(MyUser o1, MyUser o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
