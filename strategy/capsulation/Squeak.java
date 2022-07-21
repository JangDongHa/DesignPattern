package strategy.capsulation;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("뺶뺶");
    }
}
