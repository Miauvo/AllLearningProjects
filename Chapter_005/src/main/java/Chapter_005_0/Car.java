package Chapter_005_0;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;

enum  EngineType {
    Бензиновый, Дизельный, Електричекий, Другое
}

public class Car {
    private DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss:S");

    /** дата производства (неизменна после создания объекта)*/
    private LocalDate date;
    /**тип двигателя*/
    private  EngineType engineType;
    /**максимальная скорость машины (если она новая)*/
    private Double maxSpeed;
    /**время разгона до 100км/ч*/
    private LocalTime accelerationTime;

    /**пассажировместимость*/
    private byte passengerCapacity;
    /**кол-во пассажиров внутри в данный момент*/
    private byte numberOfPassenger;
    /**текущая скорость*/
    private Double currentSpeed;
    /**массив колес*/
    CarWheel [] carWheels;
    /**массив дверей*/
    CarDoor [] carDoors;

    /** */
    public LocalDate getDate() {
        return date;
    }
    /** */
    public EngineType getEngineType() {
        return engineType;
    }

    /** */
    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    /** */
    public Double getMaxSpeed() {return maxSpeed;}

    /** */
    public LocalTime getAccelerationTime() {
        return accelerationTime;
    }

    /** */
    public byte getPassengerCapacity() {
        return passengerCapacity;
    }

    /** */
    public byte getNumberOfPassenger() {
        return numberOfPassenger;
    }

    /** */
    private void setNumberOfPassenger(byte numberOfPassenger) {
        if (currentSpeed==0)
            this.numberOfPassenger = numberOfPassenger;
        else
            System.out.println("\u001B[32m" + "Не выпрыгивать из машины! Мы едем!" + "\u001B[0m");
    }

    /** */
    public Double getCurrentSpeed() {
        return currentSpeed;
    }

    /** */
    private void setCurrentSpeed(Double currentSpeed) {
       if (numberOfPassenger>0)
        this.currentSpeed = currentSpeed;
       else
           System.out.println("\u001B[32m" + "Машина без водителя!" + "\u001B[0m");
    }

    /** */
    public Car(LocalDate date) {
        this(
                date,
                EngineType.Бензиновый,
                120.50,
                LocalTime.of(21, 30, 59, 11001),
                (byte)4,
                (byte)0,
                0.0);
    }

    /** */
    public Car( LocalDate date, EngineType engineType, Double maxSpeed, LocalTime accelerationTime, byte passengerCapacity, byte numberOfPassenger, Double currentSpeed) {
        this.date = date;
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.accelerationTime = accelerationTime;
        this.passengerCapacity = passengerCapacity;
        this.numberOfPassenger = numberOfPassenger;
        this.currentSpeed = currentSpeed;

        carWheels = new CarWheel[4];
        carDoors = new CarDoor[4];
        for (int i = 0; i < 4; i++) {
            carWheels[i] = new CarWheel();
            carDoors[i] = new CarDoor();

        }
    }

    /** Изменить текущую скорость */
    public void changeSpeed(double newSpeed){
        if (newSpeed>=0)
            setCurrentSpeed(newSpeed);
    }

    /** Посадить 1 пассажира в машину */
    public boolean addPassager(){

        if (currentSpeed!=0){
            System.out.println("\u001B[32m" + "Не запрыгивать в машину! Мы едем!" + "\u001B[0m");
            return false;
        }

        byte b = (byte)(getNumberOfPassenger()+1);

        if(b>getPassengerCapacity())
            return false;

        setNumberOfPassenger(b);
        return true;
    }

    /** Высадить 1 пассажира  */
    public boolean removePassager(){

        if (currentSpeed!=0){
            System.out.println("\u001B[32m" + "Не выкидывать пасажиров из машины! Мы едем!" + "\u001B[0m");
            return false;
        }

        byte b = (byte)(getNumberOfPassenger()-1);

        if(b<0)
            return false;

        setNumberOfPassenger(b);
        return true;
    }

    /** Высадить всех пассажиров */
    public void removeAllPassagers(){

        if (currentSpeed!=0){
            System.out.println("\u001B[32m" + "Сбежать не получиться! Мы едем!" + "\u001B[0m");
            return;
        }

        if(removePassager()==true)
            removeAllPassagers();
    }

    /**  Получить дверь по индексу */
    public CarDoor getDoorOfIndex(int index){
        if (index>=0&&index<this.carDoors.length)
            return this.carDoors[index];
        throw null;
    }

    /**Получить колесо по индексу */
    public CarWheel getWheelOfIndex(int index){
        if (index>=0&&index<this.carDoors.length)
            return this.carWheels[index];
        throw null;
    }

    /** Снять все колеса с машины */
    public void removeAllWheels(){
        for (int i = 0; i < carWheels.length; i++) {
            carWheels[i]=null;
        }
    }

    /** Установить на машину X новых колес*/
    public void addXWheels(int x){
        int number =this.carWheels.length+x;
        CarWheel [] newCarWheel = new CarWheel[number];
        for (int i = 0; i < number; i++) {
            if (i<this.carWheels.length)
                newCarWheel[i]=this.carWheels[i];
            else
                newCarWheel[i]=new CarWheel();
        }
        this.carWheels = newCarWheel;
    }

    /** Вычислить текущую возможную максимальную скорость */
    public double maxCarSpeed(){
        if(getNumberOfPassenger()==0)
            return 0;

        if (carWheels[0]==null)
            return 0;

        float min = carWheels[0].getBusIntegrity();
        for (int i = 0; i < this.carWheels.length; i++) {
            if (carWheels[i]==null)
                return 0;
            if(min>carWheels[i].getBusIntegrity())
                min=carWheels[i].getBusIntegrity();
        }
        return min*getMaxSpeed();
    }

    @Override
    public String toString() {
        return "Car{" +"\n"+
                " дата производства: " + date +"\n"+
                " тип двигателя: " + engineType +"\n"+
                " максимальная скорость машины:" + maxSpeed +"\n"+
                " время разгона:" + accelerationTime +"\n"+
                " пассажировместимость:" + passengerCapacity +"\n"+
                " кол-во пассажиров внутри в данный момент: " + numberOfPassenger +"\n"+
                " текущая скорость:" + currentSpeed +"\n"+
                " массив колес:" + Arrays.toString(carWheels) +"\n"+
                " массив дверей:" + Arrays.toString(carDoors) +"\n"+
                '}';
    }
}
