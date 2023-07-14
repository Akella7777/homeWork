package familyTree.Human.Comporator;

import familyTree.FamilyTreeItem;
import familyTree.Human.Human;

import java.util.Comparator;

public class humanComporatorBySurname <E extends FamilyTreeItem> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
