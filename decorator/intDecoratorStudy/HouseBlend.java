package decorator.intDecoratorStudy;

public class HouseBlend implements Beverage2 {

    public String getDescription(){
        return "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
