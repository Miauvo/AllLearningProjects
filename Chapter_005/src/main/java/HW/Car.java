package HW;



        import java.util.Arrays;
        import java.util.Date;

public class Car {
    /**Класс Car
     *  На прямую к переменным этого класса никто не может, только через методы
     *  Хранит
     *  дата производства (неизменна после создания объекта)
     *  тип двигателя
     *  максимальная скорость машины (если она новая)
     *  время разгона до 100км/ч
     *  пассажировместимость
     *  кол-во пассажиров внутри в данный момент
     *  текущая скорость
     *  массив колес
     *  массив дверей
     *
     *  Конструктор
     *  Нет пустого конструктора. Так как есть поля в классе,
     *  которые нельзя изменять после создания объекта. Например дата производства.
     *
     *  Конструктор с датой производства.
     *  Конструктор со всеми полями, кроме массива колес и массива дверей.
     *  Методы
     *  Изменить текущую скорость
     *  Посадить 1 пассажира в машину
     *  Высадить 1 пассажира
     *  Высадить всех пассажиров
     *  Получить дверь по индексу
     *  Получить колесо по индексу
     *  Снять все колеса с машины
     *  Установить на машину X новых колесу (
     *  вдобавок к имеющимся, то есть если было 4 колеса, после вызова метода с Х аргументом равным трем, колес будет 4+3=7)
     *  Вычислить текущую возможную максимальную скорость (Скорость машины вычисляется так.
     *  Максимальная скорость новой машины множиться на самое стертое колесо в машине.
     *  Максимальная скорость равна 0 если в машине нет ни одного пассажира, так как некому ее вести)
     *  Вывести в консоль данные об объекте (все поля и вычисленную максимальную скорость в зависимости от целостности колес и наличия водителя)*/

    private final Date date;// дата производства (неизменна после создания объекта)
    private String TypeMotor; //тип двигателя
    private double maxSpeed; // максимальная скорость машины (если она новая)
    private Date timeRacing;// время разгона до 100км/ч
    private int capacity;//пассажировместимость
    private int passengers;// кол-во пассажиров внутри в данный момент
    private double currentSpeed;//текущая скорость
    private CarWheel[]wheel;//массив колес
    private CarDoor[]door;//массив дверей

    public Date getDate() {
        return date;
    }

    public String getTypeMotor() {
        return TypeMotor;
    }

    public void setTypeMotor(String typeMotor) {
        TypeMotor = typeMotor;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Date getTimeRacing() {
        return timeRacing;
    }

    public void setTimeRacing(Date timeRacing) {
        this.timeRacing = timeRacing;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    private int getPassengers() {
        return passengers;
    }

    private void setPassengers(int passengers) {
        if(passengers<0) {
            this.passengers=0;
            System.out.println("В машине нет пассажиров.");
            return;
        }
        if(passengers>capacity) {
            System.out.println("В машину столько не влазит");
            return;
        }

        this.passengers = passengers;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    private CarWheel[] getWheel() {
        if (wheel.equals(null))
            return new CarWheel[0];

        return wheel;
    }

    private void setWheel(CarWheel[] wheel) {
        this.wheel = wheel;
    }

    private CarDoor[] getDoor() {
        if (door.equals(null))
            return new CarDoor[0];
        return door;
    }

    private void setDoor(CarDoor[] door) {
        this.door = door;
    }

    public Car(Date date, String typeMotor, double maxSpeed, Date timeRacing, int capacity, int passengers, double currentSpeed) {
        this.date = date;
        TypeMotor = typeMotor;
        this.maxSpeed = maxSpeed;
        this.timeRacing = timeRacing;
        this.capacity = capacity;
        this.passengers = passengers;
        this.currentSpeed = currentSpeed;
        wheel = new CarWheel[4];
        door = new CarDoor[4];
        for (int i =0; i<4;i++)
        {
            wheel[i] = new CarWheel(1);
            door[i] = new CarDoor();
        }
    }

    /**Посадить 1 пассажира в машину*/
    public void putPassenger () {
        setPassengers(getPassengers()+1);
    }
    /**Высадить 1 пассажира*/
    public void outputPassenger () {
        setPassengers(getPassengers()-1);
    }
    /**Высадить всех пассажиров*/
    public void outputAllPassenger () {
        setPassengers(0);
    }
    /**Получить дверь по индексу*/
    public CarDoor doorOfIndex (int i) {
        if ((i>=getDoor().length)||(i<0)){
            System.out.println("В машине нет такой двери");
            return null;
        }
        else
            return getDoor()[i];
    }

    /**Получить колесо по индексу*/
    public CarWheel wheelOfIndex (int i) {
        if ((i>=getWheel().length)||(i<0)){
            System.out.println("В машине нет такого колеса");
            return null;
        }
        else
            return getWheel()[i];
    }

    /**Снять все колеса с машины*/
    public void wheelClear () {
        setWheel(null);
    }

    /**Установить на машину X новых колеса*/
    public void addWheel(int X) {
        CarWheel[] load = getWheel();
        CarWheel[] test = new CarWheel[load.length+X];
        System.arraycopy (load, load.length, test, 0, load.length);
        for(int i = load.length-1; i<test.length;i++){
            test[i]= new CarWheel();
        }
        setWheel(test);
    }
    /**Максимальная скорость*/
    public double maxCurrentSpeed() {
        if (getPassengers() == 0) return 0;


        CarWheel[] loadWheel = getWheel();
        CarWheel cw = loadWheel[0];
//        for (CarWheel wheel : loadWheel) {
//            if (wheel.getShina() < cw.getShina()) cw.setShina(wheel.getShina());
//        }
        return 0;// getMaxSpeed()*cw.getShina();
    }

    /**Вывести в консоль данные об объекте (все поля и вычисленную максимальную скорость в зависимости от целостности колес и наличия водителя)*/
    public void Show() {
        System.out.println("Date:"+getDate());
        System.out.println("TypeMotor:"+getTypeMotor());
        System.out.println("MaxSpeed:"+getMaxSpeed());
        System.out.println("TimeRacing:"+getTimeRacing());
        System.out.println("Capacity:"+getCapacity());
        System.out.println("Passengers:"+getPassengers());
        System.out.println("CurrentSpeed:"+getCurrentSpeed());
        System.out.println("CarWheel:"+Arrays.toString(getWheel()));
        System.out.println("CarDoor:"+Arrays.toString(getDoor()));
        System.out.println("maxCurrentSpeed:"+maxCurrentSpeed());
    }
}
