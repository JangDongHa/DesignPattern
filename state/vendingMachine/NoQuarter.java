package state.vendingMachine;

public class NoQuarter implements State{
    VendingMachine vendingMachine;
    public NoQuarter(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(int money) {
        vendingMachine.setCurrentMoney(money);
        System.out.println("Insert Coin (Current Money : " + money + ")");
    }

    @Override
    public void pushButton() {
        System.out.println("Please insert more coin");
    }

    @Override
    public void make() {

    }

    @Override
    public void dispenseLiquid() {

    }

    @Override
    public void dispenseCoin() {
        System.out.println("There is no change");
    }
}
