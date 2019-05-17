package Design;

import java.util.Random;

public class MountainColor implements BikePaintInterface {
    @Override
    public String getPaintForBike() {

        String[] color ={
                "strawberry Banana", "blue Raspberry",
                "green Apple", "yellow Kiwi"
        };
        Random r = new Random();
        int randomNumber = r.nextInt(color.length);
        return color[randomNumber];
    }
}
