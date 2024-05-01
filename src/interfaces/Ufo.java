package interfaces;

public class Ufo implements Flyable{
    @Override
    public void fly() {
        System.out.println("fvmmmmmmhh");
    }

    @Override
    public void setupFlyingControls() {
        System.out.println("setting up UFO");
    }
}
