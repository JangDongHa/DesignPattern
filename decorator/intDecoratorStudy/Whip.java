package decorator.intDecoratorStudy;

public class Whip extends CondimentDecorator {
    public Whip(Beverage2 beverage){
        super(beverage); // 객체 구성
    }
    @Override
    public double cost() {
        return .10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Whip";
    }
}
