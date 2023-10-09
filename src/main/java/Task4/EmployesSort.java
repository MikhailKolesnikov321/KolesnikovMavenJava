package Task4;

import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Data
public class EmployesSort {
    public static void main(String[] args) {
        Employes worker1 = new Employes("Ivan", 80000.0, 25, 5);
        Employes worker2 = new Employes("Sergei", 150000.0, 28, 8);
        Employes worker3 = new Employes("Maria", 90000.0, 26, 4);

        List<Employes> list = new ArrayList<>();
        list.add(worker1);
        list.add(worker2);
        list.add(worker3);

        Comparator<Employes> payComparator = Comparator.comparingDouble(Employes::getPay);
        Comparator<Employes> ageComparator = Comparator.comparingInt(Employes::getAge);
        Comparator<Employes> experienceComparator = Comparator.comparingInt(Employes::getExperience);

        list.forEach(employe -> System.out.println(employe));

        System.out.println("\nСортировка по зарплате:");
        list.stream()
                .sorted(payComparator)
                .forEach(employe -> System.out.println(employe));

        System.out.println("\nСортировка по возрасту:");
        list.stream()
                .sorted(ageComparator)
                .forEach(employe -> System.out.println(employe));

        System.out.println("\nСортировка по стажу службы:");
        list.stream()
                .sorted(experienceComparator)
                .forEach(employe -> System.out.println(employe));
    }
}
