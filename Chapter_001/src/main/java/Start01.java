import HW.HomeWork01;
import practice.*;

public class Start01 {
    final static String LINES_SEPARATOR = "\u001B[32m********************************************************\u001B[0m";
    public static void main(String[] args) {
        System.out.println(LINES_SEPARATOR+"\n\u001B[32mПрактика:\n"+LINES_SEPARATOR +"\u001B[0m");
        PreStart preStart = new PreStart();
        new Practice_01_ZD1();
        new Practice_01_ZD2();
        new Practice_01_ZD3();
        new Practice_01_ZD4();
        System.out.println(LINES_SEPARATOR+"\n\u001B[32mДомашнее задание:\n"+LINES_SEPARATOR +"\u001B[0m");
        new HomeWork01();

    }
}
