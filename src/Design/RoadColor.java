package Design;

import java.util.Random;

public class RoadColor implements BikePaintInterface {

        @Override
        public String getPaintForBike() {

            String[] color ={
                    "Black Banana", "blue Wave",
                    "green grass", "yellow dog"
            };
            Random r = new Random();
            int randomNumber = r.nextInt(color.length);
            return color[randomNumber];
        }
}
