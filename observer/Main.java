package observer;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Cat cat = new Cat();
        Dog dog = new Dog();

        human.registerObserver(cat);
        human.registerObserver(dog);

        human.notifyObserver();
    }
}
