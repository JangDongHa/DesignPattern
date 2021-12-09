package decorator.intDecoratorStudy;

public class DarkRoast implements Beverage2 {

    public String getDescription(){
        return "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
