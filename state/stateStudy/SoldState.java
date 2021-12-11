package state.stateStudy;

public class SoldState implements State{ // 사실상 dispense 이후에는 soldstate = noquaterstate와 동일
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine){
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
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0){ // can sell gum
            gumballMachine.setState(gumballMachine.noQuarterState);
        }
        else{ // can not sell gum because of out of gum
            gumballMachine.setState(gumballMachine.soldOutState);
        }
    }
}
