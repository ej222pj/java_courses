/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign1.exercise_2
 * 
 * @file_name Vehicle.java
 */
package ej222pj_assign2.exercise_2;

/**
 * @author Eric
 *
 * @date 13 sep 2016 : @time 13:03:22
 *
 */
public class Bicycle extends Vehicle {
	private final static int MAX_NUMBER_OF_PASSENGERS_ON_VEHICLE = 1;
	private final static String VEHICLE_TYPE = "Bicycle";
	private final static int VEHICLE_PRICE = 40;
	private final static double VEHICLE_SPACE = 0.2;
	private final static int PASSENGERS_TICKET_PRICE = 0;
	
	public Bicycle(int passengersOnVehicle) {
		if (fitsVehicle(MAX_NUMBER_OF_PASSENGERS_ON_VEHICLE, passengersOnVehicle)){
			this.vehicleType = VEHICLE_TYPE;
			this.vehiclePrice = VEHICLE_PRICE;
			this.vehicleSpace = VEHICLE_SPACE;
			this.passengers = passengersOnVehicle;
			this.passengersTicketPrice = PASSENGERS_TICKET_PRICE;
	    } else {
	        System.err.println("Only " + MAX_NUMBER_OF_PASSENGERS_ON_VEHICLE + " Passenger fits on a " + VEHICLE_TYPE + ".");
	    }
	}
}