package decorator.intDecoratorStudy;


public abstract class CondimentDecorator implements Beverage2 {
    protected Beverage2 beverage;

    public CondimentDecorator(Beverage2 beverage){
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription();
    }
}
