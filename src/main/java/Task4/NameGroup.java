package Task4;

import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
public class NameGroup {
    public static void main(String[] args) {
        Employes worker1 = new Employes("Ivan", 80000.0, 25, 5);
        Employes worker2 = new Employes("Sergei", 150000.0, 28, 8);
        Employes worker3 = new Employes("Ivan", 90000.0, 26, 4);

        List<Employes> list = new ArrayList<>();
        list.add(worker1);
        list.add(worker2);
        list.add(worker3);
        Comparator<Employes> nameComparator = Comparator.comparing(Employes::getName);

        list.sort(nameComparator);
        Map<String , List<Employes>> groupByName = list.stream()
                .collect(Collectors.groupingBy(Employes::getName));
        System.out.println(groupByName);
    }
}
