package Task3.i;

import lombok.Data;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class Main {
    public static void main(String[] args) {
        List<Students> stud = List.of(
                new Students("Вася", 16, Sex.MAN),
                new Students("Петя", 23, Sex.MAN),
                new Students("Елена", 42, Sex.WOMAN),
                new Students("Иван Иванович", 69, Sex.MAN)
        );
        List<String> filtredList = stud.stream()
                .filter(Students -> Students.getAge() >= 18 && Students.getAge() <= 27 && Students.getSex() == Sex.MAN)
                .map(Students -> Students.getName() + " " + Students.getAge() + " " + Students.getSex())
                .collect(Collectors.toList());
        System.out.println("Студенты, которым придет повестка:");
        for (String s : filtredList) {
            System.out.println(s);
        }
        List<String> workers = stud.stream()
                .filter(Students -> ((Students.getAge() <= 55 && Students.getSex() == Sex.WOMAN) || (Students.getAge() <= 60 && Students.getSex() == Sex.MAN)) && Students.getAge() >= 18)
                .map(Students -> Students.getName() + " " + Students.getAge() + " " + Students.getSex())
                .collect(Collectors.toList());
        long count = workers.size();
        System.out.println("------------------------");
        System.out.println("Количество работяг: " + count);
        System.out.println("Работяги:");
        for(String s : workers){
            System.out.println(s);
        }
    }
}