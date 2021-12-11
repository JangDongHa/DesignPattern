package state.vendingMachine;

public class VendingMachine {
    State state;
    State hasQuarter, noQuarter;
    State selectedCoffee, selectedYulmu;
    State noStuff;
    int coffeeMaterial = 3;
    int yulmuMaterial = 3; // 커피 재료, 율무 재료 및 설탕은 3개씩 들어있다고 가정
    int sugar = 3;
    int currentMoney;
    int coffeePrice = 300; int yulmuPrice = 200;

    public VendingMachine(int currentMoney){
        hasQuarter = new HasQuarter(this);
        noQuarter = new NoQuarter(this);
        selectedCoffee = new SelectedCoffee(this);
        selectedYulmu = new SelectedYulmu(this);
        noStuff = new NoStuff(this);
        state = noQuarter; // 첫 상태는 돈이 들어가있지 않은 상태
        this.currentMoney = currentMoney;
        if (currentMoney > 0) // 돈이 들어오면 들어있는 상태로 전이 (Guard Position)
            state = hasQuarter;

    }

    public void insertCoin(int money){
        state.insertCoin(money);
    }

    public void selectedCoffee(){
        if (coffeePrice > currentMoney)
            state = noQuarter;
        else
            state = selectedCoffee;
        selectedSomething();
    }

    public void selectedYulmu(){
        if (yulmuPrice > currentMoney)
            state = noQuarter;
        else
            state = selectedYulmu;
        selectedSomething();
    }
    
    public void selectedSomething(){ // 선택된 것들에 대한 공통 과정
        state.pushButton();
        state.make();
        state.dispenseLiquid();
        state.dispenseCoin();
    }

    public int getCoffeeMaterial() {
        return coffeeMaterial;
    }

    public int getYulmuMaterial() {
        return yulmuMaterial;
    }

    public int getSugar() {
        return sugar;
    }

    public int getCurrentMoney() {
        return currentMoney;
    }

    public void setCoffeeMaterial(int coffeeMaterial) {
        this.coffeeMaterial = coffeeMaterial;
    }

    public void setYulmuMaterial(int yulmuMaterial) {
        this.yulmuMaterial = yulmuMaterial;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public void setCurrentMoney(int currentMoney) {
        this.currentMoney = currentMoney;
    }

    public int getCoffeePrice() {
        return coffeePrice;
    }

    public void setCoffeePrice(int coffeePrice) {
        this.coffeePrice = coffeePrice;
    }

    public int getYulmuPrice() {
        return yulmuPrice;
    }

    public void setYulmuPrice(int yulmuPrice) {
        this.yulmuPrice = yulmuPrice;
    }
}
