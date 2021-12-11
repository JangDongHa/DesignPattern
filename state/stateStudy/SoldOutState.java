package state.stateStudy;

public class SoldOutState implements State{
    GumballMachine gumballMachine;
    public SoldOutState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("껌이 매진이라 동전을 넣으실 수 없습니다.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("반환해줄 동전이 존재하지 않습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("동전이 존재하지 않아 돌릴 수 없습니다.");
    }

    @Override
    public void dispense() {
        System.out.println("동전이 들어있지 않아 껌이 배출될 수 없습니다.");
    }
}
