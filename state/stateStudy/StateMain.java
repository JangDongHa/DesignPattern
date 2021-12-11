package state.stateStudy;

public class StateMain {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(3); // 잔여수량 3개인 껌 기계 배치
        
        gumballMachine.insertQuarter(); // 동전을 넣고
        gumballMachine.ejectQuarter(); // 일단 한번 빼보고
        gumballMachine.insertQuarter(); // 다시 동전을 넣고
        gumballMachine.turnCrank(); // 돌린다. (당첨상태이기 때문에 3->1)

        gumballMachine.setWinnerActive(true); // 한번더 당첨상태로 바꿔주고
        gumballMachine.insertQuarter(); // 다시 동전을 넣고
        gumballMachine.turnCrank(); // 돌린다.  (1->0, 당첨은 뜨지만 껌이 더 없기 때문에 나오지 않음)
        
        gumballMachine.insertQuarter(); // <- 여기서부터는 SoldOutState이기 때문에 동전도 안들어갈 것임
    }
}
