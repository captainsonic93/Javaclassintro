package Design;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractBikeFactory factory = new RoadBikeFactory();
        BikeFrameInterface frame = factory.createFrame();
        BikeSeatInterface seat = factory.createSeat();
        BikePaintInterface color = factory.getPaintforBike();
        System.out.println(frame.getFrameParts());
        System.out.println(seat.getSeatParts());
        System.out.println(color.getPaintForBike()+ " paint job");

        System.out.println("");

        AbstractBikeFactory mountain = new MountainBikeFactory();
        BikeFrameInterface mountainFrame = mountain.createFrame();
        BikeSeatInterface mountainSeat = mountain.createSeat();
        BikePaintInterface mountaincolor = mountain.getPaintforBike();
        System.out.println(mountainFrame.getFrameParts());
        System.out.println(mountainSeat.getSeatParts());
        System.out.println(mountaincolor.getPaintForBike()+ " paint job");

        System.out.println("");


        AbstractBikeFactory kids = new KidsBike();
        BikeFrameInterface kidsFrame = kids.createFrame();
        BikeSeatInterface kidsSeat = kids.createSeat();
        BikePaintInterface kidscolor = kids.getPaintforBike();
        System.out.println(kidsFrame.getFrameParts());
        System.out.println(kidsSeat.getSeatParts());
        System.out.println(kidscolor.getPaintForBike()+ " paint job" );
    }
}
