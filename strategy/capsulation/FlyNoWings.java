package strategy.capsulation;

public class FlyNoWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("날개가 없어 날지 못합니다.");
    }
}
