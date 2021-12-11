package state.stateStudy;

public class GumballMachine{
    State soldOutState; // old code : final static int 로 상태를 구분했었음
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState; // WinnerState Code

    State state = soldOutState; // default : sold out
    int count = 0;
    boolean winnerActive = true; // WinnerState Code (그러나 이건 단순히 Active를 위한 변수이기 때문에 추가라고 하진 않는걸로)

    public GumballMachine(int numberGumballs){
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this); // WinnerState Code
        this.count = numberGumballs;
        if (numberGumballs > 0){ // 남은 껌이 1개라도 존재하면
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall(){
        if (count > 0){
            count -= 1;
            System.out.println("껌이 나왔습니다. (껌통에 남은 껌 : " + count + ")");
            if (winnerActive){
                System.out.println("당첨! 추가 껌이 나올 예정입니다.");
                this.setState(winnerState); // WinnerState Code
                state.dispense(); // WinnerState Code
            }
        }
        else
            System.out.println("더이상 껌이 존재하지 않습니다.");

    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setWinnerActive(boolean winnerActive) {
        this.winnerActive = winnerActive;
    }
}
