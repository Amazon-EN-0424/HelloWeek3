package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        var boeing = new Airplane();
        boeing.fly();
        boeing.setupFlyingControls();

        var astra = new Rocket();
        astra.fly();
        astra.setupFlyingControls();



        startMission(boeing);
        startMission(astra);

        var ufo = new Ufo();
        startMission(ufo);

        for (int i = 0; i < 50; i++) {
            System.out.println("======");
            var cargo = new ArrayList<>(List.of(
                    "Water", "Tofu",
                    "Coffee", "Oxygen",
                    "Astronaut vest","Bonsai"));
            astra.loadCargo(cargo);
            cargo.removeLast();
            astra.loadCargo(cargo);
            System.out.println("=======");
        }
    }

    public static void startMission(Flyable vehicle) {
        vehicle.fly();
    }
}
