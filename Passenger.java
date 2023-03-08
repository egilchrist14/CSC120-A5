/**
 * A train passenger
 */
public class Passenger {
    
    private String name;

    /**
     * sets the name of a passenger
     * @param name the name of a passenger
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Boards a passenger on a car
     * @param c The car the passenger will board
     */
    public void boardCar(Car c){
        c.addPassenger(this);
    }

    /**
     * Removes a passenger from a car
     * @param c The car the passenger is getting off of
     */
    public void getOffCar(Car c){
        c.removePassenger(this);
    }

}
