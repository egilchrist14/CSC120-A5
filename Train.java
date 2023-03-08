import java.util.ArrayList;

/**
 * Creates a train
 */
public class Train {

    public final Engine engine;
    private ArrayList<Car> cars;

    /**
     * A train with the following specifications
     * @param f the train's fuel type
     * @param fuelCapacity The train's fuel capacity
     * @param Cars Amount of cars attached to the train
     * @param passengerCapacity Amount of passengers on the train
     */
    public Train(FuelType f, double fuelCapacity, int nCar, int passengerCapacity){
        this.engine = new Engine();
        this.cars = new ArrayList<Car>();
        for(int i = 0; i < nCar; i++){
            this.cars.add(new Car(passengerCapacity));
        }
    }

    /**
     * gets an engine
     */
    public Engine getEngine(){
        return this.engine;
    }

    /**
     * Gets a certain car
     * @param i
     */
    public Car getCar(int i){
        return this.cars.get(i);
    }

    public int getMaxCapacity(){
        return 30 * cars.size();
    }

    public int seatsRemaining(int i){
        int n = 0;
        for(i = 0; i < cars.size(); i++){
            n = n + ((this.getCar(i)).seatsRemaining());
        }
        return n;
    }

    public void printManifest(){
        for (int i = 0; i < cars.size(); i++){
            this.cars.get(i).printManifest();
        }

    }

}
