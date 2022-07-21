package strategy.capsulation;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("펄럭 -");
    }
}
