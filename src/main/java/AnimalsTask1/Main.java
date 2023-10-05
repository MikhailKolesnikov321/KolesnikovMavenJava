package AnimalsTask1;

public class Main {
    public static void main(String[] args) {
        Animals cat = new Cat("Barsik");
        Animals dog = new Dog("Sharik");
        Animals cow = new Cow("Burenka");

        cat.makeSound();
        dog.makeSound();
        cow.makeSound();
    }
}
