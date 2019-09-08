public class FlightManager {



    public static int calculateReservedBaggageWeightPerPassenger(Flight flight){
        int weightReservedForPassengers = flight.getPlane().getPlaneType().getTotalWeight() / 2;
        int baggageWeightPerBag =  weightReservedForPassengers / flight.getPlane().getPlaneType().getCapacity();
        return baggageWeightPerBag;
    }

    public static int calculateBagsOnFlight(Flight flight){
        int total = 0;
        for (int b = 0; b < flight.passengerCount(); b++){
            total += flight.getPassenger(b).getBags();
        }
        return total;
    }


    public static int calculateWeightOfBookedBags(Flight flight) {
       return calculateReservedBaggageWeightPerPassenger(flight) * calculateBagsOnFlight(flight);
    }


    public static int calculateRemainingAvailableBaggageWeight(Flight flight) {
        int weightReservedForPassengers = flight.getPlane().getPlaneType().getTotalWeight() / 2;
        return weightReservedForPassengers - calculateWeightOfBookedBags(flight);

    }
}
