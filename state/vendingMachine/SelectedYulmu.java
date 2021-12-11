package state.vendingMachine;

public class SelectedYulmu implements State{
    VendingMachine vendingMachine;
    public SelectedYulmu(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(int money) {

    }

    @Override
    public void pushButton() {
        System.out.println("Yulmu");
        if (vendingMachine.getSugar() == 0 || vendingMachine.getYulmuMaterial() == 0) // 재료가 없다면
            vendingMachine.state = vendingMachine.noStuff;
        else
            vendingMachine.setCurrentMoney(vendingMachine.getCurrentMoney() - vendingMachine.getYulmuPrice());

    }

    @Override
    public void make() {
        vendingMachine.setSugar(vendingMachine.sugar - 1);
        vendingMachine.setYulmuMaterial(vendingMachine.yulmuMaterial - 1);
    }

    @Override
    public void dispenseLiquid() {
        System.out.println("Dispense Complete : Yulmu");
        if (vendingMachine.getCurrentMoney() > 0) // 잔돈이 없다면 noQuarter로 권한 양도, 있다면 hasQuarter로 권한 양도
            vendingMachine.state = vendingMachine.hasQuarter;
        else
            vendingMachine.state = vendingMachine.noQuarter;
    }

    @Override
    public void dispenseCoin() {

    }
}
