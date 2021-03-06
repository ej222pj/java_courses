/**
 * @project_name 2DV600
 *
 * @package_name ej222pj_assign1.exercise_2
 * 
 * @file_name Vehicle.java
 */
package ej222pj_assign2.exercise_2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Eric
 *
 * @date 13 sep 2016 : @time 13:03:22
 *
 */
public class FerryClass implements Ferry {
    private final static int TOTAL_NUMBER_OF_PASSENGERS_ON_FERRY = 200;
    private final static int TOTAL_NUMBER_OF_VEHICLES_ON_FERRY = 40;
    private static double vehicleSpaceEmbarked = 0;
    private static int earnedMoney = 0;
    private ArrayList<Vehicle> vehicleArrayList;
    private ArrayList<Passenger> passengerArrayList;

    public FerryClass(){
    	vehicleArrayList = new ArrayList<Vehicle>();
    	passengerArrayList = new ArrayList<Passenger>();
    }

    // Number of passengers on board
    @Override
    public int countPassengers() {
        return passengerArrayList.size();
    }

    // Used vehicle space. One car is 1.
    @Override
    public int countVehicleSpace() {
        return (int)Math.ceil((double)Math.round(vehicleSpaceEmbarked * 10d) / 10d);
    }

    // Earned money
    @Override
    public int countMoney() {
        return earnedMoney;
    }

    // Embark vehicle, warning if not enough space
    @Override
    public void embark(Vehicle v) {
    	//Checks if the number of passengers in the vehicle and if the vehicle fits on the boat.
        if (hasSpaceFor(v)) {
        	if (TOTAL_NUMBER_OF_PASSENGERS_ON_FERRY >= (v.getAmountPassengers() + passengerArrayList.size())){
        		vehicleArrayList.add(v);
        		
            	//Embark passengers in the vehicles and add vehicle space and money earned
                for (int i = 0; i < v.getAmountPassengers(); i++){
                	embark(new Passenger(v.getPassengersTicketPrice()));
                }
                vehicleSpaceEmbarked += v.getVehicleSpace();
                earnedMoney += v.getVehiclePrice();
        	} else {
                System.err.println("Not Enough room for the Passengers in the Vehicle!");
            }
        } else {
            System.err.println("Not Enough room for the Vehicle!");
        }
    }

    // Embark passenger, warning if not enough room
    @Override
    public void embark(Passenger p) {
        if (hasRoomFor(p)){
        	passengerArrayList.add(p);
        	earnedMoney += p.getPassengerTicketPrice();
        }else{
            System.err.println("No room for the passenger!");
        }
    }

    // Clear (empty) ferry. The money earned remains,
    // i.e., is not reset to zero
    @Override
    public void disembark() {
    	vehicleSpaceEmbarked = 0;
    	vehicleArrayList.clear();
    	passengerArrayList.clear();
    }

    // true if we can embark vehicle v
    @Override
    public boolean hasSpaceFor(Vehicle v) {
    	//If the car is not in the list and there is space for more vehicles on the ferry
        if (!vehicleArrayList.contains(v) && TOTAL_NUMBER_OF_VEHICLES_ON_FERRY >= ((Math.round(vehicleSpaceEmbarked * 10d) / 10d) + v.getVehicleSpace())) 
        	return true;
        else return false;
    }

    // true if we can embark passenger p
    @Override
    public boolean hasRoomFor(Passenger p) {
    	//If the passenger is not in the list and there is space for more passengers on the ferry
        if (!passengerArrayList.contains(p) && TOTAL_NUMBER_OF_PASSENGERS_ON_FERRY >= passengerArrayList.size())
            return true;
        else return false;
    }
    
    @Override
    public String toString(){
    	StringBuilder sb = new StringBuilder();
        sb.append("Ferry Status!\n");
        sb.append(String.format("Number of vehicles:   %d\n" +
        						"Number of passengers: %d\n" +
        						"Money earned:         %d\n", vehicleArrayList.size(), countPassengers(), countMoney()));
        return sb.toString();
    }

    @Override
    public Iterator<Vehicle> iterator() {
        return new Iterator<Vehicle>(){
        	private int index = 0;

            @Override
            public boolean hasNext() {
                return vehicleArrayList.get(index++) != null && index < vehicleArrayList.size();
            }

            @Override
            public Vehicle next() {
                return vehicleArrayList.get(index++);
            }
        };
    }
}