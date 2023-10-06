package Task3;

import lombok.Data;

import java.util.List;

@Data
public class Main {
    public static void main(String[] args) {
        List<Students> stud = List.of(
                new Students("Вася", 16, Sex.MAN),
                new Students("Петя", 23, Sex.MAN),
                new Students("Елена", 42, Sex.WOMAN),
                new Students("Иван Иванович", 69, Sex.MAN)
        );

    }
}
