package decorator.intDecoratorStudy;


public class Decaf implements Beverage2 {

    public String getDescription(){
        return "Decaffeinated Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
