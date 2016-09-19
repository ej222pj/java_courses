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
public class Bus extends Vehicle {
	private final static int MAX_NUMBER_OF_PASSENGERS_ON_VEHICLE = 20;
	private final static String VEHICLE_TYPE = "Bus";
	private final static int VEHICLE_PRICE = 200;
	private final static double VEHICLE_SPACE = 4;
	private final static int PASSENGERS_TICKET_PRICE = 10;
	
	public Bus(int passengersOnVehicle) {
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