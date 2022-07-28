package observer;

public class Cat implements Observer{
    private Human human;

    private Cat(Human human){
        this.human = human;
    }
    @Override
    public void update() {
        System.out.println("야옹");
    }

}
