package Design;

public class RoadBikeFactory extends AbstractBikeFactory {
    @Override
    BikeFrameInterface createFrame() {
        return new RoadBikeFrame();
    }

    @Override
    BikeSeatInterface createSeat() {
        return new RoadBikeSeat();
    }
}
