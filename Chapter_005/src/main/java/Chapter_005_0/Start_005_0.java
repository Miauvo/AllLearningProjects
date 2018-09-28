package Chapter_005_0;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class Start_005_0 {

    final static String LINES_SEPARATOR = "\u001B[32m--------------------------------------------------\u001B[0m";

    public static int tryParse(Object obj) {
        Integer retVal;
        try {
            retVal = Integer.parseInt((String) obj);
        } catch (NumberFormatException nfe) {
            retVal = 0; // or null if that is your preference
        }
        return retVal;
    }


    public static double tryParseDouble(Object obj) {
        Double retVal;
        try {
            retVal = Double.parseDouble((String) obj);
        } catch (NumberFormatException nfe) {
            retVal = 0.0; // or null if that is your preference
        }
        return retVal;
    }

    public Start_005_0() {
        System.out.println(LINES_SEPARATOR + "\n\u001B[32mТема 5:\n" + LINES_SEPARATOR + "\u001B[0m");
        Scanner sc = new Scanner(System.in);
        Car car = new Car(LocalDate.now());
        int choise = 0;
        double choiseD = 0.0;

        do {
            System.out.println("Какую задачу Вы хотите решить?:");
            System.out.println("" +
                    "1 – Изменить текущую скорость " + "\n" +
                    "2 – Посадить 1 пассажира в машину " + "\n" +
                    "3 – Высадить 1 пассажира " + "\n" +
                    "4 – Высадить всех пассажиров " + "\n" +
                    "5 – Получить дверь по индексу " + "\n" +
                    "6 – Получить колесо по индексу " + "\n" +
                    "7 – Снять все колеса с машины " + "\n" +
                    "8 – Установить на машину X новых колесу " + "\n" +
                    "9 – Вычислить текущую возможную максимальную скорость" + "\n" +
                    "10 – Вывести в консоль данные об объекте");
            choise = tryParse(sc.nextLine());

            switch (choise) {
                case 1:
                    System.out.print("Новая текущая скорость (Напр.: 1.25) =");
                    choiseD = tryParseDouble(sc.nextLine());
                    double speed = car.getCurrentSpeed();
                    car.changeSpeed(choiseD);
                    System.out.println("\u001B[36;2m"+"Изменение скорости c " + speed + " на " + car.getCurrentSpeed()+"\u001B[0m");
                    break;
                case 2:
                    car.addPassager();
                    break;
                case 3:
                    car.removePassager();
                    break;
                case 4:
                    car.removeAllPassagers();
                    break;
                case 5:
                    System.out.print("\u001B[36;2m"+"Индекс двери:" +"\u001B[0m");
                    int door = tryParse(sc.nextLine());
                    try {
                        System.out.print("\u001B[36;2m"+car.getDoorOfIndex(door) +"\u001B[0m");
                    }
                    catch (Exception e){
                        System.out.println("\u001B[32m" + "Нет такой" + "\u001B[0m");
                    }

                    break;
                case 6:
                    System.out.print("\u001B[36;2m"+"Индекс окна:" +"\u001B[0m");
                    int wheel = tryParse(sc.nextLine());
                    try {
                        System.out.print("\u001B[36;2m"+  car.getWheelOfIndex(wheel) +"\u001B[0m");
                    }
                    catch (Exception e){
                        System.out.println("\u001B[32m" + "Нет такого" + "\u001B[0m");
                    }
                    break;
                case 7:
                    car.removeAllWheels();
                    break;
                case 8:
                    car.addXWheels(5);
                    break;
                case 9:
                    car.maxCarSpeed();
                    break;
                default:
                    System.out.println("No found ☺ ");
                    return;
            }
            System.out.println(car);
        } while (choise != 0);
        System.out.println("Bye-bye ♥ ");

    }
}
