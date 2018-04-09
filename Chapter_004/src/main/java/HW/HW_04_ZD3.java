package HW;

import java.util.Scanner;

public class HW_04_ZD3 {
    public  void drawRectangle (int x)
    {
        for(int i=0; i<x; i++){
            for(int j=0; j<x; j++)
                System.out.print("☺");
            System.out.println("");
        }
    }


    public HW_04_ZD3() {
        System.out.println("\n\u001B[34m Задание 3:\u001B[0m");
        Scanner sc = new Scanner(System.in);

        System.out.print("Ширина квадрата (Напр.:5)=");
        int n = sc.nextInt();

        drawRectangle(n);

    }
}
