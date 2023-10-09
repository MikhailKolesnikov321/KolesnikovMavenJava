package Task4;

import lombok.Data;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Data
public class AveragePay {
    public static void main(String[] args) {
        Employes worker1 = new Employes("Ivan", 80000.0, 25, 5);
        Employes worker2 = new Employes("Sergei", 150000.0, 28, 8);
        Employes worker3 = new Employes("Maria", 90000.0, 26, 4);
        DecimalFormat df = new DecimalFormat("#.##");

        List<Employes> list = new ArrayList<>();
        list.add(worker1);
        list.add(worker2);
        list.add(worker3);

        Double averagePay = list.stream()
                .mapToDouble(Employes::getPay)
                .average()
                .orElse(0.0);
        String formatedAverPay = df.format(averagePay);
        System.out.println("Средняя зарплата среди всех сотрудников: " + formatedAverPay + "руб.");
    }
}
