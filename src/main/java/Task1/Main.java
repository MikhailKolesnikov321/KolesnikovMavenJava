package Task1;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Barsik");
        Animal dog = new Dog("Sharik");
        Animal cow = new Cow("Burenka");

        cat.makeSound();
        dog.makeSound();
        cow.makeSound();
    }
}
