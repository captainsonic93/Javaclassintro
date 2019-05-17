package Design;

public class KidsBike extends AbstractBikeFactory{
    @Override
    BikeFrameInterface createFrame() {
        return new KidsFrame();
    }

    @Override
    BikeSeatInterface createSeat() {
        return new KidsSeat();
    }

    @Override
    BikePaintInterface getPaintforBike() {
        return new KidsColor();
    }
}

