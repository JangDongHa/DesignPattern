package decorator.decoratorStudy;

public class Milk extends CondimentDecorator{ // Condiment Class
    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage; // 객체 구성
    }
    @Override
    public double cost() {
        return .10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
