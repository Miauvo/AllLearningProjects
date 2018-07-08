package Chapter_005_0;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

enum  EngineType {
    Бензиновый, Дизельный, Електричекий, Другое
}

public class Car {
    private DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss:S");

    /** дата производства (неизменна после создания объекта)*/
    private  Date date;
    /**тип двигателя*/
    private  EngineType engineType;
    /**максимальная скорость машины (если она новая)*/
    private Double maxSpeed;
    /**время разгона до 100км/ч*/
    private Date accelerationTime;

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


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public Double getMaxSpeed() {
        return maxSpeed;
    }

    public Date getAccelerationTime() {
        return accelerationTime;
    }

    public byte getPassengerCapacity() {
        return passengerCapacity;
    }

    public byte getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public void setNumberOfPassenger(byte numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    public Double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(Double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public Car(Date date,
               EngineType engineType,
               Double maxSpeed,
               Date accelerationTime,
               byte passengerCapacity,
               byte numberOfPassenger,
               Double currentSpeed) {
        this.date = date;
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.accelerationTime = accelerationTime;
        this.passengerCapacity = passengerCapacity;
        this.numberOfPassenger = numberOfPassenger;
        this.currentSpeed = currentSpeed;
    }
    public Car(Date date) {
        this.date = date;
        this.engineType = EngineType.Бензиновый;
        //this.maxSpeed = 500;
       // this.accelerationTime = new
      //  this.accelerationTime = new Date()
        this.passengerCapacity = passengerCapacity;
        this.numberOfPassenger = numberOfPassenger;
        this.currentSpeed = currentSpeed;
    }
}
