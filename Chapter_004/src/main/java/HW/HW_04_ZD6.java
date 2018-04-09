package HW;

import java.util.Scanner;

public class HW_04_ZD6 {
    public  void ZD6 (int x, int y)
    {
        //!! Одним методом не придумала
        if (x-->0)
        {
            ZD6_2 (y);
            System.out.println("");
            ZD6(x,y);

        }
    }

    public void ZD6_2 (int y)
    {
        if (y-->=0)
        {
            System.out.print("+");
            ZD6_2 (y);
        }
    }

    public HW_04_ZD6() {
        System.out.println("\n\u001B[34m Задание 6:\u001B[0m");
        Scanner sc = new Scanner(System.in);

        System.out.print("Ширина (Напр.:5)=");
        int n = sc.nextInt();
        System.out.print("Высота (Напр.:8)=");
        int m = sc.nextInt();
        ZD6(n,m);

    }
}
