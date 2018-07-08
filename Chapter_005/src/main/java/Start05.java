import Chapter_005_0.Start_005_0;
import Chapter_005_1.Start_005_1;
import Chapter_005_2.Start_005_2;
import Chapter_005_3.Start_005_3;

import java.util.Scanner;

public class Start05 {

    final static String LINES_SEPARATOR = "\u001B[32m********************************************************\u001B[0m";
    public static int tryParse(Object obj) {
        Integer retVal;
        try {
            retVal = Integer.parseInt((String) obj);
        } catch (NumberFormatException nfe) {
            retVal = 0; // or null if that is your preference
        }
        return retVal;
    }

    public static void main(String[] args) {
        System.out.println(LINES_SEPARATOR+"\n\u001B[32mТема 5:\n"+LINES_SEPARATOR +"\u001B[0m");
        Scanner sc = new Scanner(System.in);
        int choise = 0;
        do {
            System.out.println("Какую задачу Вы хотите решить?(от 0 до 3):");
            choise = tryParse(sc.nextLine());
            switch (choise) {
                case 0:
                    new Start_005_0();
                    break;
                case 1:
                    new Start_005_1();
                    break;
                case 2:
                    new Start_005_2();
                    break;
                case 3:
                    new Start_005_3();
                    break;
                default:
                    System.out.println("Bye-bye ♥ ");
                    return;
            }

            System.out.println("\nПродолжить просмотр програм? (1 ► Да, 0 ► Нет)");
            choise = tryParse(sc.nextLine());

        } while (choise == 1);
        System.out.println("Bye-bye ♥ ");
    }


}
