package interfaces;

public class Rocket implements Flyable, Transporter{


    @Override
    public void fly() {
        System.out.println("Flying and Rocking like a star");
    }

    @Override
    public void setupFlyingControls() {
        System.out.println("Setting up the controls for the rocket");
    }
}
