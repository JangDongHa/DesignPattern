package strategy;

import strategy.capsulation.FlyNoWings;
import strategy.capsulation.Squeak;

public class RedHeadDuck extends Duck{
    public RedHeadDuck() {
        flyBehavior = new FlyNoWings();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("RedHeadDuck : 빨간 머리 오리");
    }
}
