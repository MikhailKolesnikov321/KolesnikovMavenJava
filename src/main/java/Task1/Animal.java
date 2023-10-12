package Task1;
import lombok.Data;

@Data
public class Animal {
    private String animalName;
    public Animal(String animalName){
        this.animalName = animalName;
    }
    public void makeSound(){
        System.out.println("Звук животного");
    }
}
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу!");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Гав!");
    }
}

class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Му-у!");
    }
}