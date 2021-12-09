package decorator.decoratorStudy;

public class Espresso extends Beverage{ // Beverage Class

    public Espresso(){
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
