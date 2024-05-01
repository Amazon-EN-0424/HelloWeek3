package abstracts;

public class Bat extends Animal{

    public void fly(){
        System.out.println("Flying....!");
    }

    @Override
    public void sing() {
        System.out.println("tadatadatadatadatada batman batman");
    }

    public Bat(String name, String age) {
        super(name, age);
    }
}
