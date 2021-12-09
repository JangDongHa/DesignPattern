package decorator.intDecoratorStudy;

public class Soy extends CondimentDecorator {
    public Soy(Beverage2 beverage){
        super(beverage); // 객체 구성
    }
    @Override
    public double cost() {
        return .15 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Soy";
    }
}
