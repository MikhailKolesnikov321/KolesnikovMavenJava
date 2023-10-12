package Task4;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Data
@AllArgsConstructor
public class PaySort {
    private String name;
    private double pay;
    private int age;
    private int experience;

    public static void main(String[] args) {
        PaySort worker1 = new PaySort("Ivan", 80000.0, 25, 5);
        PaySort worker2 = new PaySort("Sergei", 150000.0, 28, 8);
        PaySort worker3 = new PaySort("Maria", 110000.0, 26, 4);

        List<PaySort> list = new ArrayList<>();
        list.add(worker1);
        list.add(worker2);
        list.add(worker3);

        list.stream()
                .sorted(Comparator.comparing(PaySort::getPay))
                .filter(employes -> employes.getPay() > 100000)
                .forEach(System.out::println);
    }
}
