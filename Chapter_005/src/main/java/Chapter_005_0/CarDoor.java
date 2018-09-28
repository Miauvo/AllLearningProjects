package Chapter_005_0;

public class CarDoor {
    private boolean openDoor = true;
    private boolean openWindow = true;

    //Конструкторы
    public CarDoor() {
        this.openDoor = false;
        this.openWindow = true;
    }

    public CarDoor(boolean openDoor, boolean openWindow) {
        this.openDoor = openDoor;
        this.openWindow = openWindow;
    }

    //Методы дверей
    public void openTheDoor(){
        this.openDoor = true;
    }
    public void closeTheDoor(){
        this.openDoor = false;
    }
    public void ReversedStateDoor(){
        if(this.openDoor == true)
            this.openDoor = false;
        else
            this.openDoor = true;
    }

    //Методы окон
    public void openTheWindow(){
        this.openWindow = true;
    }
    public void closeTheWindow(){
        this.openWindow = false;
    }
    public void ReversedStateWindow(){
        if(this.openWindow == true)
            this.openWindow = false;
        else
            this.openWindow = true;
    }


    public String ShowDoors() {
        return "Door{open:" + openDoor + "}";
    }
    public String ShowWindows() {
        return "Window{open:" + openWindow + "}";
    }

    @Override
    public String toString() {
        return ShowDoors()+" "+ ShowWindows();
    }
}
