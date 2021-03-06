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
public abstract class Vehicle {
	protected String vehicleType;
	protected int vehiclePrice;
	protected double vehicleSpace;
	protected int passengers;
	protected int passengersTicketPrice;
    
	public String getVehicleType(){
        return this.vehicleType;
    }
    
    public int getVehiclePrice(){
        return this.vehiclePrice;
    }

    public double getVehicleSpace(){
        return this.vehicleSpace;
    }

    
    public int getAmountPassengers(){
        return this.passengers;
    }
    
    public int getPassengersTicketPrice(){
        return this.passengersTicketPrice;
    }
    
    protected boolean fitsVehicle(int maxNumberOfPassengersOnVehicle, int numberOfPassengers){
        if (maxNumberOfPassengersOnVehicle < numberOfPassengers) return false;
        else return true;
    }
}