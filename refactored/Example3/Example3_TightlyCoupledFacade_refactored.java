
public class Example3_TightlyCoupledFacade_refactored {
    public static void main(String[] args) {
        TravelFacade facade = new TravelFacade();
        facade.bookTrip();
    }
}

class TravelFacade {
    private final Flight flight = new Flight();
    private final Hotel hotel = new Hotel();
    private final CarRental carRental = new CarRental();

    public void bookTrip() {
        flight.reserve();
        hotel.reserve();
        carRental.reserve();
    }
}

class Flight {
    public void reserve() {
        System.out.println("Flight reserved");
    }
}

class Hotel {
    public void reserve() {
        System.out.println("Hotel reserved");
    }
}

class CarRental {
    public void reserve() {
        System.out.println("Car reserved");
    }
}
