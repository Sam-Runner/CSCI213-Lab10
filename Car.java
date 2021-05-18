/**
 * Sam Runner (SamRunner@go.rmc.edu) Date: 2021/05/18
 */
public class Car extends Vehicle {

    private int numDoors;
    private int numPassengers;

    public Car(String aMake, String aModel, String aPlate, int numDoors, int numPassengers) {
        super(aMake, aModel, aPlate);
        this.numDoors = numDoors;
        this.numPassengers = numPassengers;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public Car copy() {
        return new Car(this.getMake(), this.getModel(), this.getPlate(), this.numDoors, this.numPassengers);
    }

    @Override
    public String toString() {
        return String.format("%d-door %s %s with license %s.", this.numDoors, this.getMake(), this.getModel(),
                this.getPlate());
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Car) {
            Car otherCar = (Car) other;

            return super.equals(otherCar) && (this.numDoors == otherCar.getNumDoors())
                    && (this.numPassengers == otherCar.getNumPassengers());
        } else {
            return false;
        }
    }
}
