package state.stateStudy;

public class HasQuarterState implements State{
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("이미 동전이 들어가 있는 상태입니다!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전 배출");
        gumballMachine.setState(gumballMachine.noQuarterState);
    }

    @Override
    public void turnCrank() {
        System.out.println("돌렸습니다.");
        gumballMachine.setState(gumballMachine.soldState);
    }

    @Override
    public void dispense() {
        System.out.println("껌이 나오는 중입니다.");
        // setState
    }
}
