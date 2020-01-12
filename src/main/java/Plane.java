public class Plane {

    private PlaneType capacity;
    private PlaneType totalWeight;

    public Plane(PlaneType capacity, PlaneType totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity(){
        return this.capacity.getCapacity();
    }
}
