package HW.HW_1;

class CarWheel {
    /**Хранит
     *  Состояние целостности шины (дробное число от 0-стерта до 1-новая)
     *  Конструктор
     *  Аналогичный принцип как в классе CarDoor
     *  Методы
     *  Сменить шину на новую
     *  Стереть шину на X%
     *  Получить состояние (return)
     *  Вывести в консоль данные об объекте
     */
    private double shina;
    /**Состояние целостности шины (дробное число от 0-стерта до 1-новая)*/
    public double getShina() {
        return shina;
    }

    /**Состояние целостности шины (дробное число от 0-стерта до 1-новая)*/
    public void setShina(double shina) {
        this.shina = shina;
    }

    public CarWheel()
    {
        setShina(1.0);
    }
    public CarWheel(double shina)
    {
        setShina(shina);
    }
    public void setNewShina()
    {
        setShina(1.0);
    }

    public void setShinaDamge(double damagePercent)
    {
        setShina(getShina()*(damagePercent/100));
    }

    public void Show()
    {
        System.out.println("Состояние шины, износ :" + getShina());
    }

    @Override
    public String toString() {
        return String.valueOf(getShina());
    }
}
