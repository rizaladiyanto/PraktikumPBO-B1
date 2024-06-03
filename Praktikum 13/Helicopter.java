public class Helicopter extends Airplane {
    private double maxLoad;

    public Helicopter(double maxLoad) {
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
        return "Helicopter hanya memerlukan landasan kecil";
    }

    public Helicopter(){
        maxLoad = 50;
    }
}
