package Design;

public class MountainBikeFactory extends AbstractBikeFactory {

    @Override
    BikeFrameInterface createFrame() {
        return new MountainBikeFrame();
    }

    @Override
    BikeSeatInterface createSeat() {
        return new MountainSeat();
    }

    @Override
    BikePaintInterface getPaintforBike() {
        return new MountainColor();
    }
}
