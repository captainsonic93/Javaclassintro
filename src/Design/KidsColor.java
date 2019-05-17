package Design;

import java.util.Random;

public class KidsColor implements BikePaintInterface {
    @Override
    public String getPaintForBike() {

        String[] color ={
                "Black", "Pink",
                "Blue", "Flames"
        };
        Random r = new Random();
        int randomNumber = r.nextInt(color.length);
        return color[randomNumber];
    }
}

