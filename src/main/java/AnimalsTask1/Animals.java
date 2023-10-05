package AnimalsTask1;
import lombok.Data;

@Data
public class Animals {
    private String animalName;
    public Animals(String animalName){
        this.animalName = animalName;
    }
    public void makeSound(){
        System.out.println("Звук животного");
    }
}
class Cat extends Animals {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу!");
    }
}

class Dog extends Animals {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Гав!");
    }
}

class Cow extends Animals {
    public Cow(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Му-у!");
    }
}