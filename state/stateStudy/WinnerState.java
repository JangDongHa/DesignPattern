package state.stateStudy;

public class WinnerState implements State{
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
    }

    @Override
    public void ejectQuarter() {
    }

    @Override
    public void turnCrank() {
    }

    @Override
    public void dispense() {
        gumballMachine.setWinnerActive(false); // 이제 나올 예정이기 때문에 false로 바꿔주고
        gumballMachine.setState(gumballMachine.soldState); // 판매 상태로 상태 변환 후
        gumballMachine.turnCrank(); // 다시 돌림
    }
}
