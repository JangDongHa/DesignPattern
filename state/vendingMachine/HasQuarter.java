package state.vendingMachine;

public class HasQuarter implements State {
    VendingMachine vendingMachine;
    public HasQuarter(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(int money) {
        vendingMachine.setCurrentMoney(vendingMachine.getCurrentMoney() + money);
        System.out.println("Insert coin (Current Money : " + vendingMachine.getCurrentMoney() + ")");
    }

    @Override
    public void pushButton() {

    }

    @Override
    public void make() {

    }

    @Override
    public void dispenseLiquid() {

    }


    @Override
    public void dispenseCoin() {
        System.out.println("Dispense coin : " + vendingMachine.getCurrentMoney());
        vendingMachine.setCurrentMoney(0);
    }
}
