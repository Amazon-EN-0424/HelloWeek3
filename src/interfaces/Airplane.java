package interfaces;

public class Airplane implements Flyable {


    @Override
    public void setupFlyingControls() {
        System.out.println("We are a setting up airplane flying controls");
    }
}
