package Task3.i;

import Task3.i.Sex;
import lombok.Data;

@Data
public class Students {
    private String name;
    private int age;
    private Sex sex;

    public Students(){

    }
    public Students(String name, int age, Sex sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
