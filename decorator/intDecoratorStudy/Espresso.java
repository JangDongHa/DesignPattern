package decorator.intDecoratorStudy;


public class Espresso implements Beverage2 {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
