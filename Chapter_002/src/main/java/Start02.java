import HW.HW_02_ZD1;
import practice.*;

public class Start02 {
    final static String LINES_SEPARATOR = "\u001B[32m********************************************************\u001B[0m";
    public static void main(String[] args) {
        System.out.println(LINES_SEPARATOR+"\n\u001B[32mПрактика:\n"+LINES_SEPARATOR +"\u001B[0m");
        new Practice_02_ZD1();
        new Practice_02_ZD2();
        new Practice_02_ZD3();
        new Practice_02_ZD4();
        new Practice_02_ZD5();
        new Practice_02_ZD6();
        new Practice_02_ZD7();
        new Practice_02_ZD8();
        new Practice_02_ZD9();
        new Practice_02_ZD10();
        int i=0;
        while(i++<3) new Practice_02_ZD11();
        System.out.println(LINES_SEPARATOR+"\n\u001B[32mДомашнее задание:\n"+LINES_SEPARATOR +"\u001B[0m");
        new HW_02_ZD1();

    }
}
