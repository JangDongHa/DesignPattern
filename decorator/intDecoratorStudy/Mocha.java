package decorator.intDecoratorStudy;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage2 beverage){
        super(beverage); // 객체 구성
    }
    @Override
    public double cost() {
        return .20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Mocha";
    }
}
