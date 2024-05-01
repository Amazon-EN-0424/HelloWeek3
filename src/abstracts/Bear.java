package abstracts;

public class Bear extends Animal{

    private String favoriteHoneyType;

    public void stealTheHoney(){
        System.out.println("I'm stealing the honey");
    }

    @Override
    public void sing() {
        System.out.println("tubidu bidu");
    }

    public Bear(String name, String age) {
        super(name, age);
    }
}
