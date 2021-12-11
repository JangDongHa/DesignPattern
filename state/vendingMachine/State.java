package state.vendingMachine;

public interface State {
    public void insertCoin(int money); // 자판기에 돈을 넣음
    public void pushButton();
    public void make();
    public void dispenseLiquid();
    public void dispenseCoin(); // 잔돈 배출
}
