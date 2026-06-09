public class TravelComputation {
    public static void main(String[] args) {
        String name = "Eric";
        String fromCity = "Chennai";
        String viaCity = "Vellore";
        String toCity = "Bangalore";

        double distanceFromToVia = 156.6;
        int timeFromToViaInMinutes = (4 * 60) + 4;

        double distanceViaToFinalCity = 211.8;
        int timeViaToFinalCityInMinutes = (4 * 60) + 25;

        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTimeInMinutes = timeFromToViaInMinutes + timeViaToFinalCityInMinutes;

        System.out.println("The Total Distance travelled by " + name + " from "
                + fromCity + " to " + toCity + " via " + viaCity
                + " is " + totalDistance + " km and the Total Time taken is "
                + totalTimeInMinutes + " minutes");
    }
}
