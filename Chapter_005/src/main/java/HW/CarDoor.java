package HW;
/**
 *  Хранит
 *  состояние двери(открыта/закрыта)
 *  состояние окна (открыто/закрыто)
 *  Конструктор
 *  Один без аргументов. Он должен присвоить переменным значения на случай если данных нет.
 *  Один конструктор принимает оба состояния, двери и окна. Присваивает эти значения переменным внутри объекта.
 *  Методы
 *  открыть дверь
 *  закрыть дверь
 *  открыть/закрыть дверь (если дверь открыта и вызывается эта функция, значит дверь необходимо закрыть и наоборот)
 *  открыть окно
 *  закрыть окно
 *  открыть/закрыть окно(если дверь открыта и вызывается эта функция, значит дверь необходимо закрыть и наоборот)
 *  Вывести в консоль данные об объекте*/

class CarDoor {
    private boolean window;
    private boolean door;

    public boolean isWindow() {
        return window;
    }

    public void setWindow(boolean window) {
        this.window = window;
    }

    public boolean isDoor() {
        return door;
    }

    public void setDoor(boolean door) {
        this.door = door;
    }

    public CarDoor()
    {
        setWindow(false);
        setDoor(true);
    }
    public CarDoor(boolean window, boolean door)
    {
        this.setWindow(window);
        this.setDoor(door);
    }

    public void openDoor()
    {
        System.out.println("Дверь открыли");
        this.door = true;
    }

    public void closeDoor()
    {
        System.out.println("Дверь закрыли");
        this.door = false;
    }
    public void reverseDoor()
    {
        if (this.door)
        {
            this.door =  false;
            System.out.println("Дверь закрыли");
        }
        else{
            this.door = true;
            System.out.println("Дверь открыли");
        }
    }
    public void openWindow()
    {
        System.out.println("Окно открыли");
        this.window = true;
    }

    public void closeWindow()
    {
        System.out.println("Окно закрыли");
        this.window = false;
    }
    public void reverseWindow()
    {
        if (this.window)
        {
            this.window =  false;
            System.out.println("Окно закрыли");
        }
        else{
            this.window = true;
            System.out.println("Окно открыли");
        }
    }

    public void Show()
    {
        if (this.window)System.out.println("Окно открыто");
        else System.out.println("Окно закрыто");
        if (this.door)System.out.println("Дверь открыта");
        else System.out.println("Дверь закрыта");
    }

    @Override
    public String toString() {
        return String.valueOf(door);
    }
}
