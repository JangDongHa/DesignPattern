package strategy;

import strategy.capsulation.FlyWithWings;
import strategy.capsulation.Quack;

public class MallardDuck extends Duck{
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck : 청둥오리");
    }
}
