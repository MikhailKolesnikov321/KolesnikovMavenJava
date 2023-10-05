package Task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class UniqueSet {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        System.out.println(arrayList);

        Set<Integer> set = UniqueSet.convertToSet(arrayList);
        System.out.println(set);
    }
    public static <T>Set<T> convertToSet(List<T> list){
        return new HashSet<T>(list);
    }
}
