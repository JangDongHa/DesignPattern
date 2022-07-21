package strategy.capsulation;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("꽦꽦");
    }
}
