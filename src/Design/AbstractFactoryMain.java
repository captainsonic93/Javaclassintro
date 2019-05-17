package Design;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractBikeFactory factory = new RoadBikeFactory();
        BikeFrameInterface frame = factory.createFrame();
        BikeSeatInterface seat = factory.createSeat();
        System.out.println(frame.getFrameParts());
        System.out.println(seat.getSeatParts());

        AbstractBikeFactory mountain = new MountainBikeFactory();
        BikeFrameInterface mountainFrame = mountain.createFrame();
        BikeSeatInterface mountainSeat = mountain.createSeat();
        System.out.println(mountainFrame.getFrameParts());
        System.out.println(mountainSeat.getSeatParts());
    }
}
