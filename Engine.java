/**
 * A train's engine
 */
public class Engine {

    private FuelType f;
    double currentFuelLevel;
    double maxFuelLevel;

    /**
     * gets the current fuel level of the engine
     */
    public double getCurrentFuelLevel(){
        return this.currentFuelLevel;
    }

    /**
     * gets the maximum fuel level of the engine* @return
     */
    public double getMaxFuelLevel(){
        return this.maxFuelLevel;
    }

    /**
     * Sets the fuel type, current fuel level, and max fuel level of the engine
     * @param f fuel type
     * @param currentFuelLevel 
     * @param maxFuelLevel
     */
    public void myEngine(FuelType f, double currentFuelLevel, double maxFuelLevel){
        this.f = f;
        this.currentFuelLevel = currentFuelLevel;
        this.maxFuelLevel = maxFuelLevel;
    }

    /**
     * Refuels the engine
     */
    public void refuel(){
        this.currentFuelLevel = maxFuelLevel;
    }

    /**
     * Depletes the fuel level of the engine as the train runs.
     */
    public void go(){
        this.currentFuelLevel = this.currentFuelLevel - 1;
        if(this.currentFuelLevel <= 0){
            throw new RuntimeException("The current fuel level is too low and cannot be depleted further.");
        }
    }

} 