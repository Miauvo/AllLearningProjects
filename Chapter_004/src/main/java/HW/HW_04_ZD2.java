package HW;

import java.util.Scanner;

public class HW_04_ZD2 {
    public  void drawRectangle (int x, int y)
    {
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++)
                System.out.print("+");
            System.out.println("");
        }
    }

    public HW_04_ZD2() {
        System.out.println("\n\u001B[34m Задание 2:\u001B[0m");
        Scanner sc = new Scanner(System.in);

        System.out.print("Ширина (Напр.:5)=");
        int n = sc.nextInt();
        System.out.print("Высота (Напр.:8)=");
        int m = sc.nextInt();
        drawRectangle(n,m);

    }
}
