import java.util.ArrayList;

/**
 * A train car
 */
public class Car {

    private ArrayList<Passenger> passengersOnboard;
    private int maxCapacity;

    /**
     * Sets the max capacity for amout of passengers allowed in a car.
     * @param maxCapacity Max capacity of a car
     */
    public Car(int maxCapacity){
        this.maxCapacity = 30;
        this.passengersOnboard = new ArrayList<Passenger>(maxCapacity);
    }

    /**
     * Gets the max capacity of car.
     */
    public int getCapacity(){
        return this.maxCapacity;
    }

    /**
     * Gets the number of seats remaining in a car.
     */
    public int seatsRemaining(){
        return this.maxCapacity - passengersOnboard.size();
    }

    /**
     * Adds a passenger to a car
     * @param p A passenger
     */
    public void addPassenger(Passenger p){
        passengersOnboard.add(p);
    }

    /**
     * Removes a passenger from a car.
     * @param p A passenger
     */
    public void removePassenger(Passenger p){
        passengersOnboard.remove(p);
    }

    /**
     * Prints all the passengers onboard the car.
     */
    public void printManifest(){
        System.out.println(passengersOnboard);
        if (passengersOnboard.size() <= 0){
            System.out.println("This car is empty.");
        }
    }

}