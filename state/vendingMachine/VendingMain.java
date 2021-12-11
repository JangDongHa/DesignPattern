package state.vendingMachine;

public class VendingMain {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(0); // 처음엔 돈을 넣지 않고 시도
        vendingMachine.selectedCoffee();

        System.out.println("=========================================");
        
        vendingMachine.insertCoin(500); // 500원을 넣고
        vendingMachine.selectedCoffee(); // 커피 선택
        vendingMachine.selectedYulmu(); // 율무차 선택 but 이미 잔돈이 나왔으므로 잔액 부족으로 표시
        vendingMachine.insertCoin(200);
        vendingMachine.selectedYulmu();
        vendingMachine.insertCoin(300);
        vendingMachine.selectedCoffee();
        vendingMachine.insertCoin(300);
        vendingMachine.selectedCoffee(); // 커피는 남아있지만 설탕이 부족하므로 lack of material 표시

    }
}
