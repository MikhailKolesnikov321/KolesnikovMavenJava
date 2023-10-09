package Task4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Employes {
    private String name;
    private double pay;
    private int age;
    private int experience;
    Employes(String name, double pay, int age, int experience){
        this.name = name;
        this.age = age;
        this.pay = pay;
        this.experience = experience;
    }
    public static void main(String[] args) {
        Employes worker1 = new Employes("Ivan", 50000.0, 23, 3);
        Employes worker2 = new Employes("Maria", 60000.0, 26, 4);
        Employes worker3 = new Employes("Sergei", 100000.0, 35, 8);

        List<Employes> list = new ArrayList<>();
        list.add(worker1);
        list.add(worker2);
        list.add(worker3);

    }
}
