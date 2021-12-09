package decorator.intDecoratorStudy;

public class Milk extends CondimentDecorator { // Condiment Class
    public Milk(Beverage2 beverage){
        super(beverage); // 객체 구성
    }
    @Override
    public double cost() {
        return .10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}
