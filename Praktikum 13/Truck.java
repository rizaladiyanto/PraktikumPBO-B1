public class Truck extends Vehicle{
    private double maxLoad;

    public Truck(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency(){
        return maxLoad*0.0;
    }

    public double calcTripDistance(){
        return maxLoad*0.0;
    }

    @Override
    public String toString(){
        return "Truck adalah angkutan darat yang sangat handal";
    }

    public Truck(){
        maxLoad = 100;
    }
}
