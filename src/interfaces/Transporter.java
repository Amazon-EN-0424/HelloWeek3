package interfaces;

import java.time.Instant;
import java.util.List;

public interface Transporter {

    double maximumLoad = 5;

    default void loadCargo(List<String> elements){
        if (elements.size() > maximumLoad) {
            System.out.println("Maximum load reached, please remove something -- " + Instant.now());
        } else {
            System.out.println("Ready to go! All loaded up -- " + Instant.now());
        }
    };
}
