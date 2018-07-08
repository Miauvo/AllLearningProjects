package Chapter_005_0;

public class CarWheel {
    private float busIntegrity; //Состояние целостности шины (дробное число от 0-стерта до 1-новая)

    public float getBusIntegrity() {
        return busIntegrity;
    }

    public void setBusIntegrity(float busIntegrity) {
        this.busIntegrity = busIntegrity;
    }

    public CarWheel() {
        this.busIntegrity = 1;
    }

    public CarWheel(float busIntegrity) {
        this.busIntegrity = busIntegrity;
    }

    private void newCarWheel(){
        setBusIntegrity(1);
    }

    private void changeCarWheel(float percent){
        setBusIntegrity(getBusIntegrity()-getBusIntegrity()/percent);
    }
    private float stateCarWheel(){
        return getBusIntegrity();
    }

    @Override
    public String toString() {
        return "CarWheel{" +
                "busIntegrity=" + busIntegrity +
                '}';
    }
}
