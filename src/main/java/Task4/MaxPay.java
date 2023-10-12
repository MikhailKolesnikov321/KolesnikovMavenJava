package Task4;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Data
@AllArgsConstructor
public class MaxPay {
    private String name;
    private double pay;
    private int age;
    private int experience;

    public static void main(String[] args) {
        MaxPay worker1 = new MaxPay("Ivan", 80000.0, 25, 5);
        MaxPay worker2 = new MaxPay("Sergei", 150000.0, 28, 8);
        MaxPay worker3 = new MaxPay("Maria", 90000.0, 26, 4);
        List<MaxPay> list = new ArrayList<>();
        list.add(worker1);
        list.add(worker2);
        list.add(worker3);
        MaxPay maxPayEmp = list.stream()
                .max(Comparator.comparingDouble(MaxPay::getPay))
                .orElse(new MaxPay("Нет сотрудников", 0.0, 0, 0));
        System.out.println("Сотрудник с максимальной зарплатой: " + maxPayEmp.getName() + " - " + maxPayEmp.getPay() + "руб.");
    }
}
