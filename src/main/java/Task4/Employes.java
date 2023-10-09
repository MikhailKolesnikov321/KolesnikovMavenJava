package Task4;

import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Data
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
}
