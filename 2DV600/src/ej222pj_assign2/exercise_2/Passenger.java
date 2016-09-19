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
public class Passenger {
	private int passengerTicketPrice;
	
	public Passenger(int ticketPrice){
		this.passengerTicketPrice = ticketPrice;
	}
	
	public int getPassengerTicketPrice(){
		return this.passengerTicketPrice;
	}
}