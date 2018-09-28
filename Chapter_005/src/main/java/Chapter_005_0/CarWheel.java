package Chapter_005_0;

public class CarWheel {
    /**Состояние целостности шины (дробное число от 0-стерта до 1-новая)*/
    private float busIntegrity;

    /**Состояние целостности шины (дробное число от 0-стерта до 1-новая)*/
    public float getBusIntegrity() {
        return busIntegrity;
    }
    /**Состояние целостности шины (дробное число от 0-стерта до 1-новая)*/
    public void setBusIntegrity(float busIntegrity) {
        this.busIntegrity = busIntegrity;
    }
    /**конструктор, Состояние целостности=1*/
    public CarWheel() {
        this.busIntegrity = 1;
    }

    /**конструктор, Состояние целостности=busIntegrity*/
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
        return "CarWheel{" + busIntegrity +
                '}';
    }
}
