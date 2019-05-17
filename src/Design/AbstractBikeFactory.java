package Design;

public abstract class AbstractBikeFactory {

    abstract BikeFrameInterface createFrame();
    abstract BikeSeatInterface createSeat();
    abstract BikePaintInterface getPaintforBike();



}
