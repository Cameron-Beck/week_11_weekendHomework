public enum PlaneType {

    BOEING747(10,100);

    private final int capacity, totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight(){
        return totalWeight;
    }


}


