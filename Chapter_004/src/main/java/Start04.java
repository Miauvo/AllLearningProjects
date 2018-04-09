import HW.*;
import Practice.*;

import java.util.Scanner;

public class Start04 {
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
        System.out.println(LINES_SEPARATOR+"\n\u001B[32mПрактика:\n"+LINES_SEPARATOR +"\u001B[0m");
        Practice_04_ZD1 practice_04_zd1 = new Practice_04_ZD1();
        Practice_04_ZD2 practice_04_zd2 = new Practice_04_ZD2();
        Practice_04_ZD3 practice_04_zd3 = new Practice_04_ZD3();


        System.out.println(LINES_SEPARATOR+"\n\u001B[32mДомашнее задание:\n"+LINES_SEPARATOR +"\u001B[0m");
        Scanner sc = new Scanner(System.in);
        int choise = 0;
        do {
            System.out.println("Какую задачу Вы хотите решить?(от 1 до 6):");
            choise = tryParse(sc.nextLine());
            switch (choise) {
                case 1:
                    HW_04_ZD1 hw_04_zd1 = new HW_04_ZD1();
                    break;
                case 2:
                    HW_04_ZD2 hw_04_zd2 = new HW_04_ZD2();
                    break;
                case 3:
                    HW_04_ZD3 hw_04_zd3 = new HW_04_ZD3();
                    break;
                case 4:
                    HW_04_ZD4 hw_04_zd4 = new HW_04_ZD4();
                    break;
                case 5:
                    HW_04_ZD5 hw_04_zd5 = new HW_04_ZD5();
                    break;
                case 6:
                    HW_04_ZD6 hw_04_zd6 = new HW_04_ZD6();
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
