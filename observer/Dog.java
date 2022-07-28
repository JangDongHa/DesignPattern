package observer;

public class Dog implements Observer{
    private Human human;

    public Dog(Human human){
        this.human = human;
    }
    @Override
    public void update() {
        System.out.println("멍멍");
    }

}
