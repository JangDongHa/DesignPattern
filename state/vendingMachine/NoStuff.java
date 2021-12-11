package state.vendingMachine;

public class NoStuff implements State{
    VendingMachine vendingMachine;
    public NoStuff(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(int money) {
    }

    @Override
    public void pushButton() {

    }

    @Override
    public void make() {
        System.out.println("Lack of material!");
    }

    @Override
    public void dispenseLiquid() {

    }

    @Override
    public void dispenseCoin() {

    }
}
